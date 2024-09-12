
package com.mycompany.question3;

import java.util.LinkedList;
import java.util.Scanner;


public class BookLinkedList {
       public static void main(String[] args) {
        LinkedList<Book> bookList = new LinkedList<>();
           try (Scanner scanner = new Scanner(System.in)) {
               for (int i = 0; i < 3; i++) {
                   System.out.println("Enter details for book " + (i + 1) + ":");
                   System.out.print("Title: ");
                   String title = scanner.nextLine();
                   System.out.print("Author: ");
                   String author = scanner.nextLine();
                   System.out.print("Year: ");
                   int year = scanner.nextInt();
                   scanner.nextLine(); // Consume newline
                   System.out.print("Genre: ");
                   String genre = scanner.nextLine();
                   
                   Book book = new Book(title, author, year, genre);
                   bookList.add(book);
               }
               
               System.out.println("\nBook details:");
               for (Book book : bookList) {
                   book.displayBookDetails();
                   System.out.println();
               }
               
               Book.displayTotalBooks();
           }
    }
    
}
