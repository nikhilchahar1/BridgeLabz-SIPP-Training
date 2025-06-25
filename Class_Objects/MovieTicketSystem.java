public class MovieTicketSystem {
    static class MovieTicket {
        String movieName;
        int seatNumber;
        double price;

        // Method to book a ticket
        void bookTicket(String name, int seat, double cost) {
            movieName = name;
            seatNumber = seat;
            price = cost;
        }

        // Method to display ticket details
        void displayTicket() {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: ₹" + price);
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("Avengers: Endgame", 25, 250.00);
        ticket.displayTicket();
    }
}
