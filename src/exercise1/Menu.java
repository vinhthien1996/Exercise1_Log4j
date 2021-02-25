package exercise1;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Menu {
	private ArrayList<Student> listStudent = new ArrayList<Student>();
	
	static Logger log = Logger.getLogger(Main.class.getName());

	public int getMenu() {
		System.out.println("-----MENU-----");
		System.out.println("1. Add student");
		System.out.println("2. Show student");
		System.out.println("3. Finding student largest and lowest GPA.");

		int choose = 0;
		
		try {			
			Scanner scan = new Scanner(System.in);
			choose = scan.nextInt();
		} catch (Exception e) {
			
			//Log4j error message
			log.error("Input is not number!");
			
			return 0;
		}
		
		return choose;
	}

	public boolean addStudent() {
		String name;
		float math, physical, english;

		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		name = sc.nextLine();
		System.out.println("Math score: ");
		math = sc.nextFloat();
		System.out.println("Physical score: ");
		physical = sc.nextFloat();
		System.out.println("English score: ");
		english = sc.nextFloat();
		Student student = new Student(name, math, physical, english);

		listStudent.add(student);

		System.out.println("Add student success!");
		System.out.println("1. Continue");
		System.out.println("0. Back");
		int result = sc.nextInt();

		if (result == 1)
			return true;
		else
			return false;
	}

	public void showListStudent() {
		System.out.println("-----LIST STUDENT-----");
		for (Student item : listStudent) {
			showStudent(item);
		}
	}

	public void showStudent(Student st) {
		System.out.println("Name: " + st.getName());
		System.out.println("Math: " + st.getMath());
		System.out.println("Physical: " + st.getPhysical());
		System.out.println("English: " + st.getEnglish());
		System.out.println("GPA: " + st.getGPA());
		System.out.println(" ");
	}

	public boolean menuFind() {
		System.out.println("1. Find student largest");
		System.out.println("2. Find student lowest");
		System.out.println("0. Back");

		Scanner scan = new Scanner(System.in);
		int choose = scan.nextInt();

		switch (choose) {
			case 1: {			
				findLargest();
				break;
			}
			case 2: {
				findLowest();
				break;
			}
		}
		return true;
	}

	public void findLargest() {
		int max = 0;
		Student lStudent = new Student();

		for (Student item : listStudent) {
			if (item.getGPA() >= max) {
				lStudent = item;
			}
		}
		System.out.println("-----STUDENT LARGEST-----");
		showStudent(lStudent);
	}

	public void findLowest() {
		float min = listStudent.get(0).getGPA();
		Student lStudent = new Student();

		for (Student item : listStudent) {
			if (item.getGPA() <= min) {
				lStudent = item;
			}
		}
		System.out.println("-----STUDENT LOWEST-----");
		showStudent(lStudent);
	}

}
