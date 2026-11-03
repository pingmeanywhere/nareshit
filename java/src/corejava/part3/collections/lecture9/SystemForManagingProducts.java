package corejava.part3.collections.lecture9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SystemForManagingProducts {

    static boolean binarySearch(ArrayList<Product> products, int target) {
        int start = 0;
        int end = products.size() - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (products.get(mid).id == target) {
                return true;
            } else if (products.get(mid).id < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of products : ");
        int size = Integer.parseInt(sc.nextLine().trim());

        ArrayList<Product> products = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter PRODUCT id, name, price and quantity : ");
            products.add(new Product(Integer.parseInt(sc.nextLine().trim()), sc.nextLine(),
                    Double.parseDouble(sc.nextLine()), Integer.parseInt(sc.nextLine().trim())));

        }

        System.out.println("Before  Sort : " + products);

        Collections.sort(products);

        System.out.println("Check id available :");
        int id = Integer.parseInt(sc.nextLine().trim());

        System.out.println(binarySearch(products, id));


    }
}


class Product implements Comparable<Product> {

    int id;
    String name;
    double price;
    int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return "Product{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + ", quantity=" + quantity + '}';
    }

    public int compareTo(Product o) {
        return this.id - o.id;
    }
}