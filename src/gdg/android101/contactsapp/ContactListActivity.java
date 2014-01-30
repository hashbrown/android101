package gdg.android101.contactsapp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

public class ContactListActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ContactsListAdapter adapter = new ContactsListAdapter(this, 0,
				loadContacts());
		getListView().setAdapter(adapter);
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		// TODO retrieve contact using position and start contact detail activity using intent
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
