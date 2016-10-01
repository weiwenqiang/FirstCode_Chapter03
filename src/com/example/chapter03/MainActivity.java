package com.example.chapter03;

import com.example.chapter03.bubble.TestBubble;
import com.example.chapter03.fruitlist.TestFruitList;
import com.example.chapter03.layout.TestIncludeLayout;
import com.example.chapter03.listview.TestListView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	Button b1, b2, b3, b4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1 = (Button) findViewById(R.id.c03_b1);
		b1.setOnClickListener(this);
		b2 = (Button) findViewById(R.id.c03_b2);
		b2.setOnClickListener(this);
		b3 = (Button) findViewById(R.id.c03_b3);
		b3.setOnClickListener(this);
		b4 = (Button) findViewById(R.id.c03_b4);
		b4.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.c03_b1:
			startActivity(new Intent(MainActivity.this, TestIncludeLayout.class));
			break;
		case R.id.c03_b2:
			startActivity(new Intent(MainActivity.this, TestListView.class));
			break;
		case R.id.c03_b3:
			startActivity(new Intent(MainActivity.this, TestFruitList.class));
			break;
		case R.id.c03_b4:
			startActivity(new Intent(MainActivity.this, TestBubble.class));
			break;
		default:
			break;
		}
	}
}
