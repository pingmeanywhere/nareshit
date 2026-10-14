package corejava.part1.dataTypes.lab;

public class SwiggyDeliveryPartner {


    static void main(String[] args) {
        String partnerName = "Amit Kumar";
        int deliveries = 18;
        double earningPerDelivery = 22.5;
        double totalEarnings = deliveries * earningPerDelivery;

        System.out.println("Delivery Partner: " + partnerName + " \n" +
                "Deliveries Completed: " + deliveries + " \n" +
                "Earning per Delivery: " + earningPerDelivery + " \n" +
                "Total Earnings: " + totalEarnings);

    }
}