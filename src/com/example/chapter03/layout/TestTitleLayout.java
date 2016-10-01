package com.example.chapter03.layout;

import com.example.chapter03.R;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class TestTitleLayout extends LinearLayout {
	Button back, edit;
	public TestTitleLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.layout_title, this);
		back = (Button) findViewById(R.id.layout_title_back);
		back.setOnClickListener(new onClick());
		edit = (Button) findViewById(R.id.layout_title_edit);
		edit.setOnClickListener(new onClick());
	}
	class onClick implements OnClickListener{

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.layout_title_back:
				Toast.makeText(getContext(), "引用布局的back按钮事件", 0).show();
				break;
			case R.id.layout_title_edit:
				Toast.makeText(getContext(), "引用布局的edit按钮事件", 0).show();
				break;
			default:
				break;
			}
		}
		
	}
}
