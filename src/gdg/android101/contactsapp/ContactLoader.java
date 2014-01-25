package gdg.android101.contactsapp;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.util.JsonReader;

public class ContactLoader {

	public List<Contact> loadContacts(Context ctx) throws IOException {
		return readJsonStream(ctx.getAssets().open("contacts.json"));
	}

	public List<Contact> readJsonStream(InputStream in)
			throws IOException {

		JsonReader reader = new JsonReader(new InputStreamReader(in, "UTF-8"));
		
		try {
			return readContactsArray(reader);
		} finally {
			reader.close();
		}
	}

	private List<Contact> readContactsArray(JsonReader reader) throws IOException {
		List<Contact> contacts = new ArrayList<Contact>();

		reader.beginArray();
		while (reader.hasNext()) {
			contacts.add(readContact(reader));
		}
		reader.endArray();
		return contacts;
	}

	private Contact readContact(JsonReader reader) throws IOException {

		String lastName = null;
		String firstName = null;
		String phone = null;

		reader.beginObject();
		while (reader.hasNext()) {
			String name = reader.nextName();
			if (name.equals("last_name")) {
				lastName = reader.nextString();
			} else if (name.equals("first_name")) {
				firstName = reader.nextString();
			} else if (name.equals("phone")) {
				phone = reader.nextString();
			} else {
				reader.skipValue();
			}
		}
		reader.endObject();
		return new Contact(firstName, lastName, phone);
	}

}
