package wissenTech;

public class Address {
	private String AddressLine1;
	private String AddressLine2;
	private String pincode;
	public Address(String addressLine1, String addressLine2, String pincode) {
		super();
		AddressLine1 = addressLine1;
		AddressLine2 = addressLine2;
		this.pincode = pincode;
	}
	public String getAddressLine1() {
		return AddressLine1;
	}
	public String getAddressLine2() {
		return AddressLine2;
	}
	public String getPincode() {
		return pincode;
	}
	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}
	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	

}
