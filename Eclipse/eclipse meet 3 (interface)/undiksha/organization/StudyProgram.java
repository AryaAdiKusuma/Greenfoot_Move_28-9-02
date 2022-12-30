package id.ac.undiksha.organization;

import id.ac.undiksha.siak.entities.Lecturer;


public class StudyProgram implements Department, Faculty{
	private String studyProgramCode;
	private String studyProgramName;
	public Lecturer coordinator = new Lecturer();
	
	public Lecturer getCoordinator() {
		return coordinator;
	}
	public void setCoordinator(Lecturer coordinator) {
		this.coordinator = coordinator;
	}
	public StudyProgram() {
		
	}
	public StudyProgram(String studyProgramCode, String studyProgramName) {
		super();
		this.studyProgramCode = studyProgramCode;
		this.studyProgramName = studyProgramName;
	}
	
	public String getStudyProgramCode() {
		return studyProgramCode;
	}
	public void setStudyProgramCode(String studyProgramCode) {
		this.studyProgramCode = studyProgramCode;
	}
	public String getStudyProgramName() {
		return studyProgramName;
	}
	public void setStudyProgramName(String studyProgramName) {
		this.studyProgramName = studyProgramName;
	}
	private String departmentName;
	private String departmentCode;
	
	@Override
	public void setDeptName(String deptName) {
		this.departmentName = deptName;
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getDeptName() {
		// TODO Auto-generated method stub
		return this.departmentName;
	}
	@Override
	public void setDeptCode(String deptCode) {
		// TODO Auto-generated method stub
		this.departmentCode = deptCode;
	}
	@Override
	public String getDeptCode() {
		// TODO Auto-generated method stub
		return this.departmentCode;
	}
	@Override
	public void setFacultyName(String FacultyName) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getFacultyName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
