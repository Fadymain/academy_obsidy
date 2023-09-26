package com.bptn.course.week4.day5.challenge.listToMap;

public class Student {
	
	int id;
	String name;
	int age;

    public Student(int id, String name, int age) {
    	this.id = id;
    	this.name = name;
    	this.age = age;
    }
    
    
   
   
    public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	//toString() method
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
