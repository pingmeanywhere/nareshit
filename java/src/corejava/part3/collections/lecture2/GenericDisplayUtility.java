package corejava.part3.collections.lecture2;

public class GenericDisplayUtility {

    static void main(String[] args) {

        Display<Integer> marks = new Display<>(85);
        System.out.println("Student Marks : " + marks.getValue());

        Display<String> name = new Display<>("Suman");
        System.out.println("Name : " + name.getValue());

        Display<Double> price = new Display<>(99.5);
        System.out.println("Price : " + price.getValue());

    }
}

class Display<T> {
    private T value;

    public Display(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
