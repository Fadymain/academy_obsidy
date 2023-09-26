package com.bptn.course.week4.day5.challenge.listToMap;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
	
	public static Map<Integer, Student> convertStudentListToMap(List<Student> students) {
		return students.stream()
							.collect(Collectors.toMap(Student::getId, student -> student));
	}

    
    public static void main(String[] args) {

    	 List<Student> students = new ArrayList<>();
        
    	 students.add(new Student(1, "Alice", 20));
    	 students.add(new Student(2, "Bob", 22));
    	 students.add(new Student(3, "Charlie", 21));

    	 Map<Integer, Student> studentMap = convertStudentListToMap(students);
       
        System.out.println("Students Map: "+ studentMap);
    }

}
