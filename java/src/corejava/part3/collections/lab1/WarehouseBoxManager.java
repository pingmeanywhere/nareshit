package corejava.part3.collections.lab1;

import java.util.Scanner;
import java.util.Stack;

public class WarehouseBoxManager {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine().trim());

        Wherehouse wherehouse = new Wherehouse();
        for (int i = 0; i < size; i++) {
            int boxId = Integer.parseInt(sc.nextLine().trim());
            int boxWeight = Integer.parseInt(sc.nextLine().trim());

            if (boxWeight < 0) {
                System.out.println("Weight must be greater than 0");
                return;
            }

            Box box = new Box(boxId, boxWeight);
            wherehouse.addBox(box);
        }

        wherehouse.displayTopBox();
        wherehouse.displayAllBox();

    }
}


class Box {
    private int boxId;
    private int boxWeight;

    public Box(int boxId, int boxWeight) {
        this.boxId = boxId;
        this.boxWeight = boxWeight;
    }

    public int getBoxId() {
        return boxId;
    }

    public int getBoxWeight() {
        return boxWeight;
    }
}

class Wherehouse {
    Stack<Box> st;

    public Wherehouse() {
        this.st = new Stack<>();
    }

    public void addBox(Box box) {
        st.push(box);
    }

    public Box removeBox() {
        if (st.isEmpty()) return null;
        return st.pop();
    }

    public void displayTopBox() {
        if (st.isEmpty()) return;
        System.out.println("Top Box: " + st.peek().getBoxId() + " " + st.peek().getBoxWeight());
    }

    public void displayAllBox() {
        System.out.println("All Boxes:");
        for (Box b : st) {
            System.out.println(b.getBoxId() + " " + b.getBoxWeight());
        }
    }
}