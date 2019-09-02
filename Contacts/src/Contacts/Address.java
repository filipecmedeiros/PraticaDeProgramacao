package Contacts;

import java.io.Serializable;

public class Address implements Serializable{
	private String country;
	private String state;
	private String city;
	private String zipcode;
	private String neighborhood;
	private String street;
	private String number;
	private String complement;

	@Override
	public String toString() {
		return "Address: " + this.street + ", " + this.number;
	}

	public Address(String country, String state, String city, String zipcode,
			String neighborhood, String street, String number, String complement) {
		this.country = country;
		this.state = state;
		this.city = city;
		this.zipcode = zipcode;
		this.neighborhood = neighborhood;
		this.street = street;
		this.number = number;
		this.complement = complement;
	}
	
	public Address (String street, String number) {
		this.street = street;
		this.number = number;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

}
