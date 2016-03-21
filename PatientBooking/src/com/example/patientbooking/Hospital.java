package com.example.patientbooking;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Hospital extends Activity {
	TextView t7;
	ListView l1;
	String[] str={"KMCH","APOLLO","SAVITHA","GH"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hospital);
		
		//l1=(ListView)findViewById(R.id.listView1);
		ArrayAdapter<String> aa=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
		//l1= (ListView)findViewById(R.id.l1);
		//l1.setAdapter(aa);
		setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,str));
		t7=(TextView)findViewById(R.id.t7);	
	}
	

	private void setListAdapter(ArrayAdapter<String> arrayAdapter) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hospital, menu);
		return true;
	}

}
