

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	public void testAddContact() {
		Contact contact = new Contact("123456789", "Robert", "Padilla", "0123456789", "123 Street Rd");
		Contact contact2 = new Contact("123456788", "Martin", "Padilla", "0123456788", "124 Street Rd");
		ContactService service = new ContactService();
		assertEquals(true, service.addContact(contact));
		assertEquals(true, service.addContact(contact2));
		assertEquals(false, service.addContact(contact2));
	}
	
	@Test
	public void testDeleteContact() {
		Contact contact = new Contact("123456789", "Robert", "Padilla", "0123456789", "123 Street Rd");
		Contact contact2 = new Contact("123456788", "Martin", "Padilla", "0123456788", "124 Street Rd");
		ContactService service = new ContactService();
		assertEquals(true, service.addContact(contact));
		assertEquals(true, service.addContact(contact2));
		assertEquals(true, service.deleteContact("123456789"));
		assertEquals(true, service.deleteContact("123456788"));
	}
	
	@Test
	public void testUpdateContact() {
		Contact contact = new Contact("123456789", "Robert", "Padilla", "0123456789", "123 Street Rd");
		Contact contact2 = new Contact("123456788", "Martin", "Padilla", "0123456788", "124 Street Rd");
		ContactService service = new ContactService();
		assertEquals(true, service.addContact(contact));
		assertEquals(true, service.addContact(contact2));
		assertEquals(true, service.updateContact("123456789", "Robertioo", "Padilla", "0123456789", "123 Street Rd"));
		assertEquals(contact.getFirstName(), "Robertioo");
		
		// update number, address
		assertEquals(true, service.updateContact("123456789", "Robertioo", "Padilla", "0000000000", "12345 Street Rd"));
		assertEquals(contact.getPhoneNumber(), "0000000000");
		assertEquals(contact.getAddress(), "12345 Street Rd");
		
		// update first, last
		assertEquals(true, service.updateContact("123456788", "Martinez", "Padillaza", "0123456788", "124 Street Rd"));
		assertEquals(contact2.getLastName(), "Padillaza");
		assertEquals(contact2.getFirstName(), "Martinez");
		
		
		
	}
}
