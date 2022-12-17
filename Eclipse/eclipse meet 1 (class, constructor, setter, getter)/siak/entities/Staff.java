package id.ac.undiksha.siak.entities;

public class Staff {
	private String nip;
	private String name;
	private boolean gender;
	private String address;
	private String unit;
	
	public Staff() {
		this.name = "<ivalid name>";
		this.nip = "<ivalid nip>";
		this.address = "<ivalid address>";
		this.unit = "<invalid Unit>";
	}
	
	public void printAllInfo() {
		System.out.println("Nip: " + this.nip);
		System.out.println("Name: " + this.name);
		System.out.println("Address: " + this.address);
		System.out.println("Unit: " + this.unit);
		
		System.out.println("Gender: " +
				(gender ? "Male" : "Female"));
	}
	public Staff(String nip, String name, boolean gender, String address, String unit) {
		super();
		this.nip = nip;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.unit = unit;
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	

}
