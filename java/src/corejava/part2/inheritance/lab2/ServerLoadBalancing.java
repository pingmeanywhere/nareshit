package corejava.part2.inheritance.lab2;

import java.util.Scanner;

public class ServerLoadBalancing {


    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        int serverId = sc.nextInt();
        int baseLoad = sc.nextInt();
        int capacity = sc.nextInt();

        if (choice == 1) {

            LinuxServer linuxServer = new LinuxServer();
            linuxServer.setDetails(serverId, baseLoad, capacity);
            linuxServer.display();

        } else {
            WindowsServer windowsServer = new WindowsServer();
            windowsServer.setDetails(serverId, baseLoad, capacity);
            windowsServer.display();
        }

    }
}

class BaseServer {
    private int serverId;
    private double baseLoad;
    private double maxCapacity;

    public void setDetails(int serverId, double baseLoad, double maxCapacity) {
        this.serverId = serverId;
        this.baseLoad = baseLoad;
        this.maxCapacity = maxCapacity;
    }

    public int getServerId() {
        return serverId;
    }

    public double getBaseLoad() {
        return baseLoad;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void display() {
        System.out.println("Server ID: " + this.getServerId());
        System.out.println("Base Load: " + (int) this.getBaseLoad());
        System.out.println("Max Capacity: " + (int) this.getMaxCapacity());
    }
}

class LinuxServer extends BaseServer {
    int finalCpuLoad() {
        int finalLoad = (int) (this.getBaseLoad() - (this.getBaseLoad() * 10 / 100));

        if(finalLoad > this.getMaxCapacity()) {
            finalLoad = (int) this.getMaxCapacity();
        }

        return finalLoad;
    }

    public void display() {
        super.display();
        System.out.println("Final CPU Load: " + this.finalCpuLoad());
    }
}

class WindowsServer extends BaseServer {
    int finalCpuLoad() {
        int finalLoad = (int) (this.getBaseLoad() + (this.getBaseLoad() * 5 / 100));

        if(finalLoad > this.getMaxCapacity()) {
            finalLoad = (int) this.getMaxCapacity();
        }

        return finalLoad;
    }

    public void display() {
        super.display();
        System.out.println("Final CPU Load: " + this.finalCpuLoad());
    }
}