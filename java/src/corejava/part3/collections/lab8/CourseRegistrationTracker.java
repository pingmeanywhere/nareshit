package corejava.part3.collections.lab8;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CourseRegistrationTracker {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CourseManager courseManager = new CourseManager();

        int size = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < size; i++) {
            courseManager.addOrUpdate(new Registration(Integer.parseInt(sc.nextLine().trim()), sc.nextLine().trim(), sc.nextLine().trim()));
        }

        int searchId = Integer.parseInt(sc.nextLine().trim());
        String courseName = sc.nextLine().trim();

        courseManager.displayRegistrations();
        courseManager.searchRegistration(searchId);
        System.out.println("Total " + courseName + " registrations: " +
                courseManager.countByCourse(courseName));
    }

}

class Registration {
    int id;
    String studentName;
    String courseName;


    public Registration(int id, String studentName, String courseName) {
        this.id = id;
        this.studentName = studentName;
        this.courseName = courseName;
    }

    public String toString() {
        return id + " " + studentName + " " + courseName;
    }
}

class CourseManager {
    LinkedHashMap<Integer, Registration> registrations;

    public CourseManager() {
        registrations = new LinkedHashMap<>();
    }

    public void addOrUpdate(Registration registration) {
        if (registrations.containsKey(registration.id)) {
            registrations.put(registration.id, registration);
        } else {
            registrations.put(registration.id, registration);
        }
    }

    public void displayRegistrations() {
        System.out.println("Registration List");
        for (Registration b : registrations.values()) {
            System.out.println(b);
        }
    }

    public void searchRegistration(int id) {
        if (registrations.containsKey(id)) {
            System.out.println("Registration Found: " + registrations.get(id));
        } else {
            System.out.println("Registration not found");
        }
    }

    public int countByCourse(String courseName) {
        int count = 0;

        for (Registration r : registrations.values()) {
            if (r.courseName.equals(courseName)) {
                count++;
            }
        }
        return count;
    }
}