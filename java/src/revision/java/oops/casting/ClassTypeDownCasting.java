package revision.java.oops.casting;

public class ClassTypeDownCasting {

    static void main(String[] args) {
        Human human = new Student("Asian", "Aquib");
        // up casted object
        human.speak();

        // Here we are down casting
        if (human instanceof Student) {
            Student student = (Student) human;
            student.work();
        }
    }
}

class Human {
    String race;

    public Human(String race) {
        this.race = race;
    }

    public void speak() {
        System.out.println("Every human speaks");
    }
}

class Student extends Human {
    String name;

    public Student(String race, String name) {
        super(race);
        this.name = name;
    }

    public void work() {
        System.out.println("Every student studies");
    }
}
