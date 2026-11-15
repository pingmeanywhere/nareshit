package corejava.part3.lambdaExpression.lab2;

import java.util.Scanner;

public class DefaultDiscountCoupon {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = Integer.parseInt(sc.nextLine().strip());

        Coupon coupon = null;
        if (choice == 1) {
            coupon = new DefaultDiscountCoupon().new Coupon("WELCOME10", 10);
        }
        if (choice == 2) {
            coupon = new DefaultDiscountCoupon().new Coupon("FIRST15", 15);
        }

        System.out.println("Applied Default Coupon: " + coupon.code + " - " + coupon.discount + "% OFF");

    }

    class Coupon {
        String code;
        int discount;


        public Coupon(String code, int discount) {
            this.code = code;
            this.discount = discount;
        }
    }
}
