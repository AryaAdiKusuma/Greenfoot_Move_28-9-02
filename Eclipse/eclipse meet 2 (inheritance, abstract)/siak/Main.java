package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.*;
public class Main {

	public static void main(String[] args) {
		Student siA = new Student("KEKE", "BULELENG", false, "12345", "Komputer", "TIK", "FTK");
		Staff siB = new Staff("Nyoman Bagler", "Pangkung Paruk", true, "2222", "Unit 3");
		Lecturer siC = new Lecturer("Nyoman Kusuma", "Penarukan", true, "3333", "ILKOM", "Tik", "FTK");
		siA.printAllInfo();
		siB.printAllInfo();
		siC.printAllInfo();
//		Person person1 = new Person;
//		person1.setName("ADI");
//		person1.setAddress("Singaraja");
//		Student std1 = new Student();
//		std1.setName("Adi");
//		std1.setAddress("Singaraja");
//		std1.printAllInfo();
//		System.out.println(std1.getAddress());
//		System.out.println(std1.getName());
		//overidding

		
	}

}
