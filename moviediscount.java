import java.util.Scanner;

class Moviedicount {
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    double calculateDiscount() {
        if (numberOfTickets >= 5)
            return calculateTotal() * 0.10;
        else
            return 0.0;
    }

    void displayBill() {
        System.out.println("Movie Name: " + movieName);
        System.out.printf("Total Amount: %.2f%n", calculateTotal());
        System.out.printf("Discount: %.2f%n", calculateDiscount());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String movieName = sc.nextLine();
        double ticketPrice = sc.nextDouble();
        int numberOfTickets = sc.nextInt();

        MovieTicket m = new MovieTicket(movieName, ticketPrice, numberOfTickets);
        m.displayBill();
    }
}