package id.ac.undiksha.siak.entities;

public class Lecturer {
	private String nip;
	private String name;
	private String address;
	private boolean gender;
	private String studyProgram;
	private String departement;
	private String faculty;
	
	public Lecturer() {
		this.name = "<invalid name>";
		this.nip = "<invalid nip>";
		this.address = "<invalid address>";
		this.studyProgram = "<invalid Study Program>";
		this.departement = "<invalid Departement>";
		this.faculty = "<invalid Faculty>";
	}
	
	public void printAllInfo() {
		System.out.println("Nip: " + this.nip);
		System.out.println("Name: " + this.name);
		System.out.println("Address: " + this.address);
		System.out.println("Study Program: " + this.studyProgram);
		System.out.println("Departement: " + this.departement);
		System.out.println("Fakulty: " + this.faculty);
		
		System.out.println("Gender: " +
				(gender ? "Male" : "Female"));
	}
	
	public Lecturer(String nip, String name, String address, boolean gender, String studyProgram, String departement,
			String faculty) {
		super();
		this.nip = nip;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.studyProgram = studyProgram;
		this.departement = departement;
		this.faculty = faculty;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getStudyProgram() {
		return studyProgram;
	}
	public void setStudyProgram(String studyProgram) {
		this.studyProgram = studyProgram;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
 
}
