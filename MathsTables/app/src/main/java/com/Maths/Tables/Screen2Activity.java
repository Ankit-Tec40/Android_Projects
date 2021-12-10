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
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Button;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdRequest;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.Intent;
import android.net.Uri;
import java.util.Timer;
import java.util.TimerTask;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdListener;
import android.view.View;

public class Screen2Activity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private double adshow = 0;
	
	private LinearLayout linear3;
	private ScrollView vscroll2;
	private LinearLayout linear24;
	private TextView textview1;
	private LinearLayout linear2;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private LinearLayout linear26;
	private Button buttonof2;
	private Button buttonof3;
	private Button buttonof4;
	private Button buttonof5;
	private Button buttonof6;
	private Button buttonof7;
	private Button buttonof8;
	private Button buttonof9;
	private Button buttonof10;
	private Button buttonof11;
	private Button buttonof12;
	private Button buttonof13;
	private Button buttonof14;
	private Button buttonof15;
	private Button buttonof16;
	private Button buttonof17;
	private Button buttonof18;
	private Button buttonof19;
	private Button buttonof20;
	private Button buttonof21;
	private Button buttonof22;
	private Button buttonof23;
	private Button buttonof24;
	private Button buttonof25;
	private Button buttonof26;
	private Button buttonof27;
	private Button buttonof28;
	private Button buttonof29;
	private Button buttonof30;
	private Button buttonof31;
	private Button buttonof32;
	private Button buttonof33;
	private Button buttonof34;
	private Button buttonof35;
	private Button buttonof36;
	private Button buttonof37;
	private Button buttonof38;
	private Button buttonof39;
	private Button buttonof40;
	private Button buttonof41;
	private Button buttonof42;
	private Button buttonof43;
	private Button buttonof44;
	private Button buttonof45;
	private Button buttonof46;
	private Button buttonof47;
	private Button buttonof48;
	private Button buttonof49;
	private Button buttonof50;
	private AdView adview2;
	
	private SharedPreferences data;
	private Intent intent = new Intent();
	private TimerTask timer;
	private InterstitialAd Interstitialads;
	private AdListener _Interstitialads_ad_listener;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.screen2);
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
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		vscroll2 = (ScrollView) findViewById(R.id.vscroll2);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		buttonof2 = (Button) findViewById(R.id.buttonof2);
		buttonof3 = (Button) findViewById(R.id.buttonof3);
		buttonof4 = (Button) findViewById(R.id.buttonof4);
		buttonof5 = (Button) findViewById(R.id.buttonof5);
		buttonof6 = (Button) findViewById(R.id.buttonof6);
		buttonof7 = (Button) findViewById(R.id.buttonof7);
		buttonof8 = (Button) findViewById(R.id.buttonof8);
		buttonof9 = (Button) findViewById(R.id.buttonof9);
		buttonof10 = (Button) findViewById(R.id.buttonof10);
		buttonof11 = (Button) findViewById(R.id.buttonof11);
		buttonof12 = (Button) findViewById(R.id.buttonof12);
		buttonof13 = (Button) findViewById(R.id.buttonof13);
		buttonof14 = (Button) findViewById(R.id.buttonof14);
		buttonof15 = (Button) findViewById(R.id.buttonof15);
		buttonof16 = (Button) findViewById(R.id.buttonof16);
		buttonof17 = (Button) findViewById(R.id.buttonof17);
		buttonof18 = (Button) findViewById(R.id.buttonof18);
		buttonof19 = (Button) findViewById(R.id.buttonof19);
		buttonof20 = (Button) findViewById(R.id.buttonof20);
		buttonof21 = (Button) findViewById(R.id.buttonof21);
		buttonof22 = (Button) findViewById(R.id.buttonof22);
		buttonof23 = (Button) findViewById(R.id.buttonof23);
		buttonof24 = (Button) findViewById(R.id.buttonof24);
		buttonof25 = (Button) findViewById(R.id.buttonof25);
		buttonof26 = (Button) findViewById(R.id.buttonof26);
		buttonof27 = (Button) findViewById(R.id.buttonof27);
		buttonof28 = (Button) findViewById(R.id.buttonof28);
		buttonof29 = (Button) findViewById(R.id.buttonof29);
		buttonof30 = (Button) findViewById(R.id.buttonof30);
		buttonof31 = (Button) findViewById(R.id.buttonof31);
		buttonof32 = (Button) findViewById(R.id.buttonof32);
		buttonof33 = (Button) findViewById(R.id.buttonof33);
		buttonof34 = (Button) findViewById(R.id.buttonof34);
		buttonof35 = (Button) findViewById(R.id.buttonof35);
		buttonof36 = (Button) findViewById(R.id.buttonof36);
		buttonof37 = (Button) findViewById(R.id.buttonof37);
		buttonof38 = (Button) findViewById(R.id.buttonof38);
		buttonof39 = (Button) findViewById(R.id.buttonof39);
		buttonof40 = (Button) findViewById(R.id.buttonof40);
		buttonof41 = (Button) findViewById(R.id.buttonof41);
		buttonof42 = (Button) findViewById(R.id.buttonof42);
		buttonof43 = (Button) findViewById(R.id.buttonof43);
		buttonof44 = (Button) findViewById(R.id.buttonof44);
		buttonof45 = (Button) findViewById(R.id.buttonof45);
		buttonof46 = (Button) findViewById(R.id.buttonof46);
		buttonof47 = (Button) findViewById(R.id.buttonof47);
		buttonof48 = (Button) findViewById(R.id.buttonof48);
		buttonof49 = (Button) findViewById(R.id.buttonof49);
		buttonof50 = (Button) findViewById(R.id.buttonof50);
		adview2 = (AdView) findViewById(R.id.adview2);
		data = getSharedPreferences("data", Activity.MODE_PRIVATE);
		
		buttonof2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof2.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof3.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof4.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof5.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof6.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof7.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof8.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof9.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof10.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof11.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof12.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof13.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof14.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof15.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof16.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof17.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof18.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof19.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof20.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof21.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof22.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof23.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof24.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof24.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof25.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof25.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof26.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof27.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof28.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof29.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof30.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof30.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof31.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof32.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof32.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof33.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof33.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof34.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof35.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof35.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof36.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof36.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof37.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof37.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof38.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof38.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof39.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof39.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof40.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof40.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof41.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof41.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof42.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof42.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof43.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof43.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof44.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof44.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof45.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof45.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof46.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof46.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof47.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof47.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof48.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof48.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof49.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof49.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		buttonof50.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				data.edit().putString("data", buttonof50.getText().toString()).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
			}
		});
		
		_Interstitialads_ad_listener = new AdListener() {
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
		adview2.loadAd(new AdRequest.Builder().addTestDevice("4DA114242B04025B7B135C6FB8F8AC21")
		.build());
		_interstitialad();
		timer = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						adview2.loadAd(new AdRequest.Builder().addTestDevice("4DA114242B04025B7B135C6FB8F8AC21")
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
	private void _intadshow () {
		adshow = SketchwareUtil.getRandom((int)(1), (int)(5));
		if (adshow == 3) {
			Interstitialads.show();
		}
	}
	
	
	private void _interstitialad () {
		Interstitialads = new InterstitialAd(getApplicationContext());
		Interstitialads.setAdListener(_Interstitialads_ad_listener);
		Interstitialads.setAdUnitId("ca-app-pub-9831385110285266/3158662565");
		Interstitialads.loadAd(new AdRequest.Builder().addTestDevice("4DA114242B04025B7B135C6FB8F8AC21")
		.build());
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
