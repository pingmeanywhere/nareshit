package corejava.part3.objectClass.lab2;

import java.util.Scanner;

public class LibraryBookCopySystem {

    static void main(String[] args) throws CloneNotSupportedException {

        Scanner sc = new Scanner(System.in);

        String bookId = sc.nextLine();
        String title = sc.nextLine();
        String author = sc.nextLine();
        double price = Double.parseDouble(sc.nextLine());

        if (price < 0 || bookId.length() < 3 || title.length() < 2 || author.length() < 3) {
            System.out.println("Error: Invalid book details");
            return;
        }

        Book book = new Book(bookId, title, author, price);

        System.out.println("Original Book: " + book);

        Book copyBook = book.clone();
        copyBook.price = copyBook.price + 50;

        System.out.println("Cloned Book: " + copyBook);

    }
}


class Book implements Cloneable {
    String bookId;
    String title;
    String author;
    double price;

    Book(String bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public Book clone() throws CloneNotSupportedException {
        Book copy = (Book) super.clone();
        return copy;
    }

    public String toString() {
        return bookId + " " + title + " " + author + " " + price;
    }
}