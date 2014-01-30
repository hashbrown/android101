package gdg.android101.contactsapp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;

public class ContactListActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ContactsListAdapter adapter = new ContactsListAdapter(this, 0,
				loadContacts());
		getListView().setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private List<Contact> loadContacts() {
		List<Contact> contacts = new ArrayList<Contact>();
		try {
			contacts.addAll(new ContactLoader().loadContacts(this));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return contacts;
	}
}
