package com.example.fragmenttest;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

public class MainActivity extends FragmentActivity {  //继承一个FragmentActivity

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if (savedInstanceState == null) { 
			getSupportFragmentManager().beginTransaction() //获取支持开始的碎片(活动的布局id,要呈现的fragment类).提交上去;
					.replace(R.id.MAIN, new fragmentzi()).commit();
		}
	}

}
