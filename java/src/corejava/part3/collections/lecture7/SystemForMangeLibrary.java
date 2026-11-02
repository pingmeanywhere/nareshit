package corejava.part3.collections.lecture7;

import java.util.Hashtable;
import java.util.Scanner;

public class SystemForMangeLibrary {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        System.out.println("Enter number of books : ");
        int size = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Book id, name and quantity details : ");
            library.addBook(new Book(Integer.parseInt(sc.nextLine()),
                    sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }

        System.out.println(library);

        System.out.println("Enter id to print : ");
        int id = Integer.parseInt(sc.nextLine());
        library.displayBook(id);


        System.out.println("Enter id to update quantity : ");
        id = Integer.parseInt(sc.nextLine());
        library.updateQuantity(id, 10);

        System.out.println("Enter id to print : ");
        id = Integer.parseInt(sc.nextLine());
        library.displayBook(id);

        System.out.println("All Books : ");
        System.out.println(library);

    }
}

class Book {
    private int bookId;
    private String bookName;
    private int quantity;


    public Book(int bookId, String bookName, int quantity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.quantity = quantity;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

class Library {
    Hashtable<Integer, Book> books;

    public Library() {
        this.books = new Hashtable<>();
    }

    public void addBook(Book book) {
        books.putIfAbsent(book.getBookId(), book);
        System.out.println(book.getBookId() + " is added successfully.");
    }

    public void removeBook(int id) {
        if (books.containsKey(id)) {
            books.remove(id);
        } else {
            System.out.println("Book doesn't exits with id : " + id);
        }
    }

    public void updateQuantity(int id, int quantity) {
        if (books.containsKey(id)) {
            books.get(id).setQuantity(quantity);
            System.out.println("Book id : " + id + " new quantity is : " + quantity);
        } else {
            System.out.println("Book doesn't exits with id : " + id);
        }
    }

    public void displayBook(int id) {
        if (books.containsKey(id)) {
            System.out.println(books.get(id));
        } else {
            System.out.println("Book doesn't exits with id : " + id);
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}