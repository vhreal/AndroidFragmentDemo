package com.example.fragmenttabhost;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MyFragment extends ListFragment{
	
	String show1[] = {"1.1","1.2","1.3","1.4"};
	String show2[] = {"2.1","2.2","2.3","2.4"};
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		String show[] = null;
		Bundle bundle = getArguments();
		if(bundle == null)
			show = show1;
		else {
			show = show2;
			Toast.makeText(getActivity(), (CharSequence) bundle.get("key"), 1).show();
		}
		setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, show));
	}
}
