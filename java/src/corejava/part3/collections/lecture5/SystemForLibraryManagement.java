package corejava.part3.collections.lecture5;

import java.util.Scanner;
import java.util.Vector;

public class SystemForLibraryManagement {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vector<Book> books = new Vector<>();
        int size = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < size; i++) {

            int id = Integer.parseInt(sc.nextLine());
            String title = sc.nextLine();
            String author = sc.nextLine();

            books.add(new Book(id, title, author));
        }

        System.out.println("Enter bookID to borrow ");
        int borrowId = Integer.parseInt(sc.nextLine());

        boolean bookNotFound = true;
        for (Book b : books) {
            if (b.bookId == borrowId) {
                if (b.available) {
                    bookNotFound = false;
                    b.borrowBook();
                    System.out.println("Book Borrowed successful");
                } else {
                    System.out.println("Book is already borrowed");
                }
            }
            b.displayBook();
        }
        if (bookNotFound) {
            System.out.println("Book is not available with this ID");
        }




    }
}

class Book {
    int bookId;
    String title;
    String author;
    boolean available = true;


    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public boolean borrowBook() {
        if (available) {
            this.available = false;
            return true;
        }

        return false;
    }

    public void displayBook() {
        System.out.println("Bookd ID  : " + bookId);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Available : " + (available ? "YES" : "NO"));
    }

}
