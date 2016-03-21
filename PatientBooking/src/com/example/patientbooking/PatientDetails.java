package com.example.patientbooking;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PatientDetails extends Activity implements OnClickListener{
	TextView tv4,t1,t2,t3,t4,t5;
	EditText et3,et4,et5,et6;
	Button b2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_patient_details);
		tv4=(TextView)findViewById(R.id.tv4);
		t1=(TextView)findViewById(R.id.t1);
		t2=(TextView)findViewById(R.id.t2);
		t3=(TextView)findViewById(R.id.t3);
		t4=(TextView)findViewById(R.id.t4);
		t5=(TextView)findViewById(R.id.t5);
		//t6=(TextView)findViewById(R.id.t6);
		et3=(EditText)findViewById(R.id.et3);
		et4=(EditText)findViewById(R.id.et4);
		et5=(EditText)findViewById(R.id.et5);
		et6=(EditText)findViewById(R.id.et6);
		b2=(Button)findViewById(R.id.b2);
		b2.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.patient_details, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i1=new Intent(getApplicationContext(),Hospital.class);
		startActivity(i1);
	}

}
