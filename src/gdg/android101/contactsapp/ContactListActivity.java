package gdg.android101.contactsapp;

import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;

public class ContactListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        ContactsListAdapter adapter = new ContactsListAdapter(this, 0, loadContacts());
        getListView().setAdapter(adapter);
    }


    private List<Contact> loadContacts() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
