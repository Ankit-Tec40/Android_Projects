package com.Maths.Tables;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdRequest;
import java.util.Timer;
import java.util.TimerTask;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdListener;
import android.view.View;

public class Screen4Activity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private double value = 0;
	private double randnoforque = 0;
	private double multiplyto = 0;
	private double ans = 0;
	private double listrandomno = 0;
	private double solution = 0;
	private double correctans = 0;
	private double queno = 0;
	private double adshow = 0;
	
	private ArrayList<Double> anslist = new ArrayList<>();
	
	private LinearLayout linear11;
	private ScrollView vscroll1;
	private LinearLayout linear7;
	private LinearLayout linear12;
	private LinearLayout linear10;
	private LinearLayout linear1;
	private LinearLayout linear9;
	private TextView textview6;
	private TextView rangevalueid;
	private TextView textview4;
	private TextView correctansid;
	private TextView textview5;
	private TextView quenoid;
	private TextView textview2;
	private TextView textview3;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private TextView queid;
	private EditText ansid;
	private Button endid;
	private ImageView checkimageid;
	private Button submitid;
	private AdView adview1;
	
	private TimerTask timer;
	private SharedPreferences data;
	private Intent intent = new Intent();
	private AlertDialog.Builder dialog;
	private InterstitialAd interstitialads;
	private AdListener _interstitialads_ad_listener;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.screen4);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		textview6 = (TextView) findViewById(R.id.textview6);
		rangevalueid = (TextView) findViewById(R.id.rangevalueid);
		textview4 = (TextView) findViewById(R.id.textview4);
		correctansid = (TextView) findViewById(R.id.correctansid);
		textview5 = (TextView) findViewById(R.id.textview5);
		quenoid = (TextView) findViewById(R.id.quenoid);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		queid = (TextView) findViewById(R.id.queid);
		ansid = (EditText) findViewById(R.id.ansid);
		endid = (Button) findViewById(R.id.endid);
		checkimageid = (ImageView) findViewById(R.id.checkimageid);
		submitid = (Button) findViewById(R.id.submitid);
		adview1 = (AdView) findViewById(R.id.adview1);
		data = getSharedPreferences("data", Activity.MODE_PRIVATE);
		dialog = new AlertDialog.Builder(this);
		
		endid.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_intenttoreport();
			}
		});
		
		submitid.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_check();
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								_que();
								ansid.setText("");
								queno = Double.parseDouble(quenoid.getText().toString());
								queno++;
								if (queno == 16) {
									data.edit().putString("report", correctansid.getText().toString()).commit();
									if (data.getString("intentfrom", "").equals("test")) {
										intent.setClass(getApplicationContext(), ReportActivity.class);
										startActivity(intent);
										_intadshow();
										finish();
									}
									else {
										intent.setClass(getApplicationContext(), Test2reportActivity.class);
										startActivity(intent);
										_intadshow();
										finish();
									}
								}
								else {
									quenoid.setText(String.valueOf((long)(queno)));
								}
								checkimageid.setImageResource(R.drawable.neutral);
							}
						});
					}
				};
				_timer.schedule(timer, (int)(1000));
			}
		});
		
		_interstitialads_ad_listener = new AdListener() {
			@Override
			public void onAdLoaded() {
				
			}
			
			@Override
			public void onAdFailedToLoad(int _param1) {
				final int _errorCode = _param1;
				
			}
			
			@Override
			public void onAdOpened() {
				
			}
			
			@Override
			public void onAdClosed() {
				
			}
		};
	}
	private void initializeLogic() {
		adview1.loadAd(new AdRequest.Builder().addTestDevice("4DA114242B04025B7B135C6FB8F8AC21")
		.build());
		_que();
		if (data.getString("intentfrom", "").equals("test")) {
			rangevalueid.setText(data.getString("data", ""));
		}
		else {
			rangevalueid.setText(data.getString("initialvalue", "").concat(" to ".concat(data.getString("finalvalue", ""))));
		}
		adview1.loadAd(new AdRequest.Builder().addTestDevice("4DA114242B04025B7B135C6FB8F8AC21")
		.build());
		_interstitialad();
		timer = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						adview1.loadAd(new AdRequest.Builder().addTestDevice("4DA114242B04025B7B135C6FB8F8AC21")
						.build());
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(timer, (int)(10000), (int)(10000));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		_intenttoreport();
	}
	private void _que () {
		if (data.getString("intentfrom", "").equals("test")) {
			value = Double.parseDouble(data.getString("data", ""));
		}
		else {
			value = SketchwareUtil.getRandom((int)(Double.parseDouble(data.getString("initialvalue", ""))), (int)(Double.parseDouble(data.getString("finalvalue", ""))));
		}
		randnoforque = SketchwareUtil.getRandom((int)(1), (int)(2));
		if (randnoforque == 1) {
			multiplyto = SketchwareUtil.getRandom((int)(1), (int)(10));
			queid.setText(String.valueOf((long)(value)).concat("*".concat(String.valueOf((long)(multiplyto)).concat("=".concat("___")))));
			solution = value * multiplyto;
		}
		else {
			if (randnoforque == 2) {
				anslist.add(Double.valueOf(value * 1));
				anslist.add(Double.valueOf(value * 2));
				anslist.add(Double.valueOf(value * 3));
				anslist.add(Double.valueOf(value * 4));
				anslist.add(Double.valueOf(value * 5));
				anslist.add(Double.valueOf(value * 6));
				anslist.add(Double.valueOf(value * 7));
				anslist.add(Double.valueOf(value * 8));
				anslist.add(Double.valueOf(value * 9));
				anslist.add(Double.valueOf(value * 10));
				listrandomno = SketchwareUtil.getRandom((int)(0), (int)(9));
				ans = anslist.get((int)(listrandomno)).doubleValue();
				queid.setText(String.valueOf((long)(value)).concat("*".concat("___".concat("=".concat(String.valueOf((long)(ans)))))));
				solution = ans / value;
			}
		}
		anslist.clear();
	}
	
	
	private void _check () {
		if (String.valueOf((long)(solution)).equals(ansid.getText().toString())) {
			correctans = Double.parseDouble(correctansid.getText().toString());
			correctans++;
			correctansid.setText(String.valueOf((long)(correctans)));
			SketchwareUtil.showMessage(getApplicationContext(), "correct");
			checkimageid.setImageResource(R.drawable.right);
		}
		else {
			SketchwareUtil.showMessage(getApplicationContext(), "incorrect");
			checkimageid.setImageResource(R.drawable.wrong);
		}
	}
	
	
	private void _intenttoreport () {
		dialog.setMessage("Do you want to end test? ");
		dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				data.edit().putString("report", correctansid.getText().toString()).commit();
				if (data.getString("intentfrom", "").equals("test")) {
					intent.setClass(getApplicationContext(), ReportActivity.class);
					startActivity(intent);
					_intadshow();
					finish();
				}
				else {
					intent.setClass(getApplicationContext(), Test2reportActivity.class);
					startActivity(intent);
					_intadshow();
					finish();
				}
			}
		});
		dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				SketchwareUtil.showMessage(getApplicationContext(), "Continue");
			}
		});
		dialog.create().show();
	}
	
	
	private void _interstitialad () {
		interstitialads = new InterstitialAd(getApplicationContext());
		interstitialads.setAdListener(_interstitialads_ad_listener);
		interstitialads.setAdUnitId("ca-app-pub-9831385110285266/3158662565");
		interstitialads.loadAd(new AdRequest.Builder().addTestDevice("4DA114242B04025B7B135C6FB8F8AC21")
		.build());
	}
	
	
	private void _intadshow () {
		adshow = SketchwareUtil.getRandom((int)(1), (int)(5));
		if (adshow == 3) {
			interstitialads.show();
		}
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
