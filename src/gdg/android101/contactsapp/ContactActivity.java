package gdg.android101.contactsapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ContactActivity extends Activity {
	
	TextView tvFullName;
	TextView tvPhoneNbr;
	Button btnCall;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contact_detail);
		
		String contactFirstName = getIntent().getStringExtra("firstName");
		String contactLastName = getIntent().getStringExtra("lastName");
		final String contactPhoneNumber = getIntent().getStringExtra("phone");
				
		tvFullName = (TextView) findViewById(R.id.contact_fullname);
		tvPhoneNbr = (TextView) findViewById(R.id.contact_phone);
		btnCall = (Button) findViewById(R.id.call);
		
		tvFullName.setText(contactFirstName + " " + contactLastName);
		tvPhoneNbr.setText(contactPhoneNumber);
		btnCall.setText("Call " + contactFirstName);
		
		btnCall.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				call(contactPhoneNumber);
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.contact, menu);
		return true;
	}

	private void call(String phoneNbr) {
		Intent dial = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNbr));
		startActivity(dial);
	}
}
