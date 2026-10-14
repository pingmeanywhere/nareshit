package corejava.part3.synchronization.lecture3;

public class LevelsOfLock {

    static void main(String[] args) {

        Employee emp = new Employee();

        ThreadX t1 = new ThreadX(emp);
        ThreadY t2 = new ThreadY(emp);

        t1.start();
        t2.start();


    }
}

class ThreadX extends Thread {
    Employee emp;

    public ThreadX(Employee emp) {
        this.emp = emp;
    }

    public void run() {
        emp.demo();
    }
}

class ThreadY extends Thread {
    Employee emp;

    public ThreadY(Employee emp) {
        this.emp = emp;
    }

    public void run() {
        emp.fast();
    }
}



class Employee {
    public synchronized void demo() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " -> " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public synchronized void fast() {
        try {
            for (int i = 101; i <= 105; i++) {
                System.out.println(Thread.currentThread().getName() + " -> " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
