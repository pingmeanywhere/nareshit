package corejava.part2.hasAObject;

public class Association {

    static void main(String[] args) {

        Pen pen = new Pen("Link", "blue", "Ball Pen", 10);

        Student student = new Student("Saiman", 27, 121, pen);

        student.displayDetails();

    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    Pen pen;

    public Student(String name, int age, int rollNumber, Pen pen) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.pen = pen;
    }

    public void displayDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Roll Number : " + this.rollNumber);
        pen.displayDetails();
    }
}


class Pen {
    String brand;
    String color;
    String type;
    double price;

    public Pen(String brand, String color, String type, double price) {
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand : " + this.brand);
        System.out.println("Color : " + this.color);
        System.out.println("Type : " + this.type);
        System.out.println("Price : " + this.price);
    }
}
