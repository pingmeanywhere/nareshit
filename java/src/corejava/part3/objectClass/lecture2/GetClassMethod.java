package corejava.part3.objectClass.lecture2;

public class GetClassMethod {

    static void main(String[] args) {

        Something something = new Something(100);
        Class cls = something.getClass();
        System.out.println(cls.getName());

    }
}

class Something {
    private  int value;

    public Something(int value) {
        this.value = value;
    }
}
