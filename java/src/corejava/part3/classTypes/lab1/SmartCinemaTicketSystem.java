package corejava.part3.classTypes.lab1;

import java.util.Scanner;

public class SmartCinemaTicketSystem {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String movieName = sc.nextLine();
        int ticketsSold = Integer.parseInt(sc.nextLine());
        int ticketPrice = Integer.parseInt(sc.nextLine());

        if (ticketPrice < 0) {
            System.out.println("Error: Tickets sold cannot be negative and ticket price must be greater than zero");
            return;
        }

        MovieShow movieShow = new MovieShow(movieName, ticketsSold, ticketPrice);

        System.out.println("Movie: " + movieShow.movieName);
        System.out.println("Total revenue: " + String.format("%.2f", movieShow.new RevenueCalculator().calculateRevenue()));
        System.out.println("Show performance: " + MovieShow.ShowPerformance.evaluatePerformance(ticketsSold));
    }
}


class MovieShow {

    public String movieName;
    public int ticketsSold;
    public double ticketPrice;

    MovieShow(String movieName, int ticketsSold, double ticketPrice) {
        this.movieName = movieName;
        this.ticketsSold = ticketsSold;
        this.ticketPrice = ticketPrice;
    }

    class RevenueCalculator {
        public double calculateRevenue() {
            return Math.round(ticketsSold * ticketPrice * 100.0) / 100.0;
        }
    }

    static class ShowPerformance {
        static String evaluatePerformance(int ticketsSold) {
            if (ticketsSold < 50) {
                return "Poor Response";
            }
            if (ticketsSold < 150) {
                return "Average Response";
            }
            return "Blockbuster Response";
        }
    }


}
