package corejava.part3.collections.lab6;

import java.util.LinkedList;
import java.util.Scanner;

public class ExtractMiddleSegmentationsList {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());

        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            list.add(sc.nextLine());
        }
        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());

        System.out.println(list.subList(start, end));

    }
}
