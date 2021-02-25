package exercise1;

public class Student {
	private String name;
	private float math;
	private float physical;
	private float english;
	
	public Student() {
	}
	
	public Student(String name, float math, float physical, float english) {
		super();
		this.name = name;
		this.math = math;
		this.physical = physical;
		this.english = english;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMath() {
		return math;
	}
	public void setMath(float math) {
		this.math = math;
	}
	public float getPhysical() {
		return physical;
	}
	public void setPhysical(float physical) {
		this.physical = physical;
	}
	public float getEnglish() {
		return english;
	}
	public void setEnglish(float english) {
		this.english = english;
	}
	public float getGPA() {
		return (this.math + this.physical + this.english) / 3;
	}
	
	
}
