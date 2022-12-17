package id.ac.undiksha.siak.entities;

public class Student extends Person{

	private String nim;
	private String studyProgram;
	private String faculty;
	private String departement;

	public Student() {
		super();
		this.nim 			= "<ivalid nim>";
		this.studyProgram 	= "<invalid Study Program>";
		this.departement 	= "<ivalid departement>";
		this.faculty 		= "<ivalid faculty>";
	}
	public void printAllInfo() {
		System.out.println("Name: " 			+ getName());
		System.out.println("Address: " 			+ getAddress());
		System.out.println("Nim: " 				+ this.nim);
		System.out.println("Study Program: " 	+ this.studyProgram);
		System.out.println("Departement: " 		+ this.departement);
		System.out.println("Fakulty: " 			+ this.faculty);
		
		System.out.println("Gender: " +
				(getGender() ? "Male" : "Female"));
	}
	
public Student(String name, String address, boolean gender,
		String nim, String studyProgram, String faculty,
		String departement) {
		super(name, address, gender);
		this.nim 			= nim;
		this.studyProgram 	= studyProgram;
		this.faculty 		= faculty;
		this.departement 	= departement;
	}

	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getStudyProgram() {
		return studyProgram;
	}
	public void setStudyProgram(String studyProgram) {
		this.studyProgram = studyProgram;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
}