package com.example.hellokirsh;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button actionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	actionButton = (Button) findViewById(R.id.action_button);
	actionButton.setOnClickListener(new OnClickListener() {

	    @Override
	    public void onClick(View v) {
		Toast.makeText(MainActivity.this, "I was clicked!!!",
			Toast.LENGTH_LONG).show();
	    }
	});
    }

}
