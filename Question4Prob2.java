
package com.mycompany.question4prob2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Question4Prob2 {

    public static void main(String[] args) {
        // Using arrays
        try (Scanner scanner = new Scanner(System.in)) {
             System.out.print("\n\n By using Array \n\n");
            // Using arrays
            Student[] studentsArray = new Student[3];
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter details for Student " + (i+1) + ":");
                System.out.print("ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Department: ");
                String department = scanner.nextLine();
                System.out.print("CGPA: ");
                double cgpa = scanner.nextDouble();
                scanner.nextLine(); // Consume newline left-over
                
                // Create Student object and store in array
                studentsArray[i] = new Student(id, name, department, cgpa);
            }
            
            // Display details using arrays
            System.out.println("\nDetails of students using arrays:");
            for (Student student : studentsArray) {
                student.displayDetails();
            }
            
            // Display total number of students using arrays
            Student.displayTotalStudents();
            
            
             System.out.print("\n\n By using ArrayList \n\n");
            // Using ArrayList
            ArrayList<Student> studentsArrayList = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter details for Student " + (i+1) + ":");
                System.out.print("ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Department: ");
                String department = scanner.nextLine();
                System.out.print("CGPA: ");
                double cgpa = scanner.nextDouble();
                scanner.nextLine(); // Consume newline left-over
                
                // Create Student object and add to ArrayList
                studentsArrayList.add(new Student(id, name, department, cgpa));
            }
            
            // Display details using ArrayList
            System.out.println("\nDetails of students using ArrayList:");
            for (Student student : studentsArrayList) {
                student.displayDetails();
            }
            
            // Display total number of students using ArrayList
            Student.displayTotalStudents();
            
                   System.out.print("\n\n By using LinkedList \n\n");
            
            // Using LinkedList
            LinkedList<Student> studentsLinkedList = new LinkedList<>();
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter details for Student " + (i+1) + ":");
                System.out.print("ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Department: ");
                String department = scanner.nextLine();
                System.out.print("CGPA: ");
                double cgpa = scanner.nextDouble();
                scanner.nextLine(); // Consume newline left-over
                
                // Create Student object and add to LinkedList
                studentsLinkedList.add(new Student(id, name, department, cgpa));
            }
            
            // Display details using LinkedList
            System.out.println("\nDetails of students using LinkedList:");
            for (Student student : studentsLinkedList) {
                student.displayDetails();
            }
            
            // Display total number of students using LinkedList
            Student.displayTotalStudents();
        }
    }
    }

