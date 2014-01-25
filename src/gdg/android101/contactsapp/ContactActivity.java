package gdg.android101.contactsapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class ContactActivity extends Activity {
	
	TextView tvFullName;
	TextView tvPhoneNbr;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contact_detail);
		
		String contactFirstName = getIntent().getStringExtra("firstName");
		String contactLastName = getIntent().getStringExtra("lastName");
		String contactPhoneNumber = getIntent().getStringExtra("phone");
				
		tvFullName = (TextView) findViewById(R.id.contact_fullname);
		tvPhoneNbr = (TextView) findViewById(R.id.contact_phone);
		
		tvFullName.setText(contactFirstName + " " + contactLastName);
		tvPhoneNbr.setText(contactPhoneNumber);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.contact, menu);
		return true;
	}

}
