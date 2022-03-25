/**
 *@PROBLEM_STATEMENT : UC1
 *@author Suraj Chaudhary
 *@Date 25-Mar-2022
 */
package com.addressbook.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @Purpose :Take contacts with parameter
 * @Param :Firstname laste etc
 * @Function :add contact to Phonebook
 * @Return :null
 */
public class AddressBook {
	static List<Contacts> list;

	public AddressBook(List<Contacts> list2) {
		this.list = list2;
	}

	public AddressBook() {

	}

	public List<Contacts> addContact() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First name");
		String firstName = s.nextLine();

		System.out.println("Enter the Last name");
		String lastName = s.nextLine();

		System.out.println("Enter the City name");
		String city = s.nextLine();

		System.out.println("Enter the State name");
		String state = s.nextLine();

		System.out.println("Enter the email");
		String email = s.nextLine();

		System.out.println("Enter the Phone number");
		String phoneNumber = s.nextLine();

		System.out.println("Enter the Zip");
		String zip = s.nextLine();

		Contacts contact = new Contacts(firstName, lastName, city, state, email, phoneNumber, zip);

		list.add(contact);
		return list;

	}

	/**
	 * @Purpose :Take display string contacts with parameter main
	 * @Param :Firstname laste etc
	 * @Function :to display string
	 * @Return :string
	 */
	public static void main(String[] args) {
		List<Contacts> list = new ArrayList<Contacts>();

		System.out.println("Welcome to AddressBook program");
		AddressBook addressBook = new AddressBook(list);
		addressBook.addContact();
		// using stream to Display the contacts
		System.out.println("Displaying the contacts of contactPersons");
		List<Object> result = list.stream().collect(Collectors.toList());
		System.out.println(result);

	}

	/**
	 * @purpose :
	 * @param :
	 * @function :
	 * @return :
	 */
	public List<Contacts> getcontactList() {

		return list;
	}
}
