package corejava.part3.strings.lab1;

import java.util.Scanner;

public class ReversingWords {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        for(int i = s.split(" ").length - 1; i >= 0; i--) {
            System.out.print(s.split(" ")[i] + " ");
        }
    }
}
