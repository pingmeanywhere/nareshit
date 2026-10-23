package corejava.part3.collections.lecture2;

public class WhatIsGenerics {

    static void main(String[] args) {

        DynamicType <Boolean>  dt = new DynamicType<>();
        dt.add(true);
        System.out.println(dt.get());
    }
}

class DynamicType<T> {
    T value;

    public void add(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
