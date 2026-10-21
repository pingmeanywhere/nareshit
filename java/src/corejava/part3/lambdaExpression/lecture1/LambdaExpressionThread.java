package corejava.part3.lambdaExpression.lecture1;

public class LambdaExpressionThread {

    static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(() -> {
//            try {
//                t1.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            for (int i = 11; i <= 20; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        try {
            t1.start();
            t1.join();
            t2.start();

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}
