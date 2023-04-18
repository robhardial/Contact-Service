
public class Contact {
	
	
	private String id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String id,String firstName,String lastName,String phoneNumber,String address) {
		verifyId(id);
		this.id = id;
		
		verifyFirstName(firstName);
		this.firstName = firstName;
		
		verifyLastName(lastName);
		this.lastName = lastName;
		
		verifyPhoneNumber(phoneNumber);
		this.phoneNumber = phoneNumber;
		
		verifyAddress(address);
		this.address = address;
		
	}
	
	private static void verifyId(String id) {
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("ID must be less then 10 chars and can't be null");
		}
	}
	
	private static void verifyFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("First name must be less then 10 chars and can't be null");
		}
	}
	
	private static void verifyLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Last name must be less then 10 chars and can't be null");
		}
	}
	
	private static void verifyPhoneNumber(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Phone number must be 10 chars and can't be null");
		}
	}
	
	private static void verifyAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Address must be less then 30 chars and can't be null");
		}
	}
	
	public String getID() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	
	public void setAddress(String address) {
		this.address = address;
	}
	

}
