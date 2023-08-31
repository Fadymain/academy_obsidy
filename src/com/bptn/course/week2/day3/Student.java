package com.bptn.course.week2.day3;

public class Student {
	
	// Declare the variables (instance and static)
	private String name;
	private int grade;
	private static String principalName = "Ms. Mckoy";
	private String studentID;
	private static int nextID = 100;
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
		this.studentID = generateStdID(name);
		nextID++;
	}
	
	private String generateStdID(String name) {
		char firstInitial = Character.toUpperCase(name.charAt(0));
		return firstInitial + "" + nextID;
	}

	
	public static void newPrincipal(String newPrincipalName) {
		principalName = newPrincipalName;
	}
	
	public static void resetID() {
		nextID = 100;
	}
	
	public String toString() {
		return name + " " + studentID;
	}
    
    
    
    // Do not modify the code below:
    public static void main(String[] args) {
        Student s1 = new Student("Muhammed", 11);
        Student s2 = new Student("Alan", 11);
        Student s3 = new Student("Sophie", 11);

        System.out.println("Principal Name for student 1: " + Student.principalName);
        System.out.println("Student ID for student 1: " + s1.studentID);
        System.out.println("Student ID for student 2: " + s2.studentID);
        System.out.println("Student ID for student 3: " + s3.studentID);

        Student.newPrincipal("Mr. McKoy");
        System.out.println("New principal name: " + Student.principalName);

        Student.resetID();
        Student s4 = new Student("kevin", 11);
        System.out.println("Student ID for student 4: " + s4.studentID);
        System.out.println("String representation of student 4: " + s4.toString());
    }

}
