package com.bptn.course.week1;

import java.util.Scanner; // import the Scanner class 

public class Sannner {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String userName;
    
    
    System.out.println("Enter Username");
    userName = myObj.nextLine();
    

       
    System.out.println("Username is: " + userName);  

    myObj.close();
  }
}

