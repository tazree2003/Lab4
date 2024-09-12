
package com.mycompany.question4prob1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class Question4Prob1 {

   public static void main(String[] args) {
       // Using arrays
       try (Scanner scanner = new Scanner(System.in)) {
           // Using arrays
           Book[] booksArray = new Book[3];
           for (int i = 0; i < 3; i++) {
               System.out.println("Enter details for Book " + (i+1) + ":");
               System.out.print("Title: ");
               String title = scanner.nextLine();
               System.out.print("Author: ");
               String author = scanner.nextLine();
               System.out.print("Year: ");
               int year = scanner.nextInt();
               scanner.nextLine(); // Consume newline left-over
               
               // Create Book object and store in array
               booksArray[i] = new Book(title, author, year);
           }
           
           // Display details using arrays
           System.out.println("\nDetails of books using arrays:");
           for (Book book : booksArray) {
               book.displayDetails();
           }
           
           // Display total number of books using arrays
           Book.displayTotalBooks();
           
            System.out.print("\n\nNow We will print for ArrayList\n\n");
           
           // Using ArrayList
           ArrayList<Book> booksArrayList = new ArrayList<>();
           for (int i = 0; i < 3; i++) {
               System.out.println("Enter details for Book " + (i+1) + ":");
               System.out.print("Title: ");
               String title = scanner.nextLine();
               System.out.print("Author: ");
               String author = scanner.nextLine();
               System.out.print("Year: ");
               int year = scanner.nextInt();
               scanner.nextLine(); // Consume newline left-over
               
               // Create Book object and add to ArrayList
               booksArrayList.add(new Book(title, author, year));
           }
           
           // Display details using ArrayList
           System.out.println("\nDetails of books using ArrayList:");
           for (Book book : booksArrayList) {
               book.displayDetails();
           }
           
           // Display total number of books using ArrayList
           Book.displayTotalBooks();
           
           
              System.out.print("\n\nNow We will print for LinkedList\n\n");
           // Using LinkedList
           LinkedList<Book> booksLinkedList = new LinkedList<>();
           for (int i = 0; i < 3; i++) {
               System.out.println("Enter details for Book " + (i+1) + ":");
               System.out.print("Title: ");
               String title = scanner.nextLine();
               System.out.print("Author: ");
               String author = scanner.nextLine();
               System.out.print("Year: ");
               int year = scanner.nextInt();
               scanner.nextLine(); // Consume newline left-over
               
               // Create Book object and add to LinkedList
               booksLinkedList.add(new Book(title, author, year));
           }
           
           // Display details using LinkedList
           System.out.println("\nDetails of books using LinkedList:");
           for (Book book : booksLinkedList) {
               book.displayDetails();
           }
           
           // Display total number of books using LinkedList
           Book.displayTotalBooks();
       }
    }
}
