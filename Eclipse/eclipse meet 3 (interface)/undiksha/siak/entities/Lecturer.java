package id.ac.undiksha.siak.entities;

public class Lecturer extends Person {
	private String nip;
	private String studyProgram;
	private String departement;
	private String faculty;
	
	public Lecturer() {
		super();
		this.nip 			= "<invalid nip>";
		this.studyProgram 	= "<invalid Study Program>";
		this.departement 	= "<invalid Departement>";
		this.faculty 		= "<invalid Faculty>";
	}
	
	public void printAllInfo() {
		System.out.println("Nip: " 				+ this.nip);
		System.out.println("Name: " 			+ getName());
		System.out.println("Address: " 			+ getAddress());
		System.out.println("Study Program: " 	+ this.studyProgram);
		System.out.println("Departement: " 		+ this.departement);
		System.out.println("Fakulty: " 			+ this.faculty);
		
		System.out.println("Gender: " +
				(getGender() ? "Male" : "Female"));
	}
	
	public Lecturer(String name, String address, boolean gender, String nip, String studyProgram, String departement,
			String faculty) {
		super(name, address, gender);
		this.nip 			= nip;
		this.studyProgram 	= studyProgram;
		this.departement 	= departement;
		this.faculty 		= faculty;
	}

	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
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
