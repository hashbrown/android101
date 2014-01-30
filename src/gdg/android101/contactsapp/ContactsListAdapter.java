package gdg.android101.contactsapp;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class ContactsListAdapter extends ArrayAdapter<Contact> {

	public ContactsListAdapter(Context context, int resource, List<Contact> contacts) {
		super(context, resource, contacts);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		// TODO Implement this
		
		return null;
	}

}
