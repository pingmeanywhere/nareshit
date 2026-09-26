package corejava.part3.strings.lecture2;

import java.util.Scanner;

public class ConvertStringToUppercase {

    static  String convertToUpper (String word) {

        String result = "";

        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                result = result + (char)(word.charAt(i) - 32);
            } else {
                result = result + word.charAt(i);
            }
        }
        return  result;
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        System.out.println(convertToUpper(word));

    }
}
