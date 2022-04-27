package address;

public class BusinessAddress extends Address {

	private String companyName;
	private static int id = (AddressManager.addressList.get(AddressManager.addressList.size() - 1).getId() + 1);

	public BusinessAddress(String companyName, String adressName, String city, String country, int zipCode) {
		super(adressName, city, country, zipCode, id);
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
