package corejava.part2.abstraction;

import java.util.Scanner;

public class NotificationSystem {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        MessageService messageService = FactoryMessage.generateMessage(n);

        NotificationService notificationService = new NotificationService();
        notificationService.notifyUser(messageService, "HELLO HOW ARE YOU");


    }
}

class FactoryMessage {
    public static MessageService generateMessage(int choice) {
        return switch (choice) {
            case 1 -> new EmailService();
            case 2 -> new SMSService();
            case 3 -> new WhatsAppService();
            default -> null;
        };
    }
}

class NotificationService {
    public void notifyUser(MessageService messageService, String message) {
        if (messageService.sendMessage(message)) {
            System.out.println("Message sent successfully");
        } else {
            System.out.println("Failed to send message");
        }
    }
}

interface MessageService {
    boolean sendMessage(String message);
}

class EmailService implements MessageService {

    public boolean sendMessage(String message) {
        System.out.println("Message Sent : " + message + "\nvia email...");
        return true;
    }
}

class SMSService implements MessageService {

    public boolean sendMessage(String message) {
        System.out.println("Message Sent : " + message + "\nvia sms...");
        return true;
    }
}

class WhatsAppService implements MessageService {

    public boolean sendMessage(String message) {
        System.out.println("Message Sent : " + message + "\nvia WhatsApp...");
        return true;
    }
}