package user;

import java.util.ArrayList;
import java.util.Date;

import address.Address;

public class Enterprise extends User {

	public Enterprise(String name, String surname, String email, String password, String job, int age,
			ArrayList<Address> address, Date lastLoginDate) {
		super(name, surname, email, password, job, age, address, lastLoginDate);
	}

	public Enterprise(String name, String surname, String email, String password, String job, int age,
			ArrayList<Address> address) {
		super(name, surname, email, password, job, age, address);
	}

	@Override
	public void addInsurancePolicy() {
		// TODO Auto-generated method stub

	}

}
