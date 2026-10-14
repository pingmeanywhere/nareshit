package corejava.part1.dataTypes.lab;

public class LinkedInUserProfile {

    static void main(String[] args) {

        String fullName = "Milan Subedi";
        String headline = "Java Developer | Spring Boot | APIs";
        String location = "Bengaluru, India";
        String industry = "Information Technology";
        int connections = 500;
        boolean isPremium = true;

        System.out.println("Name: " + fullName);
        System.out.println("Headline: " + headline);
        System.out.println("Location: " + location);
        System.out.println("Industry: " + industry);
        System.out.println("Connections: " + (connections >= 500 ? connections + "+" : connections));
        System.out.println("Account Type: " + (isPremium ? "Premium Member Badge Activated" : ""));

    }
}
