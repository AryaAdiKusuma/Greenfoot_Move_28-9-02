package id.ac.undiksha.siak.entities;
import id.ac.undiksha.organization.StudyProgram;
public class Student extends Person{

	private String nim;
	private StudyProgram studyProgram; // = new StudyProgram();


	public Student() {
		super();
		this.nim 			= "<ivalid nim>";
		studyProgram = new StudyProgram();
	}
	public void printAllInfo() {
		System.out.println("Name: " 			+ getName());
		System.out.println("Address: " 			+ getAddress());
		System.out.println("Nim: " 				+ this.nim);
		System.out.println("Study Program code : " 
				+ this.getStudyProgram().getStudyProgramCode());
		System.out.println("Study Program Name : " 
				+ this.getStudyProgram().getStudyProgramName());
		System.out.println("Gender: " +
				(getGender() ? "Male" : "Female"));
		//intresting
		System.out.println("\nCoordinator name: " + this.getStudyProgram().getCoordinator().getName());
		System.out.println("Coordinator name: " + this.getStudyProgram().getCoordinator().getAddress());
		System.out.println("Coordinator name: " + this.getStudyProgram().getCoordinator().getNip());
		System.out.println("Gender: " +
				(this.getStudyProgram().getCoordinator().getGender() ? "Male" : "Female"));
	}
	
public Student(String name, String address, boolean gender,
		String nim, String studyProgramCode, String studyProgramName) {
		super(name, address, gender);
		this.nim 			= nim;
		studyProgram = new StudyProgram(studyProgramCode, studyProgramName);
	}
	
	public StudyProgram getStudyProgram() {
		return studyProgram;
	}
	public void setStudyProgram(StudyProgram studyProgram) {
		this.studyProgram = studyProgram;
	}
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}

}