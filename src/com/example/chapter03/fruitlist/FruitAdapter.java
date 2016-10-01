package com.example.chapter03.fruitlist;

import java.util.List;

import com.example.chapter03.R;
import com.example.entity.Fruit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FruitAdapter extends ArrayAdapter<Fruit> {
	private int resourceId;

	public FruitAdapter(Context context, int textViewResourceId,
			List<Fruit> objects) {
		super(context, textViewResourceId, objects);
		resourceId = textViewResourceId;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Fruit fruit = getItem(position);// ��ȡ��ǰ���Fruitʵ��
		//�Ż�1��ÿ�β������¼��أ����ٻ���������ƿ����convertView��֮ǰ���غõĲ��ֽ��л��棬�Ա�����
		View view;
		ViewHolder viewHolder;
		if(convertView ==null){
			view = LayoutInflater.from(getContext()).inflate(resourceId, null);
			
			viewHolder = new ViewHolder();
			viewHolder.fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
			viewHolder.fruitName = (TextView) view.findViewById(R.id.fruit_name);
			view.setTag(viewHolder);
		}else{
			view = convertView;
			viewHolder = (ViewHolder) view.getTag();
		}
		viewHolder.fruitImage.setImageResource(fruit.getImageId());
		viewHolder.fruitName.setText(fruit.getName());
		return view;
	}
	//�Ż�2���Կؼ�ʵ�����л���
	class ViewHolder{
		ImageView fruitImage;
		TextView fruitName;
	}
}
