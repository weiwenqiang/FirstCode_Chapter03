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
		//�����ȡ��ǰ��Ļ�ܶ�
		float xdpi = getResources().getDisplayMetrics().xdpi;
		float ydpi = getResources().getDisplayMetrics().ydpi;
		Log.d("TestIncludeLayout", "��Ļ�ܶ�ˮƽxdpi�ǣ�"+xdpi);
		Log.d("TestIncludeLayout", "��Ļ�ܶȴ�ֱydpi�ǣ�"+ydpi);
	}

}
