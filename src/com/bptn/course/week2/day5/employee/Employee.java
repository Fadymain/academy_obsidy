package com.bptn.course.week2.day5.employee;

public class Employee {
	// Instance variable to store salary
    private int salary;
    private int hoursPerDay;
   
   // Instance variable to store hours per day worked by employee
   public Employee(int salary, int hoursPerDay) {
        this.salary = salary;
        this.hoursPerDay = hoursPerDay;
    }

   
   public int getSalary() {
       setHoursPerDay(this.hoursPerDay);
       setSalary(this.salary);
        return salary;
    }

    public void setHoursPerDay(int hoursPerDay) {
        if (this.hoursPerDay > 6) {
            this.salary += 5;
        }
        this.hoursPerDay = hoursPerDay;
    }

    public void setSalary(int salary) {
        if (salary < 500) {
            this.salary += 10;
        } else {
            this.salary = salary;
        }
    } 

}
