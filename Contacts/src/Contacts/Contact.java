package Contacts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Contact implements Serializable{
	private String name;
	private String phone;
	private Address address;
	
	
	@Override
	public String toString() {
		return "Contact: " + this.name;
	}

	public Contact(String name, String phone, Address address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	public Contact (String name, String phone) {
		this.name = name;
		this.phone = null;
		this.address = null;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void save(String directory) {
		File file = new File(directory);
		
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			FileOutputStream fout = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(this);
			
			fout.close();
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static Contact decode (String directory) {
		Contact c = null;
		
		try {	
			FileInputStream fin = new FileInputStream(directory);
			ObjectInputStream ois = new ObjectInputStream(fin);
			
			if (fin.available() != 0){
				c = (Contact) ois.readObject();
			}
			
			fin.close();
			ois.close();
			
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return c;
		
	}
	
}
