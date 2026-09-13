package corejava.part2.interfaces;

public class Interface {

    static void main(String[] args) {

    }
}

interface Device {
    void turnOn();

    void turnOff();
}

interface BluetoothDevice {
    void connectBluetooth();
}

class Fan implements Device {

    public void turnOn() {
        System.out.println("Fan turned ON");
    }

    public void turnOff() {
        System.out.println("Fan turned OFF");
    }
}

class Spearker implements Device, BluetoothDevice {

    public void connectBluetooth() {
        System.out.println("Connected to bluetooth");
    }

    public void turnOn() {
        System.out.println("Speaker turned ON");
    }

    public void turnOff() {
        System.out.println("Speaker turned OFF");
    }
}
