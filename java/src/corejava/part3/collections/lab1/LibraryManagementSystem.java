package corejava.part3.collections.lab1;

import java.util.Scanner;
import java.util.Vector;

public class LibraryManagementSystem {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        int booksCount = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < booksCount; i++) {
            String[] values = sc.nextLine().trim().split("\\s+");

            library.addBook(new Book(
                    Integer.parseInt(values[0]),
                    values[1],
                    values[2],
                    Integer.parseInt(values[3])
            ));
        }

        int membersCount = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < membersCount; i++) {
            String[] values = sc.nextLine().trim().split("\\s+");

            library.addMember(new Member(
                    Integer.parseInt(values[0]),
                    values[1],
                    values[2]
            ));
        }

        int transactionsCount = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < transactionsCount; i++) {
            String[] values = sc.nextLine().trim().split("\\s+");

            library.borrowBook(
                    Integer.parseInt(values[0]),
                    Integer.parseInt(values[1]),
                    Integer.parseInt(values[2]),
                    values[3],
                    values[4]
            );
        }


        int transactionId = Integer.parseInt(sc.nextLine().trim());
        library.returnBook(transactionId);

        System.out.println("Books:");
        library.displayBooks();

        System.out.println("Members:");
        library.displayMembers();

        System.out.println("Transactions:");
        library.displayTransactions();


        int memberId = 201;
        System.out.println("Total Books Borrowed by Member "
                + memberId + ": " + library.totalBooksBorrowed(memberId));

        sc.close();

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


    public BorrowTransaction(int transactionId, Book book, Member member, String borrowDate, String returnDate) {
        this.transactionId = transactionId;
        this.book = book;
        this.member = member;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public String toString() {
        return transactionId + " " + book.bookId + " " + member.memberId + " " + borrowDate + " " + returnDate;
    }
}

class Library {
    Vector<Book> books = new Vector<>();
    Vector<Member> members = new Vector<>();
    Vector<BorrowTransaction> transactions = new Vector<>();

    public void addBook(Book book) {
        for (Book b : books) {
            if (b.bookId == book.bookId) {
                return;
            }
        }
        books.add(book);
    }

    public void addMember(Member member) {
        for (Member m : members) {
            if (m.memberId == member.memberId) {
                return;
            }
        }
        members.add(member);
    }

    public void borrowBook(int transactionId, int bookId, int memberId, String borrowDate, String returnDate) {
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

            if (transaction.member.memberId == memberId && transaction.book.bookId == bookId) {
                transaction.borrowDate = borrowDate;
                transaction.returnDate = returnDate;
                isTransactionExists = true;
                System.out.println("Duplicate borrow found, dates updated");
                break;
            }
        }
        if (book == null || member == null) {
            return;
        }
        if (!isTransactionExists) {
            BorrowTransaction b = new BorrowTransaction(
                    transactionId, book, member, borrowDate, returnDate);

            transactions.add(b);
            book.quantity--;
        }

    }

    public void returnBook(int transactionId) {
        for (int i = 0; i < transactions.size(); i++) {
            BorrowTransaction transaction = transactions.get(i);

            if (transaction.transactionId == transactionId) {
                transaction.book.quantity++;
                transactions.remove(i);
                System.out.println("Book returned successfully");
                return;
            }
        }
    }

    public void displayBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void displayMembers() {
        for (Member m : members) {
            System.out.println(m);
        }
    }

    public void displayTransactions() {
        for (BorrowTransaction bt : transactions) {
            System.out.println(bt.transactionId + " " + bt.book.bookId + " " + bt.member.memberId + " " + bt.borrowDate + " " + bt.returnDate);
        }
    }

    public int totalBooksBorrowed(int memberId) {
        int count = 0;

        for (BorrowTransaction transaction : transactions) {
            if (transaction.member.memberId == memberId) {
                count++;
            }
        }

        return count;
    }
}