package address;

public abstract class Address {

	private int id;
	private String adressName;
	private String city;
	private String country;
	private int zipCode;

	public Address(String adressName, String city, String country, int zipCode, int id) {
		super();
		this.adressName = adressName;
		this.city = city;
		this.country = country;
		this.zipCode = zipCode;
		this.id = id;

	}

	public String getAdressName() {
		return adressName;
	}

	public void setAdressName(String adressName) {
		this.adressName = adressName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
