package id.ac.undiksha.siak.entities;

public class Staff extends Person{
	private String nip;
	private String unit;
	
	public Staff() {
		super();
		this.nip = "<ivalid nip>";
		this.unit = "<invalid Unit>";
	}
	
	public void printAllInfo() {
		System.out.println("Name: " 	+ getName());
		System.out.println("Address: " 	+ getAddress());
		System.out.println("Nip: " 		+ this.nip);
		System.out.println("Unit: " 	+ this.unit);
		
		System.out.println("Gender: " +
				(getGender() ? "Male" : "Female"));
	}
	
	public Staff(String name, String address, boolean gender, String nip,  String unit) {
		super(name, address, gender);
		this.nip 	= nip;
		this.unit 	= unit;
	}
	
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	

}
