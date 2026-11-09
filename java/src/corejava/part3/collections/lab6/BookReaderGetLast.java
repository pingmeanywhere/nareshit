package corejava.part3.collections.lab6;

import java.util.LinkedList;
import java.util.Scanner;

public class BookReaderGetLast {

    static String getLastBook(LinkedList<String> books) {
        return books.peekLast();
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine().trim());

        LinkedList<String> books = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            books.add(sc.nextLine());
        }

        String lastBook = getLastBook(books);
        if (lastBook == null) {
            System.out.println("No books available");
        } else {
            System.out.println("Last opened book: " + lastBook);
        }
        System.out.println("Current list: " + books);
    }
}
