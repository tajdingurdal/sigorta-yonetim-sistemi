package account;

import java.util.List;
import java.util.Objects;

import address.HomeAddress;
import insurance.Insurance;
import user.User;

public abstract class Account {
// Account s�n�f� m��terinin sisteme giri� sonras�nda t�m bilgilerinin tutuldu�u hesap bilgisidir.

	private User user;
	private AuthenticationStatus authenticationStatus;
	private List<Insurance> listOfInsurance;

	public static final void showUserInfo(User user) {
		System.out.println("Name: " + user.getName() + "\n" + "Surname: " + user.getSurname() + "\n" + "Age: "
				+ user.getAge() + "\n" + "Job: " + user.getJob() + "\n" + "Login Status: "
				+ user.getAuthenticationStatus() + "\n" + "Mail: " + user.getEmail());
	}

	public abstract void addInsurancePolicy();

	public AuthenticationStatus getAuthenticationStatus() {
		return authenticationStatus;
	}

	public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
		this.authenticationStatus = authenticationStatus;
	}

	public List<Insurance> getListOfInsurance() {
		return listOfInsurance;
	}

	public void setListOfInsurance(List<Insurance> listOfInsurance) {
		this.listOfInsurance = listOfInsurance;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(user, other.user);
	}

}
