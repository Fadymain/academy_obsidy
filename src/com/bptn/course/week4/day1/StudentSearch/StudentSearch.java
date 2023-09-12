package com.bptn.course.week4.day1.StudentSearch;

public class StudentSearch {
	
    public static Student searchStudent(Student[] students, int rollNumber)
    {
        
        for(Student student : students)
        {
            if(student.getRollNumber() == rollNumber) {
            	return student;
            }
        }
        return null;
    }

    
    public static void main(String[] args) 
    {
    	Student[] students = new Student[5];
        students[0] = new Student(101, "John");
        students[1] = new Student(102, "Alice");
        students[2] = new Student(103, "Bob");
        students[3] = new Student(104, "Emily");
        students[4] = new Student(105, "Mike");

        int targetRollNumber = 103;

        Student targetStudent = searchStudent(students, targetRollNumber);
       

        if (targetStudent != null) 
        {
            System.out.println("Student found:");
            System.out.println("Roll Number: " + targetStudent.getRollNumber());
            System.out.println("Name: " + targetStudent.getName());
        } 
        else 
        {
            System.out.println("Student not found!");
        }
    }

}
