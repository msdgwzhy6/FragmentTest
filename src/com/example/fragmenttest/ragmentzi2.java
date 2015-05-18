package com.example.fragmenttest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class ragmentzi2 extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View root = inflater.inflate(R.layout.fukm2, container, false);
		root.findViewById(R.id.button2).setOnClickListener(
				new OnClickListener() {
					@Override
					public void onClick(View arg0) {
						getFragmentManager().popBackStack();

					}
				});
		return root;
	}
}
