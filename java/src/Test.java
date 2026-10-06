import java.rmi.ServerError;

public class Test {

    static void main(String[] args) {

        int [] arr = {1, 2, 3};


        try {
            System.out.println("Element : " + arr[3]);
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("Error : " + error.getMessage());
        }


    }
}

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void setAge(int age) {
        System.out.println("Exploited");
        super.setAge(age);
    }
}