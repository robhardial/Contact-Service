

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	public void testContactClass() {
		Contact contact = new Contact("123456789", "Robert", "Padilla", "0123456789", "123 Street Rd");
		assertTrue(contact.getID().equals("123456789"));
		assertTrue(contact.getFirstName().equals("Robert"));
		assertTrue(contact.getLastName().equals("Padilla"));
		assertTrue(contact.getPhoneNumber().equals("0123456789"));
		assertTrue(contact.getAddress().equals("123 Street Rd"));
	}
	
	@Test
	public void testExceptions() {
		
		// id too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("01234567899", "Robert", "Padilla", "0123456789", "123 Street Rd");
		});
		
		// id is null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(null, "Robert", "Padilla", "0123456789", "123 Street Rd");
		});
				
				// first name too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("123456789", "Robertrober", "Padilla", "0123456789", "123 Street Rd");
		});
				
				// first null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("123456789", null, "Padilla", "0123456789", "123 Street Rd");
		});
				
				// last name too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("123456789", "Robert", "Padillapadi", "0123456789", "123 Street Rd");
		});
				
				// last null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("123456789", "Robert", null, "0123456789", "123 Street Rd");
		});
				
				// number is too short
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("123456789", "Robert", "Padilla", "012", "123 Street Rd");
		});
				
				// number is null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("123456789", "Robert", "Padilla", null, "123 Street Rd");
		});
				
				// address is too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("123456789", "Robert", "Padilla", "0123456789", "1111111111111111111111111111111111111");
		});
				
				// address is null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("123456789", "Robert", "Padilla", "0123456789", null);
		});		
		
	}

}
