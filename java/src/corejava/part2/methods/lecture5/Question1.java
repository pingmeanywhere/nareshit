package corejava.part2.methods.lecture5;

import java.util.Scanner;

public class Question1 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter book name, author name and price : ");
        String bookName = sc.nextLine();
        String authorName = sc.nextLine();
        double price = sc.nextDouble();

        Book b1 = new Book(bookName, authorName, price);

        b1.displayBookInfo();
        b1.issueBook();
    }
}


class Book {

    public String bookName;
    public String authorName;
    public  double price;

    public Book(String authorName, String bookName, double price) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.price = price;
    }

    public  void displayBookInfo() {
        System.out.println("Book Name : " + bookName);
        System.out.println("Author Name : " + authorName);
        System.out.println("Price : " + price);
    }

    public  void issueBook() {
        System.out.println("Book Issued Successfully : " + bookName);
    }
}
