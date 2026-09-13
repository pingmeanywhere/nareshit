package corejava.part2.methods.lecture5;

public class Student {

    static void main(String[] args) {

        Details s1 = new Details("Aquib", 1, 23, 83.8);
        Details s2 = new Details("Jawed", 2, 23, 63.5, "Muzaffarpur");

        s1.displayDetails();
        s2.displayWithCity();
    }
}


class Details {

    public String name;
    public int studentId;
    public int age;
    public double percentage;
    public String city;

    public Details(String name, int studentId, int age, double percentage) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
        this.percentage = percentage;
    }

    public Details(String name, int studentId, int age, double percentage, String city) {
        this(name, studentId, age, percentage);
        this.city = city;
    }

    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Stduent ID : " + studentId);
        System.out.println("Age : " + age);
        System.out.println("Percentage : " + percentage);
    }

    public void displayWithCity() {
        displayDetails();
        if (this.city != null) {
            System.out.println("City : " + city);
        } else {
            System.out.println("Not city found");
        }
    }
}
