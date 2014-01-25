package gdg.android101.contactsapp;

public class Contact {

	private String firstName;
	private String lastName;
	private String phone;

	public Contact(String firstName, String lastName, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return lastName + ", " + firstName;
	}

}
