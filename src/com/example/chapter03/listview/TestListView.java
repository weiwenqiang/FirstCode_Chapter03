package com.example.chapter03.listview;

import com.example.chapter03.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TestListView extends Activity {
	private String[] data = { "Apple", "Banana", "Orange", "Watermelon",
			"Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.b2_listview);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				TestListView.this, android.R.layout.simple_list_item_1, data);
		ListView listView = (ListView) findViewById(R.id.b2_listview);
		listView.setAdapter(adapter);
	}
}
