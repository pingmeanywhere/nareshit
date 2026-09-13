package corejava.part2.methods.lecture2;

import java.util.HashMap;

public class Working {

    static  int value = 10;
    static  void change () {
        value = 100;
    }

    static void main(String[] args) {

        change();
        System.out.println(value);

        HashMap<Integer, Integer> s = new HashMap<>();
    }
}

