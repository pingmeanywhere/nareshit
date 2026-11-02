package corejava.part3.collections.lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class FileExtensionsListArray {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine().trim());

        ArrayList<String> extensions = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            extensions.add(sc.nextLine().trim());
        }

        System.out.println("Array: " + extensions);
    }

}
