package address;

import java.util.ArrayList;
import java.util.List;

import account.Account;
import user.User;

public class AddressManager extends Account {

	public static List<Address> addressList = new ArrayList<>();

	public void addNewAddressForHome(HomeAddress home) {

		HomeAddress homeAddress = new HomeAddress(home.getAdressName(), home.getCity(), home.getCountry(),
				home.getZipCode(), home.getStreetNo(), home.getApartmentNumber());
		getUser().getAddress().add(homeAddress);
		addressList.add(homeAddress);

	}

	public void addNewAddressForBusiness(BusinessAddress busi) {
		BusinessAddress businessAddress = new BusinessAddress(busi.getCompanyName(), busi.getAdressName(),
				busi.getCity(), busi.getCountry(), busi.getZipCode());
		getUser().getAddress().add(businessAddress);
		addressList.add(businessAddress);
	}

	public boolean deleteAddressById(int id) {

		for (int i = 0; i < addressList.size(); i++) {
			if (addressList.get(i).getId() == id) {
				addressList.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public void addInsurancePolicy() {

	}

}
