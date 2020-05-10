package com.oops.level2;

public class Address {
	private String line1;
	private String city;
	private String country;
	private String landmark;
	private String zip;

	public Address(String line1, String city, String country, String landmark, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.country = country;
		this.landmark = landmark;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return line1 + " " + city + " " + country + " " + landmark + " " + zip;
	}

}
