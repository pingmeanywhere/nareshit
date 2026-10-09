package corejava.part3.exceptions.lab2;

import java.util.Scanner;

public class OnlineExamSystem {

    static void evaluateResult(int score) throws LowScoreException {
        if (score < 40) {
            throw new LowScoreException("Failed due to low score: Candidate " +
                    "scored below the minimum pass mark.");
        }
        System.out.println("Passed");
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        try {
            evaluateResult(score);
        } catch (LowScoreException e) {
            System.out.println(e.getMessage());
        }

    }
}

class LowScoreException extends Exception {
    LowScoreException(String message) {
        super(message);
    }
}
