public class Address {

	private String street;
	private String city;
	private String state;
	
	public Address(String state, String city, String street) {
		this.state = state;
		this.city = city;
		this.street = street;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}