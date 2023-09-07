package com.bptn.course.week3.day3.challenge;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {

		Student student1 = new Student(
				123,                  
				"testUsername1",     
				"password1",         
				"Tola",               
				"Fadairo",                 
				"tfad@gmail.com",  
				"123-456-7890",        
				"123 Main St",         
				"Male",                
				new Date(),            
				new Date(),            
				1001,                  
				"Computer Science"
				);
		
	    Student student2 = new Student(
	    		456,                   
	    	    "testUsername2",        
	    	    "password2",            
	    	    "Joan",                
	    	    "Row",                
	    	    "j.row@gmail.com",
	    	    "987-654-3210",        
	    	    "456 Elm St",          
	    	    "Female",              
	    	    new Date(),         
	    	    new Date(),           
	    	    1002,                  
	    	    "Mathematics"
	    		);

        // Create instance of university called "university" and populate it with the students.
	    University university = new University();
	    university.addStudent(student1);
	    university.addStudent(student2);

        System.out.println("\nUniversity ------ \n" + university.students);
        System.out.println("\nGetting student------\n" + university.getStudent(123));
        System.out.println("\nDeleting student------\n" + university.deleteStudent(123));
        System.out.println("\nSeaching student------\n" + university.searchStudent("testUserna"));

        System.out.println("\nUniversity ------ \n" + university.students);

    }

}
