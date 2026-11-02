package corejava.part3.collections.lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrimOverAllocatedAnswerList {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = Integer.parseInt(sc.nextLine().trim());
        AnswerListOptimizer answerListOptimizer = new AnswerListOptimizer();
        answerListOptimizer.initializeList(capacity);

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            ans.add(sc.nextLine().trim());
        }

        answerListOptimizer.addAnswers(ans);
        answerListOptimizer.trimList();
        answerListOptimizer.printSize();
        answerListOptimizer.checkContains("C");

    }
}

class AnswerListOptimizer {
    ArrayList<String> answers;

    public void initializeList(int capacity) {
        answers = new ArrayList<>(capacity);
    }

    public void addAnswers(List<String> input) {
        answers.addAll(input);
    }

    public void trimList() {
        answers.trimToSize();
    }

    public void printSize() {
        System.out.println(answers.size());
    }

    public void checkContains(String value) {
        System.out.println(answers.contains(value));
    }

}