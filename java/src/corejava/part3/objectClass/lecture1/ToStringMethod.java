package corejava.part3.objectClass.lecture1;

public class ToStringMethod {


    static void main(String[] args) {

        Student student = new Student("Aquib", 23);
        System.out.println(student);

    }

}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }
}
