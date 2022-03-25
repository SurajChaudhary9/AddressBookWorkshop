/**
 *@PROBLEM_STATEMENT : UC
 *@author Suraj Chaudhary
 *@Date 25-Mar-2022
 */
package com.addressbook.streams;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AddressBookTest {
	static AddressBook addressBook;

	@BeforeClass
	public static void init() {
		addressBook = new AddressBook();
		System.out.println("Welcome to the Address Book System");
	}

	@Test
	public void givenAContact_IfMatchesWithTheListReturnTrue() {
		try {
			Contacts contacts = new Contacts("Suraj", "Chaudhary", "Pune", "Maharashtra", "123@gmail.com", "7770999556",
					"411062");
			addressBook.addContact();
			List<Contacts> addressBookList = addressBook.getcontactList();
			Assert.assertTrue(addressBookList.contains(contacts));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
