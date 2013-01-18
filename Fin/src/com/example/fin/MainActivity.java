package com.example.fin;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		IotdHandler ih=new IotdHandler();
		ih.processFeed();
		resetDisplay(ih.getTitle(),ih.getDate(),ih.getImage(), ih.getDescription());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	public void resetDisplay(String title, String date,	Bitmap imageUrl, StringBuffer stringBuffer){
		TextView tw1=(TextView)findViewById(R.id.textView1);
		tw1.setText(title);
		TextView tw2=(TextView)findViewById(R.id.textView2);
		tw1.setText(date);
		ImageView iv=(ImageView)findViewById(R.id.imageView1);
		iv.setImageBitmap(imageUrl);
		TextView tw3=(TextView)findViewById(R.id.textView3);
		tw1.setText(stringBuffer);
		
	}
	

}
