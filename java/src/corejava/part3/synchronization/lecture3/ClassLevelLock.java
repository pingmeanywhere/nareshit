package corejava.part3.synchronization.lecture3;

public class ClassLevelLock {

    static void main(String[] args) {
        Task task1 = new Task();
        Task task2 = new Task();

        TaskThreadX t1 = new TaskThreadX(task1);
        TaskThreadY t2 = new TaskThreadY(task2);

        t1.start();
        t2.start();

    }
}


class Task {
    public void demo() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " -> " + i);
                Thread.sleep(1000);
            }

            synchronized (this.getClass()) {
                for (int i = 21; i <= 25; i++) {
                    System.out.println(Thread.currentThread().getName() + " -> " + i);
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class TaskThreadX extends Thread {
    Task task;

    public TaskThreadX(Task task) {
        this.task = task;
    }

    public void run() {
        task.demo();
    }
}

class TaskThreadY extends Thread {
    Task task;

    public TaskThreadY(Task task) {
        this.task = task;
    }

    public void run() {
        task.demo();
    }
}