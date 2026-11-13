package corejava.part3.collections.lab9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LibraryManagerIterator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine().trim());
        LibraryManager lm = new LibraryManager();


        for (int i = 0; i < size; i++) {
            ArrayList<String> books = new ArrayList<>();
            int count = Integer.parseInt(sc.nextLine().trim());
            for (int j = 0; j < count; j++) {
                String book = sc.nextLine();
                System.out.println(book.length());
                if (book.length() > 50) {
                    System.out.println("Error - Book name too long");
                    return;
                }
                books.add(book);
            }
            lm.addMemberBooks(books);
        }
        lm.displayAllBooks();
        System.out.println("Total Books: " + lm.calculateTotalBooks());

    }
}

class LibraryManager {
    ArrayList<String> books;
    ArrayList<ArrayList<String>> memberBooks;


    public LibraryManager() {
        books = new ArrayList<>();
        memberBooks = new ArrayList<ArrayList<String>>();
    }

    void addMemberBooks(ArrayList<String> books) {
        memberBooks.add(books);
    }

    void displayAllBooks() {
        Iterator<ArrayList<String>> nested = memberBooks.iterator();
        int count = 1;
        while (nested.hasNext()) {
            Iterator<String> i = nested.next().iterator();
            System.out.print("Member " + count + ": ");
            while (i.hasNext()) {
                System.out.print(i.next() + " ");
            }
            System.out.println();
            count++;
        }
    }

    int calculateTotalBooks() {
        int total = 0;
        for (ArrayList<String> a : memberBooks) {
            total += a.size();
        }
        return total;
    }
}
