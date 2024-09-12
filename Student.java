
package com.mycompany.question4prob2;

public class Student {
     // Object variables
    private int id;
    private String name;
    private String department;
    private double cgpa;
    
    // Class variable
    private static int totalStudents = 0;
    private static String university = "ULAB"; // Default university
    
    // Parameterized constructor
    public Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        totalStudents++; // Increment totalStudents count for each new instance
    }
    
    // Method to display student details
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
        System.out.println();
    }
    
    // Class method to display total number of students
    public static void displayTotalStudents() {
        System.out.println("Total number of students: " + totalStudents);
    }
}
