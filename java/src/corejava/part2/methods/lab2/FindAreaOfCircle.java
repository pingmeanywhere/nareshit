package corejava.part2.methods.lab2;

public class FindAreaOfCircle {

    public  static  double findArea (double radius) {
        return 3.14 * radius * radius;
    }

    static void main(String[] args) {

        /*
            Create a static method findArea(int radius)
            The method should take radius as argument and return the area of a circle.
        */

        System.out.println(findArea(7));
    }
}
