package user;

import java.util.ArrayList;
import java.util.Date;

import account.Account;
import address.Address;

public abstract class User extends Account {

	private String name;
	private String surname;
	private String email;
	private String password;
	private String job;
	private int age;
	private ArrayList<Address> address;
	private Date lastLoginDate;

	public User(String name, String surname, String email, String password, String job, int age,
			ArrayList<Address> address, Date lastLoginDate) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.job = job;
		this.age = age;
		this.address = address;
		this.lastLoginDate = lastLoginDate;
	}

	public User(String name, String surname, String email, String password, String job, int age,
			ArrayList<Address> address) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.job = job;
		this.age = age;
		this.address = address;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<Address> getAddress() {
		return address;
	}

	public void setAddress(ArrayList<Address> address) {
		this.address = address;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

}
