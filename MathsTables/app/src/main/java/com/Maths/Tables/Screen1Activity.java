package com.Maths.Tables;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
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
import android.widget.TextView;
import android.widget.Button;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdRequest;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.content.SharedPreferences;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.Timer;
import java.util.TimerTask;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdListener;
import android.view.View;

public class Screen1Activity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private DrawerLayout _drawer;
	private double adshow = 0;
	
	private ScrollView vscroll1;
	private LinearLayout linear9;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private TextView textview1;
	private TextView valueid;
	private Button continueid;
	private Button selectanotherid;
	private TextView textview5;
	private Button hindiid;
	private Button englishid;
	private AdView adview1;
	private ScrollView _drawer_vscroll1;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear2;
	private LinearLayout _drawer_linear3;
	private Button _drawer_choosenumber;
	private Button _drawer_testyourself;
	private Button _drawer_voicesetting;
	private TextView _drawer_textview2;
	private TextView _drawer_textview1;
	
	private Intent intent = new Intent();
	private SharedPreferences data;
	private AlertDialog.Builder dialog;
	private TimerTask timer;
	private InterstitialAd interstitialads;
	private AdListener _interstitialads_ad_listener;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.screen1);
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
		_drawer = (DrawerLayout) findViewById(R.id._drawer);ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(Screen1Activity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		textview1 = (TextView) findViewById(R.id.textview1);
		valueid = (TextView) findViewById(R.id.valueid);
		continueid = (Button) findViewById(R.id.continueid);
		selectanotherid = (Button) findViewById(R.id.selectanotherid);
		textview5 = (TextView) findViewById(R.id.textview5);
		hindiid = (Button) findViewById(R.id.hindiid);
		englishid = (Button) findViewById(R.id.englishid);
		adview1 = (AdView) findViewById(R.id.adview1);
		_drawer_vscroll1 = (ScrollView) _nav_view.findViewById(R.id.vscroll1);
		_drawer_linear1 = (LinearLayout) _nav_view.findViewById(R.id.linear1);
		_drawer_linear2 = (LinearLayout) _nav_view.findViewById(R.id.linear2);
		_drawer_linear3 = (LinearLayout) _nav_view.findViewById(R.id.linear3);
		_drawer_choosenumber = (Button) _nav_view.findViewById(R.id.choosenumber);
		_drawer_testyourself = (Button) _nav_view.findViewById(R.id.testyourself);
		_drawer_voicesetting = (Button) _nav_view.findViewById(R.id.voicesetting);
		_drawer_textview2 = (TextView) _nav_view.findViewById(R.id.textview2);
		_drawer_textview1 = (TextView) _nav_view.findViewById(R.id.textview1);
		data = getSharedPreferences("data", Activity.MODE_PRIVATE);
		dialog = new AlertDialog.Builder(this);
		
		continueid.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
				finish();
			}
		});
		
		selectanotherid.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Screen2Activity.class);
				startActivity(intent);
				finish();
			}
		});
		
		hindiid.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("language", "hindi").commit();
				hindiid.setBackgroundColor(0xFF8BC34A);
				englishid.setBackgroundColor(0xFF9E9E9E);
				_intadshow();
			}
		});
		
		englishid.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("language", "english").commit();
				englishid.setBackgroundColor(0xFF8BC34A);
				hindiid.setBackgroundColor(0xFF9E9E9E);
				_intadshow();
			}
		});
		
		_drawer_choosenumber.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Screen2Activity.class);
				startActivity(intent);
				finish();
			}
		});
		
		_drawer_testyourself.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), Test1Activity.class);
				startActivity(intent);
				finish();
			}
		});
		
		_drawer_voicesetting.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				startActivity(Build.VERSION.SDK_INT >= 14 ? new Intent().setAction("com.android.settings.TTS_SETTINGS").setFlags(Intent.FLAG_ACTIVITY_NEW_TASK) : new Intent().addCategory(Intent.CATEGORY_LAUNCHER).setComponent(new ComponentName("com.android.settings", "com.android.settings.TextToSpeechSettings")).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)); 
				
				
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
				interstitialads.loadAd(new AdRequest.Builder().build());
			}
		};
	}
	private void initializeLogic() {
		if (data.getString("data", "").equals("")) {
			valueid.setText("2");
			data.edit().putString("data", "2").commit();
		}
		else {
			valueid.setText(data.getString("data", ""));
		}
		if (data.getString("language", "").equals("")) {
			data.edit().putString("language", "english").commit();
		}
		if (data.getString("language", "").equals("english")) {
			hindiid.setBackgroundColor(0xFF9E9E9E);
			englishid.setBackgroundColor(0xFF8BC34A);
		}
		else {
			hindiid.setBackgroundColor(0xFF8BC34A);
			englishid.setBackgroundColor(0xFF9E9E9E);
		}
		adview1.loadAd(new AdRequest.Builder().addTestDevice("4DA114242B04025B7B135C6FB8F8AC21")
		.build());
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
		_interstitialad();
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
		finishAffinity();
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
