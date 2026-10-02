package corejava.part3.objectClass.lecture2;

import java.util.Objects;

public class GetClassMethod {

    static void main(String[] args) {

        Something something = new Something(100);
        Class cls = something.getClass();

    }
}

class Something {
    private int value;

    public Something(int value) {
        this.value = value;
    }

    public int hashCode() {
        return Objects.hashCode(value);
    }
}
