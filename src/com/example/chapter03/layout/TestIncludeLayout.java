package com.example.chapter03.layout;

import com.example.chapter03.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

public class TestIncludeLayout extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.b1_layout);
		//代码获取当前屏幕密度
		float xdpi = getResources().getDisplayMetrics().xdpi;
		float ydpi = getResources().getDisplayMetrics().ydpi;
		Log.d("TestIncludeLayout", "屏幕密度水平xdpi是："+xdpi);
		Log.d("TestIncludeLayout", "屏幕密度垂直ydpi是："+ydpi);
	}

}
