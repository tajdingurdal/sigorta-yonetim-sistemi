package user;

import java.util.ArrayList;
import java.util.Date;

import address.Address;

public class Individual extends User {

	public Individual(String name, String surname, String email, String password, String job, int age,
			ArrayList<Address> address, Date lastLoginDate) {
		super(name, surname, email, password, job, age, address, lastLoginDate);
	}

	public Individual(String name, String surname, String email, String password, String job, int age,
			ArrayList<Address> address) {
		super(name, surname, email, password, job, age, address);
	}

	@Override
	public void addInsurancePolicy() {
		System.out.println("Insurance Policy for Individual");

	}

}
