import java.util.Scanner;

class Moviefinalamount {
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    Moviefinalamount(String movieName, double ticketPrice, int numberOfTickets) {
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

    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    void displayBill() {
        System.out.println("Movie Name: " + movieName);
        System.out.printf("Ticket Price: %.2f%n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Discount: %.2f%n", calculateDiscount());
        System.out.printf("Final Amount: %.2f%n", calculateFinalAmount());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String movieName = sc.nextLine();
        double ticketPrice = sc.nextDouble();
        int numberOfTickets = sc.nextInt();

        Moviefinalamount m = new Moviefinalamount(movieName, ticketPrice, numberOfTickets);
        m.displayBill();
    }
}