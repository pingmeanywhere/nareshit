package corejava.part3.collections.lecture1;

import java.util.Arrays;

public class DesignVector {

    static void main(String[] args) {

        MyVector<Integer> mv = new MyVector<>();

        mv.add(10);
        mv.add(20);
        mv.add(30);
        mv.add(40);
        mv.add(50);
        mv.add(60);

        System.out.println(mv);

    }
}

class MyVector<T> {
    T[] arr = (T[]) new Object[5];
    int index = 0;

    public void add(T value) {
        if (index == arr.length) {
            T[] temp = (T[]) new Object[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[index++] = value;
    }

    public String toString () {
        return Arrays.toString(arr);
    }
}


