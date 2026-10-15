package corejava.part3.exceptions.lab1;

import java.lang.reflect.Method;
import java.util.Scanner;

public class NoSuchMethodExceptionDemonstration {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String addressClass = sc.nextLine();
        String methodName = sc.nextLine();

        checkMethod(addressClass, methodName);


    }


    static void checkMethod(String addressClass, String methodName) {
        try {
            Class<?> methodClass = Class.forName(addressClass);
            System.out.println("Class loaded successfully: " + addressClass);

            for (Method method : methodClass.getMethods()) {
                if (method.getName().equals(methodName)) {
                    System.out.println("Method found successfully: " + methodName);
                    return;
                }
            }
            System.out.println("NoSuchMethodException Occurred!");
            throw new NoSuchMethodException("Reason: The requested method does not exist in this class.");

        } catch (ClassNotFoundException | NoSuchMethodException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program continues safely...");
        }

    }
}
