package Main;


import Contacts.Address;
import Contacts.Contact;

public class Main {

	public static void main(String[] args) {
		String directory = "./Contacts.txt";
		
		Address address = new Address ("Rua da frente", "123");
		Contact c = new Contact ("João da Silva", "81 999999999", address);
		
		c.save(directory);
		
		Contact c1;
		c1 = Contact.decode(directory);
		System.out.println(c1);
	}

}
