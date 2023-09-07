package com.bptn.course.week3.day3.challenge;
import java.util.*;
import java.util.stream.Collectors;

public class University {
	
	// property - get inspired by the UML diagram
	List<Student> students = new ArrayList<>();


    public void addStudent(Student s) {
    	students.add(s);
    }

    public Student getStudent(long studentId) {
    	for (Student student : students) {
    		if(student.getStudentId() == studentId) {
    			return student;
    		}
    	}
    	return null;
    }

    public List<Student> searchStudent(String userNamePrefix) {
    	return students.stream()
                .filter(student -> student.getUserName().startsWith(userNamePrefix))
                .collect(Collectors.toList());
    }

    public boolean deleteStudent(long studentId) {
    	Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getStudentId() == studentId) {
                iterator.remove(); 
                return true; 
            }
        }
        return false;
    }

}
