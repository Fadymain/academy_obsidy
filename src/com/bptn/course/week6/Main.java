package com.bptn.course.week6;

//Your package name goes here

import java.sql.Connection;

public class Main {
	    public static void main(String[] args) {
	    	StudentAppClass jdbc = new StudentAppClass();
	        Connection conn = jdbc.createConnection();
//	        jdbc.getAllStudents(conn);
	        jdbc.getStudentById(conn, 1);
	        jdbc.addStudent(conn, 1, "Bob Smith", "bob@example.com", "123493");
	        jdbc.closeConnection(conn);
	    }
}
