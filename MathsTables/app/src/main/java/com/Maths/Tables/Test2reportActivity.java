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
import android.widget.Button;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdRequest;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.content.SharedPreferences;
import java.util.Timer;
import java.util.TimerTask;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdListener;
import android.view.View;

public class Test2reportActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private double adshow = 0;
	
	private ScrollView vscroll1;
	private LinearLayout linear5;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear6;
	private LinearLayout linear4;
	private LinearLayout linear7;
	private TextView textview1;
	private TextView scoreid;
	private TextView textview3;
	private TextView textview4;
	private Button resetid;
	private Button reattemptid;
	private Button button1;
	private AdView adview1;
	
	private Intent intent = new Intent();
	private SharedPreferences data;
	private TimerTask timer;
	private InterstitialAd interstitialads;
	private AdListener _interstitialads_ad_listener;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.test2report);
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
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		textview1 = (TextView) findViewById(R.id.textview1);
		scoreid = (TextView) findViewById(R.id.scoreid);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		resetid = (Button) findViewById(R.id.resetid);
		reattemptid = (Button) findViewById(R.id.reattemptid);
		button1 = (Button) findViewById(R.id.button1);
		adview1 = (AdView) findViewById(R.id.adview1);
		data = getSharedPreferences("data", Activity.MODE_PRIVATE);
		
		resetid.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Test1Activity.class);
				startActivity(intent);
				_intadshow();
				finish();
			}
		});
		
		reattemptid.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Screen4Activity.class);
				startActivity(intent);
				_intadshow();
				finish();
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Screen1Activity.class);
				startActivity(intent);
				_intadshow();
				finish();
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
		scoreid.setText(data.getString("report", ""));
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
		intent.setClass(getApplicationContext(), Test1Activity.class);
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
