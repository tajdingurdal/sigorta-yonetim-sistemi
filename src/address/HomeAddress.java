package address;

public class HomeAddress extends Address {

	private static int id = (AddressManager.addressList.get(AddressManager.addressList.size() - 1).getId() + 1);
	private int streetNo;
	private int apartmentNumber;

	public HomeAddress(String adressName, String city, String country, int zipCode, int streetNo, int apartmentNumber) {

		super(adressName, city, country, zipCode, id);
		this.streetNo = streetNo;
		this.apartmentNumber = apartmentNumber;
	}

	public int getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}

	public int getApartmentNumber() {
		return apartmentNumber;
	}

	public void setApartmentNumber(int apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

}
