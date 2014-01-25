package gdg.android101.contactsapp;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ContactsListAdapter extends ArrayAdapter<Contact> {

	public ContactsListAdapter(Context context, int resource, List<Contact> contacts) {
		super(context, resource, contacts);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.contact_list_row, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.contact_name);
		textView.setText(getItem(position).getFirstName());

		return rowView;
	}

}
