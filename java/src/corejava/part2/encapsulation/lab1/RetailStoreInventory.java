package corejava.part2.encapsulation.lab1;

import java.util.Scanner;

public class RetailStoreInventory {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String itemName = sc.nextLine();
        int pricePerUnit = Integer.parseInt(sc.nextLine());
        int quantityInStock = Integer.parseInt(sc.nextLine());

        InventoryItem item = new InventoryItem(itemName, pricePerUnit, quantityInStock);

        // Before
        System.out.println("Item Name       : " + item.getItemName());
        System.out.println("Price Per Unit  : " + item.getPricePerUnit());
        System.out.println("Quantity        : " + item.getQuantityInStock());
        System.out.println("Total Value     : " + item.calculateTotalValue());

        // 4. Do you want to update the item?

        int updateOption = sc.nextInt();

        if (updateOption == 1) {

            // 5. What do you want to update?

            int choiceField = sc.nextInt();

            if(choiceField == 1) {
                // price
                int price = sc.nextInt();

                item.setPricePerUnit(price);

            } else if(choiceField == 2) {
                // quantity
                int quantity = sc.nextInt();
                item.setQuantityInStock(quantity);
            }

        } else if (updateOption == 2) {
            System.exit(0);
        }


        // After update
        System.out.println("After Update:");

        System.out.println("Item Name       : " + item.getItemName());
        System.out.println("Price Per Unit  : " + item.getPricePerUnit());
        System.out.println("Quantity        : " + item.getQuantityInStock());
        System.out.println("Total Value     : " + item.calculateTotalValue());


    }
}


class InventoryItem {

    private String itemName;
    private double pricePerUnit;
    private int quantityInStock;


    public InventoryItem(String itemName, double pricePerUnit, int quantityInStock) {
        this.itemName = itemName;
        this.pricePerUnit = pricePerUnit;
        this.quantityInStock = quantityInStock;
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }


    public double calculateTotalValue() {
        return pricePerUnit * quantityInStock;
    }
}


