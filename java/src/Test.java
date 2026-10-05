public class Test {

    static void main(String[] args) {

        int k = 3;
        int r = k++ * ++k / k--;

        IO.println(k);
        IO.println(r);


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