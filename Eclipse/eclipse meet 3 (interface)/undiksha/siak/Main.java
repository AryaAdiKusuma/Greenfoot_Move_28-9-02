package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.*;
public class Main {

	public static void main(String[] args) {
		Student siA = new Student();
		siA.setName("Arya");
		siA.setAddress("Gobleg");
		siA.setNim("8888");
		siA.setGender(true);
		siA.getStudyProgram().setStudyProgramCode("222");
		siA.getStudyProgram().setStudyProgramName("Ilmu Komputer");
//		Student -> Study Program -> Coordinator -> Name
		siA.getStudyProgram().getCoordinator().setName("Pak Haji");
		siA.getStudyProgram().getCoordinator().setNip("12233455");
		siA.getStudyProgram().getCoordinator().setGender(true);
		siA.getStudyProgram().getCoordinator().setAddress("Penarukan");
		siA.printAllInfo();
		siA.getName();
		siA.getStudyProgram().getStudyProgramName();		

		
	}

}
