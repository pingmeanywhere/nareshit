package corejava.part3.exceptions.lab2;

import java.util.Scanner;

public class BorrowLimitSystem {

    static void evaluateLimit(int limit, int borrow) throws BorrowLimitExceededException {
        if (borrow >= limit) {
            throw new BorrowLimitExceededException("BorrowLimitExceededException: Limit "
                    + limit + " reached");
        }
        System.out.println("Book borrowed successfully");
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int borrow = sc.nextInt();

        try {
            evaluateLimit(limit, borrow);
        } catch (BorrowLimitExceededException e) {
            System.out.println(e.getMessage());
        }

    }
}

class BorrowLimitExceededException extends Exception {
    BorrowLimitExceededException(String message) {
        super(message);
    }
}