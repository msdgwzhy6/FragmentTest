package com.example.fragmenttest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class fragmentzi extends Fragment { //继承一个Fragment 的V4的包

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, //重载oncreateview来显示
			Bundle savedInstanceState) {
		View root = inflater.inflate(R.layout.fukm, container, false); //填充.(布局id，传回来的ViewGroup,false)
		root.findViewById(R.id.button1).setOnClickListener(
				new OnClickListener() {
					@Override
					public void onClick(View arg0) {
						getFragmentManager().beginTransaction() //跳转到第二个
								.addToBackStack(null)//压入返回栈，使得可以通过返回按钮切回第一页，否则退出
								.replace(R.id.MAIN, new ragmentzi2()).commit();
						//add 是在原基础上覆盖一个，会重叠
					}
				});
		return root; //返回整个View
	}
}
