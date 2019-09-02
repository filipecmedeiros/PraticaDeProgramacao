package Contacts;

import java.util.ArrayList;

public class CollectionOfContacts {
	private ArrayList <Contact> contacts;
	
	
	public CollectionOfContacts() {
		this.contacts = null;
	}
	
	
	@Override
	public String toString() {
		String s = "";
		for (int i=0; i<this.getContacts().size(); i++)
			s = s + this.getContacts().get(i) + ", ";
		return s;
	}


	public ArrayList<Contact> getContacts() {
		return contacts;
	}


	public void setContacts(ArrayList<Contact> contacts) {
		this.contacts = contacts;
	}
	
	
	public void create(Contact c) {
		this.getContacts().add(c);
	}
	
	
	public Contact read (String name) {
		int j=-1;
		for (int i=0; i<this.getContacts().size();i++) {
			if (this.getContacts().get(i).getName() == name) {
				j=i;
				break;
			}
		}
		return this.getContacts().get(j);
	}
	
	
	public void update (int index, Contact c) {
		
	}
	
	
	public void remove (Contact c) {
		this.getContacts().remove(c);
	}
}
