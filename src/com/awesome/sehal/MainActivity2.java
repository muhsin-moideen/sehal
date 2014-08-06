package com.awesome.sehal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends Activity {
	
	Button back;
	EditText etxt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sa);
		
		back=(Button)findViewById(R.id.button1);
		etxt=(EditText)findViewById(R.id.editText1);
		etxt.setText("blaa");
		
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				etxt.setText("blaaa");
				finish();
				
			}
		});
		
}
}
