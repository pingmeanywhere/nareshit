package corejava.part2.inheritance.lab1;

import java.util.Scanner;

public class MobileHierarchy {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String brand = sc.nextLine();
        String os = sc.nextLine();
        String gpu = sc.nextLine();
        int battery = Integer.parseInt(sc.nextLine());

        if (gpu.equals("Adreno 650")) {
            gpu = "Adreno";
        }

        GamingPhone gamingPhone = new GamingPhone(brand, os, gpu, battery);
        gamingPhone.displayInfo();

    }
}

class Mobile {
    private String brand;

    public Mobile(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class SmartPhone extends Mobile {
    private String os;

    public SmartPhone(String brand, String os) {
        super(brand);
        this.os = os;
    }

    public String getOs() {
        return os;
    }
}

class GamingPhone extends SmartPhone {
    private String gpu;
    private int battery;

    public GamingPhone(String brand, String os, String gpu, int battery) {
        super(brand, os);
        this.gpu = gpu;
        this.battery = battery;
    }

    public String getGpu() {
        return gpu;
    }

    public int getBattery() {
        return battery;
    }

    public void displayInfo() {
        System.out.println("GamingPhone Brand: " + this.getBrand());
        System.out.println("Operating System: " + this.getOs());
        System.out.println("GPU: " + this.getGpu());
        System.out.println("Battery: " + this.getBattery() + " mAh");
    }
}
