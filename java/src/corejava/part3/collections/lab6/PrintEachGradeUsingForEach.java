package corejava.part3.collections.lab6;

import java.util.LinkedList;
import java.util.Scanner;

public class PrintEachGradeUsingForEach {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());

        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            list.add(sc.nextLine());
        }

        /*
        list.forEach(item -> {
            System.out.println(item);
        }); 
        */

        list.forEach(System.out::println);

    }
}
