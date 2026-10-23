package corejava.part3.collections.lecture2;

public class GenericsStorageBox {

    static void main(String[] args) {

        StorageBox<Integer> sbint = new StorageBox<>();
        sbint.setItem(10);
        System.out.println(sbint.getItem());

        StorageBox<String> sbstr = new StorageBox<>();
        sbstr.setItem("Hello");
        System.out.println(sbstr.getItem());

        StorageBox<Double> sbdbl = new StorageBox<>();
        sbdbl.setItem(10.0);
        System.out.println(sbdbl.getItem());



    }
}

class StorageBox<T> {

    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
