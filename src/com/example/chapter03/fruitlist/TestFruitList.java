package com.example.chapter03.fruitlist;

import java.util.ArrayList;
import java.util.List;

import com.example.chapter03.R;
import com.example.entity.Fruit;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class TestFruitList extends Activity {
	private List<Fruit> fruitList = new ArrayList<Fruit>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.b2_listview);
		initFruits();
		FruitAdapter adapter = new FruitAdapter(TestFruitList.this,
				R.layout.fruit_item, fruitList);
		ListView listView = (ListView) findViewById(R.id.b2_listview);
		listView.setAdapter(adapter);
		// ListViewµã»÷ÊÂ¼þ
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Fruit fruit = fruitList.get(position);
				Toast.makeText(TestFruitList.this, fruit.getName(),
						Toast.LENGTH_SHORT).show();
			}
		});
	}

	private void initFruits() {
		Fruit apple = new Fruit("Apple", R.drawable.fruit_01);
		fruitList.add(apple);
		Fruit lemon = new Fruit("Lemon", R.drawable.fruit_02);
		fruitList.add(lemon);
		Fruit plum = new Fruit("Plum", R.drawable.fruit_03);
		fruitList.add(plum);
		Fruit banana = new Fruit("Banana", R.drawable.fruit_04);
		fruitList.add(banana);
		Fruit strawberry = new Fruit("Strawberry", R.drawable.fruit_05);
		fruitList.add(strawberry);
		Fruit pear = new Fruit("Pear", R.drawable.fruit_06);
		fruitList.add(pear);
		Fruit orange = new Fruit("Orange", R.drawable.fruit_07);
		fruitList.add(orange);
		Fruit grape = new Fruit("Grape", R.drawable.fruit_08);
		fruitList.add(grape);
		Fruit cherry = new Fruit("Cherry", R.drawable.fruit_09);
		fruitList.add(cherry);
	}

}
