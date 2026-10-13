package corejava.part2.polymorphism.lab2;

import java.util.Scanner;

public class NotificationSystem {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type = Integer.parseInt(sc.nextLine().trim());
        String message = sc.nextLine();

        if (message.isEmpty()) {
            System.out.println("Error: Message cannot be empty");
            return;
        }

        if (type == 1) {
            EmailNotification emailNotification = new EmailNotification();
            emailNotification.send(message);
        }
        if (type == 2) {
            SMSNotification smsNotification = new SMSNotification();
            smsNotification.send(message);
        }


    }
}

interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}


