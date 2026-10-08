package corejava.part3.exceptions.lab1;

import java.util.Scanner;

public class OnlineShoppingCheckoutSystem {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] products = new Product[3];
        products[0] = new Product("Laptop", 1000, 5);
        products[1] = new Product("Phone", 500, 10);
        products[2] = new Product("Headphones ", 200, 8);


        // product number consider as index
        int index = Integer.parseInt(sc.nextLine()) - 1;
        int cartSize = Integer.parseInt(sc.nextLine());
        char ch = sc.nextLine().charAt(0);
        int payment = Integer.parseInt(sc.nextLine());

        CartItem[] cartItems = new CartItem[cartSize];

        for (int i = 0; i < cartItems.length; i++) {
            cartItems[i] = new CartItem(products[index], cartSize);
        }


        CheckoutSystemArray checkoutSystemArray = new CheckoutSystemArray(cartItems, cartSize, payment);
        checkoutSystemArray.processCheckout();
    }
}

class Product {
    String name;
    int price;
    int stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}

class CartItem {
    Product product;
    int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return product.price * quantity;
    }
}

class CheckoutSystemArray {
    CartItem[] cart;
    int cartSize;
    int paymentAmount;

    public CheckoutSystemArray(CartItem[] cart, int cartSize, int paymentAmount) {
        this.cart = cart.clone();
        this.cartSize = cartSize;
        this.paymentAmount = paymentAmount;
    }

    public void processCheckout() {
        try {
            if (cartSize > cart[0].product.stock) {
                throw new OutOfStockException("Error: Product " +
                        cart[0].product.name + " quantity exceeds stock");
            }

            int bill = cartSize * cart[0].product.price;
            if (paymentAmount < bill) {
                throw new InsufficientPaymentException(
                        "Error: Insufficient Payment");
            }
            System.out.println("Checkout Successful! Total Paid: " + bill);
        } catch (OutOfStockException | InsufficientPaymentException e) {
            System.out.println(e.getMessage());
        }
        try {
            if (cartSize > cart[0].product.stock) {
                throw new EmptyCartException("Error: Cart is empty. Cannot checkout.");
            }
        } catch (EmptyCartException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Checkout Attempt Completed");
        }
    }
}


class EmptyCartException extends Exception {
    public EmptyCartException(String message) {
        super(message);
    }
}

class InsufficientPaymentException extends Exception {
    public InsufficientPaymentException(String message) {
        super(message);
    }
}

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}