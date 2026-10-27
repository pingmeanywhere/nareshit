package corejava.part3.collections.lab1;

import java.util.Scanner;
import java.util.Vector;

public class LibraryManagementSystem {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}


class Book {
    int bookId;
    String title;
    String author;
    int quantity;


    public Book(int bookId, String title, String author, int quantity) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    public String toString() {
        return bookId + " " + title + " " + author + " " + quantity;
    }
}

class Member {
    int memberId;
    String memberName;
    String membershipType;


    public Member(int memberId, String memberName, String membershipType) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.membershipType = membershipType;
    }

    public String toString() {
        return memberId + " " + memberName + " " + membershipType;
    }
}

class BorrowTransaction {
    int transactionId;
    Book book;
    Member member;
    String borrowDate;
    String returnDate;


    public BorrowTransaction(int transactionId, Book book, Member member,
                             String borrowDate, String returnDate) {
        this.transactionId = transactionId;
        this.book = book;
        this.member = member;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public String toString() {
        return transactionId + " " + book.bookId + " " + member.memberId
                + " " + borrowDate + " " + returnDate;
    }
}

class Library {
    Vector<Book> books = new Vector<>();
    Vector<Member> members = new Vector<>();
    Vector<BorrowTransaction> transactions = new Vector<>();

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
        }
    }

    public void addMember(Member member) {
        if (!members.contains(member)) {
            members.add(member);
        }
    }

    public void borrowBook(int transactionId, int bookId, int memberId,
                           String borrowDate, String returnDate) {
        Book book = null;
        for (Book b : books) {
            if (b.bookId == bookId && b.quantity > 0) {
                book = b;
                break;
            }
        }

        Member member = null;
        for (Member m : members) {
            if (m.memberId == memberId) {
                member = m;
                break;
            }
        }

        boolean isTransactionExists = false;
        for (BorrowTransaction transaction : transactions) {

            if (transaction.member.memberId == memberId &&
                    transaction.book.bookId == bookId) {
                transaction.borrowDate = borrowDate;
                transaction.returnDate = returnDate;
                isTransactionExists = true;
                break;
            }
        }
        if (!isTransactionExists) {
            BorrowTransaction b = new BorrowTransaction(transactionId, book, member, borrowDate, returnDate);
        }

    }
}