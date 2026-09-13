package corejava.part2.methods.lab2;

import java.util.Scanner;

public class GreetMessage {

    public  static void greetUser(String message) {
        System.out.println("Hello " + message);
    }

    static void main(String[] args) {
        /*
            5.Create a static method displayMessage(String name)
            The method should take a name and print &quot;Hello &lt;name&gt;&quot;.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your message here : ");
        String message = sc.next();

        greetUser(message);
    }
}
