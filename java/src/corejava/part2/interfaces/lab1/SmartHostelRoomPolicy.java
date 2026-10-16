package corejava.part2.interfaces.lab1;

import java.util.Scanner;

public class SmartHostelRoomPolicy {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().trim();

        int students = Integer.parseInt(input.split(" ")[0]);
        int rooms = Integer.parseInt(input.split(" ")[1]);

        if (students < 0 || rooms < 0) {
            System.out.println("Invalid Input");
            return;
        }

        new HostelApp().allocate(students, rooms);

    }
}

interface RoomPolicy {

    private boolean baseRule(int students, int rooms) {
        return students <= rooms;
    }

    default void allocate(int students, int rooms) {
        if (baseRule(students, rooms)) {
            System.out.println("Rooms Allocated");
        } else {
            System.out.println("Allocation Failed");
        }
    }
}


class HostelApp implements RoomPolicy {

}