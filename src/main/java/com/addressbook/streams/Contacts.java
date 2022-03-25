/**
 *@PROBLEM_STATEMENT : UC1
 *Ability To Create Contacts
 *@File Contacts.java
 *@author Suraj Chaudhary
 *@Date 25-Mar-2022
 */
package com.addressbook.streams;

/**
 * @Purpose :Take contacts with parameter
 * @Param :Firstname laste etc
 * @Function :add contact to Phonebook
 * @Return :null
 */
public class Contacts {
	public String firstName;
	public String lastName;
	public String city;
	public String state;
	public String email;
	public String phoneNumber;
	public String zip;

	/**
	 * @param firstName2
	 * @param lastName2
	 * @param city2
	 * @param state2
	 * @param email2
	 * @param phoneNumber2
	 * @param zip2
	 */
	public Contacts(String firstName2, String lastName2, String city2, String state2, String email2,
			String phoneNumber2, String zip2) {
		// TODO Auto-generated constructor stub
	}

	public void Contact(String firstName, String lastName, String city, String state, String email, String phoneNumber,
			String zip) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.zip = zip;

	}

	/**
	 * @Purpose :Take display string contacts with parameter
	 * @Param :Firstname laste etc
	 * @Function :to display string
	 * @Return :string
	 */
	public String toString() {
		return "\n FirstName=" + firstName + ", LastName=" + lastName + ", city=" + city + ", state=" + state
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", zip=" + zip + "\n";
	}

}
