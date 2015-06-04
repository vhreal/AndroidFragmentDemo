package com.example.fragmenttabhost;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;

public class MainActivity extends FragmentActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		FragmentTabHost tabHost = (FragmentTabHost) findViewById(R.id.tab);
		tabHost.setup(this, getSupportFragmentManager(), R.id.content);
		
		tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("Tab1"), MyFragment.class, null);
		Bundle b = new Bundle();
		b.putString("key", "I am tab2");
		tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Tab2",getResources().getDrawable(R.drawable.ic_launcher)), MyFragment.class, b);
		
	}

}
