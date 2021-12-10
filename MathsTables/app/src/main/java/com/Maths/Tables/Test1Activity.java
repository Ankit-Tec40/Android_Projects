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
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdRequest;
import android.app.Activity;
import android.content.SharedPreferences;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import java.util.Timer;
import java.util.TimerTask;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdListener;
import android.view.View;

public class Test1Activity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private double adshow = 0;
	
	private ScrollView vscroll1;
	private LinearLayout linear5;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private TextView textview1;
	private EditText initialvalueid;
	private TextView textview3;
	private EditText lastvalueid;
	private Button startid;
	private AdView adview1;
	
	private SharedPreferences data;
	private AlertDialog.Builder dialog;
	private Intent intent = new Intent();
	private TimerTask timer;
	private InterstitialAd interstitialads;
	private AdListener _interstitialads_ad_listener;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.test1);
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
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		textview1 = (TextView) findViewById(R.id.textview1);
		initialvalueid = (EditText) findViewById(R.id.initialvalueid);
		textview3 = (TextView) findViewById(R.id.textview3);
		lastvalueid = (EditText) findViewById(R.id.lastvalueid);
		startid = (Button) findViewById(R.id.startid);
		adview1 = (AdView) findViewById(R.id.adview1);
		data = getSharedPreferences("data", Activity.MODE_PRIVATE);
		dialog = new AlertDialog.Builder(this);
		
		startid.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (initialvalueid.getText().toString().equals("") || lastvalueid.getText().toString().equals("")) {
					dialog.setMessage("Enter the value between 2 and 50");
					dialog.create().show();
				}
				else {
					if ((Double.parseDouble(initialvalueid.getText().toString()) > 1) && ((Double.parseDouble(initialvalueid.getText().toString()) < 51) && ((Double.parseDouble(lastvalueid.getText().toString()) > 1) && ((Double.parseDouble(lastvalueid.getText().toString()) < 51) && ((Double.parseDouble(lastvalueid.getText().toString()) > Double.parseDouble(initialvalueid.getText().toString())) || (Double.parseDouble(lastvalueid.getText().toString()) == Double.parseDouble(initialvalueid.getText().toString()))))))) {
						data.edit().putString("initialvalue", initialvalueid.getText().toString()).commit();
						data.edit().putString("finalvalue", lastvalueid.getText().toString()).commit();
						data.edit().putString("intentfrom", "mixedtest").commit();
						intent.setClass(getApplicationContext(), Screen4Activity.class);
						startActivity(intent);
						finish();
					}
					else {
						dialog.setMessage("Enter the value between 2 and 50");
						dialog.create().show();
					}
				}
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
		intent.setClass(getApplicationContext(), Screen1Activity.class);
		startActivity(intent);
		_intadshow();
		finish();
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
