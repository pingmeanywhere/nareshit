package corejava.part3.collections.lab10;

import java.util.*;

public class RemoveDuplicateProduct {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine().strip());

        String[] products = new String[size];

        for (int i = 0; i < products.length; i++) {
            products[i] = sc.nextLine().strip();
        }

        ProductListHandler ph = new ProductListHandler(products);

        Set<String> result = ph.getUniqueProducts();

        System.out.println("Unique Products: ");
        if(result.isEmpty()) {
            System.out.println("(No products available)");
        } else {
            for(String s : result) {
                System.out.println(s);
            }
        }

    }
}

class ProductListHandler {
    List<String> products;


    public ProductListHandler(String[] products) {
        this.products = new ArrayList<>(Arrays.asList(products));
    }

    public Set<String> getUniqueProducts() {
        return new HashSet<>(products);
    }
}


