package account;

import java.util.Set;
import java.util.TreeSet;

import exception.InvalidAuthenticationException;
import request.LoginRequest;
import user.Enterprise;
import user.Individual;
import user.User;

public class AccountManager {

	private TreeSet<Account> individualAndEnterpriseAccounts = new TreeSet<>();

	public boolean login(LoginRequest loginrequest) {

		for (Account account : individualAndEnterpriseAccounts) {

			if (account.getUser().getEmail().equals(loginrequest.getEmail())
					&& account.getUser().getPassword().equals(loginrequest.getPassword())) {
				System.out.println("Giriþ baþarýlý");
				account.showUserInfo(account.getUser());
				account.getUser().setAuthenticationStatus(account.getUser().getAuthenticationStatus().SUCCESS);
				return true;
			}

			account.getUser().setAuthenticationStatus(account.getUser().getAuthenticationStatus().FAIL);
		}

		throw new InvalidAuthenticationException("Giriþ baþarýsýz");
	}

	public void registerIndividual(User user) {
		Individual individual = new Individual(user.getName(), user.getSurname(), user.getEmail(), user.getPassword(),
				user.getJob(), user.getAge(), user.getAddress());
		this.individualAndEnterpriseAccounts.add(individual);

	}

	public void registerEnterprise(User user) {
		Enterprise enterprise = new Enterprise(user.getName(), user.getSurname(), user.getEmail(), user.getPassword(),
				user.getJob(), user.getAge(), user.getAddress());
		this.individualAndEnterpriseAccounts.add(enterprise);

	}

	/*
	 * bu sýnýf içinde login isminde bir fonksiyon tanýmlayýnýz. Bu fonksiyon
	 * dýþarýdan verilen email ve þifre bilgisini alýp Account listesi üzerinde
	 * dolaþýp uygun bir giriþ iþlemi bulursa Account nesnesini çaðrýldýðý yere
	 * dönecektir.
	 */
}
