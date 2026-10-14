package corejava.part3.synchronization.lecture3;

public class ObjectLevelLock {

    static void main(String[] args) {
        // Object Level Lock
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        ThreadX t1 = new ThreadX(emp1);
        ThreadY t2 = new ThreadY(emp2);

        t1.start();
        t2.start();
    }
}
