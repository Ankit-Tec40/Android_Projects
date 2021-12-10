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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdRequest;
import android.app.Activity;
import android.content.SharedPreferences;
import android.speech.tts.TextToSpeech;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdListener;
import android.view.View;

public class Screen3Activity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private double value = 0;
	private String language = "";
	private double i = 0;
	private double timediff = 0;
	private double adshow = 0;
	
	private LinearLayout linear22;
	private ScrollView vscroll2;
	private LinearLayout linear19;
	private LinearLayout linear21;
	private ImageView back;
	private TextView textview51;
	private TextView valueid;
	private ImageView next;
	private LinearLayout linear3;
	private LinearLayout valueinto1;
	private LinearLayout valueinto2;
	private LinearLayout valueinto3;
	private LinearLayout valueinto4;
	private LinearLayout valueinto5;
	private LinearLayout valueinto6;
	private LinearLayout valueinto7;
	private LinearLayout valueinto8;
	private LinearLayout valueinto9;
	private LinearLayout valueinto10;
	private TextView val1id;
	private TextView textview2;
	private TextView textview3;
	private TextView textview4;
	private TextView tablevalue1;
	private TextView val2id;
	private TextView textview7;
	private TextView textview8;
	private TextView textview9;
	private TextView tablevalue2;
	private TextView val3id;
	private TextView textview12;
	private TextView textview13;
	private TextView textview14;
	private TextView tablevalue3;
	private TextView val4id;
	private TextView textview24;
	private TextView textview25;
	private TextView textview26;
	private TextView tablevalue4;
	private TextView val5id;
	private TextView textview28;
	private TextView textview29;
	private TextView textview30;
	private TextView tablevalue5;
	private TextView val6id;
	private TextView textview32;
	private TextView textview33;
	private TextView textview34;
	private TextView tablevalue6;
	private TextView val7id;
	private TextView textview36;
	private TextView textview37;
	private TextView textview38;
	private TextView tablevalue7;
	private TextView val8id;
	private TextView textview40;
	private TextView textview41;
	private TextView textview42;
	private TextView tablevalue8;
	private TextView val9id;
	private TextView textview44;
	private TextView textview45;
	private TextView textview46;
	private TextView tablevalue9;
	private TextView val10id;
	private TextView textview48;
	private TextView textview49;
	private TextView textview50;
	private TextView tablevalue10;
	private Button speakbuttomid;
	private Button taketestbuttomid;
	private AdView adview1;
	
	private SharedPreferences data;
	private TextToSpeech tts;
	private TimerTask timer;
	private Intent intent = new Intent();
	private InterstitialAd interstitialads;
	private AdListener _interstitialads_ad_listener;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.screen3);
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
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		vscroll2 = (ScrollView) findViewById(R.id.vscroll2);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		back = (ImageView) findViewById(R.id.back);
		textview51 = (TextView) findViewById(R.id.textview51);
		valueid = (TextView) findViewById(R.id.valueid);
		next = (ImageView) findViewById(R.id.next);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		valueinto1 = (LinearLayout) findViewById(R.id.valueinto1);
		valueinto2 = (LinearLayout) findViewById(R.id.valueinto2);
		valueinto3 = (LinearLayout) findViewById(R.id.valueinto3);
		valueinto4 = (LinearLayout) findViewById(R.id.valueinto4);
		valueinto5 = (LinearLayout) findViewById(R.id.valueinto5);
		valueinto6 = (LinearLayout) findViewById(R.id.valueinto6);
		valueinto7 = (LinearLayout) findViewById(R.id.valueinto7);
		valueinto8 = (LinearLayout) findViewById(R.id.valueinto8);
		valueinto9 = (LinearLayout) findViewById(R.id.valueinto9);
		valueinto10 = (LinearLayout) findViewById(R.id.valueinto10);
		val1id = (TextView) findViewById(R.id.val1id);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		tablevalue1 = (TextView) findViewById(R.id.tablevalue1);
		val2id = (TextView) findViewById(R.id.val2id);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview9 = (TextView) findViewById(R.id.textview9);
		tablevalue2 = (TextView) findViewById(R.id.tablevalue2);
		val3id = (TextView) findViewById(R.id.val3id);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview14 = (TextView) findViewById(R.id.textview14);
		tablevalue3 = (TextView) findViewById(R.id.tablevalue3);
		val4id = (TextView) findViewById(R.id.val4id);
		textview24 = (TextView) findViewById(R.id.textview24);
		textview25 = (TextView) findViewById(R.id.textview25);
		textview26 = (TextView) findViewById(R.id.textview26);
		tablevalue4 = (TextView) findViewById(R.id.tablevalue4);
		val5id = (TextView) findViewById(R.id.val5id);
		textview28 = (TextView) findViewById(R.id.textview28);
		textview29 = (TextView) findViewById(R.id.textview29);
		textview30 = (TextView) findViewById(R.id.textview30);
		tablevalue5 = (TextView) findViewById(R.id.tablevalue5);
		val6id = (TextView) findViewById(R.id.val6id);
		textview32 = (TextView) findViewById(R.id.textview32);
		textview33 = (TextView) findViewById(R.id.textview33);
		textview34 = (TextView) findViewById(R.id.textview34);
		tablevalue6 = (TextView) findViewById(R.id.tablevalue6);
		val7id = (TextView) findViewById(R.id.val7id);
		textview36 = (TextView) findViewById(R.id.textview36);
		textview37 = (TextView) findViewById(R.id.textview37);
		textview38 = (TextView) findViewById(R.id.textview38);
		tablevalue7 = (TextView) findViewById(R.id.tablevalue7);
		val8id = (TextView) findViewById(R.id.val8id);
		textview40 = (TextView) findViewById(R.id.textview40);
		textview41 = (TextView) findViewById(R.id.textview41);
		textview42 = (TextView) findViewById(R.id.textview42);
		tablevalue8 = (TextView) findViewById(R.id.tablevalue8);
		val9id = (TextView) findViewById(R.id.val9id);
		textview44 = (TextView) findViewById(R.id.textview44);
		textview45 = (TextView) findViewById(R.id.textview45);
		textview46 = (TextView) findViewById(R.id.textview46);
		tablevalue9 = (TextView) findViewById(R.id.tablevalue9);
		val10id = (TextView) findViewById(R.id.val10id);
		textview48 = (TextView) findViewById(R.id.textview48);
		textview49 = (TextView) findViewById(R.id.textview49);
		textview50 = (TextView) findViewById(R.id.textview50);
		tablevalue10 = (TextView) findViewById(R.id.tablevalue10);
		speakbuttomid = (Button) findViewById(R.id.speakbuttomid);
		taketestbuttomid = (Button) findViewById(R.id.taketestbuttomid);
		adview1 = (AdView) findViewById(R.id.adview1);
		data = getSharedPreferences("data", Activity.MODE_PRIVATE);
		tts = new TextToSpeech(getApplicationContext(), null);
		
		back.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (speakbuttomid.getText().toString().equals("Stop")) {
					tts.stop();
					timer.cancel();
				}
				if (Double.parseDouble(data.getString("data", "")) > 2) {
					data.edit().putString("data", String.valueOf((long)(Double.parseDouble(data.getString("data", "")) - 1))).commit();
					intent.setClass(getApplicationContext(), Screen3Activity.class);
					startActivity(intent);
					_intadshow();
					finish();
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "You have reached lower limit");
				}
			}
		});
		
		next.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (speakbuttomid.getText().toString().equals("Stop")) {
					tts.stop();
					timer.cancel();
				}
				data.edit().putString("data", String.valueOf((long)(Double.parseDouble(data.getString("data", "")) + 1))).commit();
				intent.setClass(getApplicationContext(), Screen3Activity.class);
				startActivity(intent);
				finish();
			}
		});
		
		valueinto1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		speakbuttomid.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (speakbuttomid.getText().toString().equals("Read")) {
					_speak();
					speakbuttomid.setText("Stop");
				}
				else {
					tts.stop();
					speakbuttomid.setText("Read");
					timer.cancel();
				}
			}
		});
		
		taketestbuttomid.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				tts.stop();
				data.edit().putString("intentfrom", "test").commit();
				intent.setClass(getApplicationContext(), Screen4Activity.class);
				startActivity(intent);
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
		language = data.getString("language", "");
		value = Double.parseDouble(data.getString("data", ""));
		val1id.setText(String.valueOf((long)(value)));
		val2id.setText(String.valueOf((long)(value)));
		val3id.setText(String.valueOf((long)(value)));
		val4id.setText(String.valueOf((long)(value)));
		val5id.setText(String.valueOf((long)(value)));
		val6id.setText(String.valueOf((long)(value)));
		val7id.setText(String.valueOf((long)(value)));
		val8id.setText(String.valueOf((long)(value)));
		val9id.setText(String.valueOf((long)(value)));
		val10id.setText(String.valueOf((long)(value)));
		tablevalue1.setText(String.valueOf((long)(value * 1)));
		tablevalue2.setText(String.valueOf((long)(value * 2)));
		tablevalue3.setText(String.valueOf((long)(value * 3)));
		tablevalue4.setText(String.valueOf((long)(value * 4)));
		tablevalue5.setText(String.valueOf((long)(value * 5)));
		tablevalue6.setText(String.valueOf((long)(value * 6)));
		tablevalue7.setText(String.valueOf((long)(value * 7)));
		tablevalue8.setText(String.valueOf((long)(value * 8)));
		tablevalue9.setText(String.valueOf((long)(value * 9)));
		tablevalue10.setText(String.valueOf((long)(value * 10)));
		valueid.setText(data.getString("data", ""));
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
		if (speakbuttomid.getText().toString().equals("Stop")) {
			tts.stop();
			timer.cancel();
		}
		intent.setClass(getApplicationContext(), Screen2Activity.class);
		startActivity(intent);
		_intadshow();
		finish();
	}
	
	@Override
	public void onPause() {
		super.onPause();
		if (speakbuttomid.getText().toString().equals("Stop")) {
			tts.stop();
			timer.cancel();
			speakbuttomid.setText("Read");
		}
	}
	private void _speak () {
		i = 0;
		timediff = 2000;
		if (language.equals("english")) {
			timer = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							i++;
							if (i == 11) {
								timer.cancel();
							}
							if (i == 1) {
								valueinto1.setBackgroundColor(0xFF4CAF50);
								valueinto2.setBackgroundColor(Color.TRANSPARENT);
								valueinto3.setBackgroundColor(Color.TRANSPARENT);
								valueinto4.setBackgroundColor(Color.TRANSPARENT);
								valueinto5.setBackgroundColor(Color.TRANSPARENT);
								valueinto6.setBackgroundColor(Color.TRANSPARENT);
								valueinto7.setBackgroundColor(Color.TRANSPARENT);
								valueinto8.setBackgroundColor(Color.TRANSPARENT);
								valueinto9.setBackgroundColor(Color.TRANSPARENT);
								valueinto10.setBackgroundColor(Color.TRANSPARENT);
								tts.speak(String.valueOf((long)(value)).concat("one".concat("za").concat(String.valueOf((long)(value * 1)))), TextToSpeech.QUEUE_ADD, null);
							}
							else {
								if (i == 2) {
									valueinto1.setBackgroundColor(Color.TRANSPARENT);
									valueinto2.setBackgroundColor(0xFF4CAF50);
									valueinto3.setBackgroundColor(Color.TRANSPARENT);
									valueinto4.setBackgroundColor(Color.TRANSPARENT);
									valueinto5.setBackgroundColor(Color.TRANSPARENT);
									valueinto6.setBackgroundColor(Color.TRANSPARENT);
									valueinto7.setBackgroundColor(Color.TRANSPARENT);
									valueinto8.setBackgroundColor(Color.TRANSPARENT);
									valueinto9.setBackgroundColor(Color.TRANSPARENT);
									valueinto10.setBackgroundColor(Color.TRANSPARENT);
									tts.speak(String.valueOf((long)(value)).concat("two".concat("za").concat(String.valueOf((long)(value * 2)))), TextToSpeech.QUEUE_ADD, null);
								}
								else {
									if (i == 3) {
										valueinto1.setBackgroundColor(Color.TRANSPARENT);
										valueinto2.setBackgroundColor(Color.TRANSPARENT);
										valueinto3.setBackgroundColor(0xFF4CAF50);
										valueinto4.setBackgroundColor(Color.TRANSPARENT);
										valueinto5.setBackgroundColor(Color.TRANSPARENT);
										valueinto6.setBackgroundColor(Color.TRANSPARENT);
										valueinto7.setBackgroundColor(Color.TRANSPARENT);
										valueinto8.setBackgroundColor(Color.TRANSPARENT);
										valueinto9.setBackgroundColor(Color.TRANSPARENT);
										valueinto10.setBackgroundColor(Color.TRANSPARENT);
										tts.speak(String.valueOf((long)(value)).concat("three".concat("za").concat(String.valueOf((long)(value * 3)))), TextToSpeech.QUEUE_ADD, null);
									}
									else {
										if (i == 4) {
											valueinto1.setBackgroundColor(Color.TRANSPARENT);
											valueinto2.setBackgroundColor(Color.TRANSPARENT);
											valueinto3.setBackgroundColor(Color.TRANSPARENT);
											valueinto4.setBackgroundColor(0xFF4CAF50);
											valueinto5.setBackgroundColor(Color.TRANSPARENT);
											valueinto6.setBackgroundColor(Color.TRANSPARENT);
											valueinto7.setBackgroundColor(Color.TRANSPARENT);
											valueinto8.setBackgroundColor(Color.TRANSPARENT);
											valueinto9.setBackgroundColor(Color.TRANSPARENT);
											valueinto10.setBackgroundColor(Color.TRANSPARENT);
											tts.speak(String.valueOf((long)(value)).concat("four".concat("za").concat(String.valueOf((long)(value * 4)))), TextToSpeech.QUEUE_ADD, null);
										}
										else {
											if (i == 5) {
												valueinto1.setBackgroundColor(Color.TRANSPARENT);
												valueinto2.setBackgroundColor(Color.TRANSPARENT);
												valueinto3.setBackgroundColor(Color.TRANSPARENT);
												valueinto4.setBackgroundColor(Color.TRANSPARENT);
												valueinto5.setBackgroundColor(0xFF4CAF50);
												valueinto6.setBackgroundColor(Color.TRANSPARENT);
												valueinto7.setBackgroundColor(Color.TRANSPARENT);
												valueinto8.setBackgroundColor(Color.TRANSPARENT);
												valueinto9.setBackgroundColor(Color.TRANSPARENT);
												valueinto10.setBackgroundColor(Color.TRANSPARENT);
												tts.speak(String.valueOf((long)(value)).concat("five".concat("za").concat(String.valueOf((long)(value * 5)))), TextToSpeech.QUEUE_ADD, null);
											}
											else {
												if (i == 6) {
													valueinto1.setBackgroundColor(Color.TRANSPARENT);
													valueinto2.setBackgroundColor(Color.TRANSPARENT);
													valueinto3.setBackgroundColor(Color.TRANSPARENT);
													valueinto4.setBackgroundColor(Color.TRANSPARENT);
													valueinto5.setBackgroundColor(Color.TRANSPARENT);
													valueinto6.setBackgroundColor(0xFF4CAF50);
													valueinto7.setBackgroundColor(Color.TRANSPARENT);
													valueinto8.setBackgroundColor(Color.TRANSPARENT);
													valueinto9.setBackgroundColor(Color.TRANSPARENT);
													valueinto10.setBackgroundColor(Color.TRANSPARENT);
													tts.speak(String.valueOf((long)(value)).concat("six".concat("za").concat(String.valueOf((long)(value * 6)))), TextToSpeech.QUEUE_ADD, null);
												}
												else {
													if (i == 7) {
														valueinto1.setBackgroundColor(Color.TRANSPARENT);
														valueinto2.setBackgroundColor(Color.TRANSPARENT);
														valueinto3.setBackgroundColor(Color.TRANSPARENT);
														valueinto4.setBackgroundColor(Color.TRANSPARENT);
														valueinto5.setBackgroundColor(Color.TRANSPARENT);
														valueinto6.setBackgroundColor(Color.TRANSPARENT);
														valueinto7.setBackgroundColor(0xFF4CAF50);
														valueinto8.setBackgroundColor(Color.TRANSPARENT);
														valueinto9.setBackgroundColor(Color.TRANSPARENT);
														valueinto10.setBackgroundColor(Color.TRANSPARENT);
														tts.speak(String.valueOf((long)(value)).concat("seven".concat("za").concat(String.valueOf((long)(value * 7)))), TextToSpeech.QUEUE_ADD, null);
													}
													else {
														if (i == 8) {
															valueinto1.setBackgroundColor(Color.TRANSPARENT);
															valueinto2.setBackgroundColor(Color.TRANSPARENT);
															valueinto3.setBackgroundColor(Color.TRANSPARENT);
															valueinto4.setBackgroundColor(Color.TRANSPARENT);
															valueinto5.setBackgroundColor(Color.TRANSPARENT);
															valueinto6.setBackgroundColor(Color.TRANSPARENT);
															valueinto7.setBackgroundColor(Color.TRANSPARENT);
															valueinto8.setBackgroundColor(0xFF4CAF50);
															valueinto9.setBackgroundColor(Color.TRANSPARENT);
															valueinto10.setBackgroundColor(Color.TRANSPARENT);
															tts.speak(String.valueOf((long)(value)).concat("eight".concat("za").concat(String.valueOf((long)(value * 8)))), TextToSpeech.QUEUE_ADD, null);
														}
														else {
															if (i == 9) {
																valueinto1.setBackgroundColor(Color.TRANSPARENT);
																valueinto2.setBackgroundColor(Color.TRANSPARENT);
																valueinto3.setBackgroundColor(Color.TRANSPARENT);
																valueinto4.setBackgroundColor(Color.TRANSPARENT);
																valueinto5.setBackgroundColor(Color.TRANSPARENT);
																valueinto6.setBackgroundColor(Color.TRANSPARENT);
																valueinto7.setBackgroundColor(Color.TRANSPARENT);
																valueinto8.setBackgroundColor(Color.TRANSPARENT);
																valueinto9.setBackgroundColor(0xFF4CAF50);
																valueinto10.setBackgroundColor(Color.TRANSPARENT);
																tts.speak(String.valueOf((long)(value)).concat("nine".concat("za").concat(String.valueOf((long)(value * 9)))), TextToSpeech.QUEUE_ADD, null);
															}
															else {
																if (i == 10) {
																	valueinto1.setBackgroundColor(Color.TRANSPARENT);
																	valueinto2.setBackgroundColor(Color.TRANSPARENT);
																	valueinto3.setBackgroundColor(Color.TRANSPARENT);
																	valueinto4.setBackgroundColor(Color.TRANSPARENT);
																	valueinto5.setBackgroundColor(Color.TRANSPARENT);
																	valueinto6.setBackgroundColor(Color.TRANSPARENT);
																	valueinto7.setBackgroundColor(Color.TRANSPARENT);
																	valueinto8.setBackgroundColor(Color.TRANSPARENT);
																	valueinto9.setBackgroundColor(Color.TRANSPARENT);
																	valueinto10.setBackgroundColor(0xFF4CAF50);
																	tts.speak(String.valueOf((long)(value)).concat("ten".concat("za").concat(String.valueOf((long)(value * 10)))), TextToSpeech.QUEUE_ADD, null);
																	speakbuttomid.setText("Read");
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					});
				}
			};
			_timer.scheduleAtFixedRate(timer, (int)(timediff), (int)(timediff));
		}
		else {
			_speakhindi();
		}
	}
	
	
	private void _speakhindi () {
		tts.setLanguage(new Locale("hin"));
		timer = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						i++;
						if (i == 11) {
							timer.cancel();
						}
						if (i == 1) {
							valueinto1.setBackgroundColor(0xFF4CAF50);
							valueinto2.setBackgroundColor(Color.TRANSPARENT);
							valueinto3.setBackgroundColor(Color.TRANSPARENT);
							valueinto4.setBackgroundColor(Color.TRANSPARENT);
							valueinto5.setBackgroundColor(Color.TRANSPARENT);
							valueinto6.setBackgroundColor(Color.TRANSPARENT);
							valueinto7.setBackgroundColor(Color.TRANSPARENT);
							valueinto8.setBackgroundColor(Color.TRANSPARENT);
							valueinto9.setBackgroundColor(Color.TRANSPARENT);
							valueinto10.setBackgroundColor(Color.TRANSPARENT);
							tts.speak(String.valueOf((long)(value)).concat("ऐकम".concat(String.valueOf((long)(value * 1)))), TextToSpeech.QUEUE_ADD, null);
						}
						else {
							if (i == 2) {
								valueinto1.setBackgroundColor(Color.TRANSPARENT);
								valueinto2.setBackgroundColor(0xFF4CAF50);
								valueinto3.setBackgroundColor(Color.TRANSPARENT);
								valueinto4.setBackgroundColor(Color.TRANSPARENT);
								valueinto5.setBackgroundColor(Color.TRANSPARENT);
								valueinto6.setBackgroundColor(Color.TRANSPARENT);
								valueinto7.setBackgroundColor(Color.TRANSPARENT);
								valueinto8.setBackgroundColor(Color.TRANSPARENT);
								valueinto9.setBackgroundColor(Color.TRANSPARENT);
								valueinto10.setBackgroundColor(Color.TRANSPARENT);
								tts.speak(String.valueOf((long)(value)).concat("दुनी".concat(String.valueOf((long)(value * 2)))), TextToSpeech.QUEUE_ADD, null);
							}
							else {
								if (i == 3) {
									valueinto1.setBackgroundColor(Color.TRANSPARENT);
									valueinto2.setBackgroundColor(Color.TRANSPARENT);
									valueinto3.setBackgroundColor(0xFF4CAF50);
									valueinto4.setBackgroundColor(Color.TRANSPARENT);
									valueinto5.setBackgroundColor(Color.TRANSPARENT);
									valueinto6.setBackgroundColor(Color.TRANSPARENT);
									valueinto7.setBackgroundColor(Color.TRANSPARENT);
									valueinto8.setBackgroundColor(Color.TRANSPARENT);
									valueinto9.setBackgroundColor(Color.TRANSPARENT);
									valueinto10.setBackgroundColor(Color.TRANSPARENT);
									tts.speak(String.valueOf((long)(value)).concat("तिया".concat(String.valueOf((long)(value * 3)))), TextToSpeech.QUEUE_ADD, null);
								}
								else {
									if (i == 4) {
										valueinto1.setBackgroundColor(Color.TRANSPARENT);
										valueinto2.setBackgroundColor(Color.TRANSPARENT);
										valueinto3.setBackgroundColor(Color.TRANSPARENT);
										valueinto4.setBackgroundColor(0xFF4CAF50);
										valueinto5.setBackgroundColor(Color.TRANSPARENT);
										valueinto6.setBackgroundColor(Color.TRANSPARENT);
										valueinto7.setBackgroundColor(Color.TRANSPARENT);
										valueinto8.setBackgroundColor(Color.TRANSPARENT);
										valueinto9.setBackgroundColor(Color.TRANSPARENT);
										valueinto10.setBackgroundColor(Color.TRANSPARENT);
										tts.speak(String.valueOf((long)(value)).concat("चौके".concat(String.valueOf((long)(value * 4)))), TextToSpeech.QUEUE_ADD, null);
									}
									else {
										if (i == 5) {
											valueinto1.setBackgroundColor(Color.TRANSPARENT);
											valueinto2.setBackgroundColor(Color.TRANSPARENT);
											valueinto3.setBackgroundColor(Color.TRANSPARENT);
											valueinto4.setBackgroundColor(Color.TRANSPARENT);
											valueinto5.setBackgroundColor(0xFF4CAF50);
											valueinto6.setBackgroundColor(Color.TRANSPARENT);
											valueinto7.setBackgroundColor(Color.TRANSPARENT);
											valueinto8.setBackgroundColor(Color.TRANSPARENT);
											valueinto9.setBackgroundColor(Color.TRANSPARENT);
											valueinto10.setBackgroundColor(Color.TRANSPARENT);
											tts.speak(String.valueOf((long)(value)).concat("पाचे".concat(String.valueOf((long)(value * 5)))), TextToSpeech.QUEUE_ADD, null);
										}
										else {
											if (i == 6) {
												valueinto1.setBackgroundColor(Color.TRANSPARENT);
												valueinto2.setBackgroundColor(Color.TRANSPARENT);
												valueinto3.setBackgroundColor(Color.TRANSPARENT);
												valueinto4.setBackgroundColor(Color.TRANSPARENT);
												valueinto5.setBackgroundColor(Color.TRANSPARENT);
												valueinto6.setBackgroundColor(0xFF4CAF50);
												valueinto7.setBackgroundColor(Color.TRANSPARENT);
												valueinto8.setBackgroundColor(Color.TRANSPARENT);
												valueinto9.setBackgroundColor(Color.TRANSPARENT);
												valueinto10.setBackgroundColor(Color.TRANSPARENT);
												tts.speak(String.valueOf((long)(value)).concat("छाके".concat(String.valueOf((long)(value * 6)))), TextToSpeech.QUEUE_ADD, null);
											}
											else {
												if (i == 7) {
													valueinto1.setBackgroundColor(Color.TRANSPARENT);
													valueinto2.setBackgroundColor(Color.TRANSPARENT);
													valueinto3.setBackgroundColor(Color.TRANSPARENT);
													valueinto4.setBackgroundColor(Color.TRANSPARENT);
													valueinto5.setBackgroundColor(Color.TRANSPARENT);
													valueinto6.setBackgroundColor(Color.TRANSPARENT);
													valueinto7.setBackgroundColor(0xFF4CAF50);
													valueinto8.setBackgroundColor(Color.TRANSPARENT);
													valueinto9.setBackgroundColor(Color.TRANSPARENT);
													valueinto10.setBackgroundColor(Color.TRANSPARENT);
													tts.speak(String.valueOf((long)(value)).concat("साते".concat(String.valueOf((long)(value * 7)))), TextToSpeech.QUEUE_ADD, null);
												}
												else {
													if (i == 8) {
														valueinto1.setBackgroundColor(Color.TRANSPARENT);
														valueinto2.setBackgroundColor(Color.TRANSPARENT);
														valueinto3.setBackgroundColor(Color.TRANSPARENT);
														valueinto4.setBackgroundColor(Color.TRANSPARENT);
														valueinto5.setBackgroundColor(Color.TRANSPARENT);
														valueinto6.setBackgroundColor(Color.TRANSPARENT);
														valueinto7.setBackgroundColor(Color.TRANSPARENT);
														valueinto8.setBackgroundColor(0xFF4CAF50);
														valueinto9.setBackgroundColor(Color.TRANSPARENT);
														valueinto10.setBackgroundColor(Color.TRANSPARENT);
														tts.speak(String.valueOf((long)(value)).concat("आठे".concat(String.valueOf((long)(value * 8)))), TextToSpeech.QUEUE_ADD, null);
													}
													else {
														if (i == 9) {
															valueinto1.setBackgroundColor(Color.TRANSPARENT);
															valueinto2.setBackgroundColor(Color.TRANSPARENT);
															valueinto3.setBackgroundColor(Color.TRANSPARENT);
															valueinto4.setBackgroundColor(Color.TRANSPARENT);
															valueinto5.setBackgroundColor(Color.TRANSPARENT);
															valueinto6.setBackgroundColor(Color.TRANSPARENT);
															valueinto7.setBackgroundColor(Color.TRANSPARENT);
															valueinto8.setBackgroundColor(Color.TRANSPARENT);
															valueinto9.setBackgroundColor(0xFF4CAF50);
															valueinto10.setBackgroundColor(Color.TRANSPARENT);
															tts.speak(String.valueOf((long)(value)).concat("नौवे".concat(String.valueOf((long)(value * 9)))), TextToSpeech.QUEUE_ADD, null);
														}
														else {
															if (i == 10) {
																valueinto1.setBackgroundColor(Color.TRANSPARENT);
																valueinto2.setBackgroundColor(Color.TRANSPARENT);
																valueinto3.setBackgroundColor(Color.TRANSPARENT);
																valueinto4.setBackgroundColor(Color.TRANSPARENT);
																valueinto5.setBackgroundColor(Color.TRANSPARENT);
																valueinto6.setBackgroundColor(Color.TRANSPARENT);
																valueinto7.setBackgroundColor(Color.TRANSPARENT);
																valueinto8.setBackgroundColor(Color.TRANSPARENT);
																valueinto9.setBackgroundColor(Color.TRANSPARENT);
																valueinto10.setBackgroundColor(0xFF4CAF50);
																tts.speak(String.valueOf((long)(value)).concat("दसे".concat(String.valueOf((long)(value * 10)))), TextToSpeech.QUEUE_ADD, null);
																speakbuttomid.setText("Read");
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(timer, (int)(timediff), (int)(timediff));
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
