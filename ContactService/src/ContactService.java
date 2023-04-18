
import java.util.ArrayList;
public class ContactService {
	
	private ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	public boolean addContact(Contact newContact) {
		boolean alreadyAdded = false;
		
		for(Contact contact : contactList) {
			if(contact.equals(newContact)) {
				alreadyAdded = true;
			}
		}
		
		if(!alreadyAdded) {
			contactList.add(newContact);
			System.out.println("New contact added");
			return true;
		}
		else {
			System.out.println("Contact already added");
			return false;
		}
	}
	
	public boolean deleteContact(String id) {
		boolean state = false;
		for(Contact contact : contactList) {
			if (contact.getID().equals(id)) {
				state = contactList.remove(contact);
				if(state) {
					System.out.println("Contact deleted");
					return state;
				}
			}
		}
		System.out.println("Failed to delete contact: no id match");
		return false;
	}
	
	public boolean updateContact(String id,String firstName,String lastName,String phoneNumber,String address) {
		for(Contact contact : contactList) {
			if(contact.getID()== id) {
				contact.setFirstName(firstName);
				contact.setLastName(lastName);
				contact.setPhoneNumber(phoneNumber);
				contact.setAddress(address);
				System.out.println("Contact has been updated");
				return true;
			}
		}
		System.out.println("Contact id not found");
		return false;
	}
}

