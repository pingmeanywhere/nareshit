package corejava.part2.inheritance.lab2;

import java.util.Scanner;

public class InsurancePremiumType {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        PremiumType premiumType = new PremiumType(age);
        premiumType.classifyPremium();

    }
}


class Customers {
    private int age;

    public Customers(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class PremiumType extends  Customers {
    public PremiumType(int age) {
        super(age);
    }

    public void classifyPremium() {
        int age = this.getAge();

        if(age > 60) {
            System.out.println("High Premium");
        } else if(age > 30) {
            System.out.println("Medium Premium");
        } else if(age > 0) {
            System.out.println("Low Premium");
        }
    }
}
