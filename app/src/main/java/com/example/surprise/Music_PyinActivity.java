package com.example.surprise;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Music_PyinActivity extends FragmentActivity {
ImageView  imageView_back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pic_four);
		 imageView_back=(ImageView) findViewById(R.id.imageView_pic_four_back);
		 imageView_back.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					finish();
				}
			});
	}

}
