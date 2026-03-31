
class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    private Ticket head = null;

    // Add a new ticket at the end
    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);

        if (head == null) {
            head = newTicket;
            head.next = head; // Circular link
        } else {
            Ticket temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTicket;
            newTicket.next = head;
        }
        System.out.println("Ticket booked successfully.");
    }

    // Remove ticket by ID
    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket curr = head, prev = null;

        // Special case: only one node
        if (head.next == head && head.ticketId == ticketId) {
            head = null;
            System.out.println("Ticket removed.");
            return;
        }

        do {
            if (curr.ticketId == ticketId) {
                if (curr == head) {
                    // Find last node
                    Ticket last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                System.out.println("Ticket removed.");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Ticket ID not found.");
    }

    // Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket temp = head;
        System.out.println("Current Booked Tickets:");
        do {
            System.out.println("Ticket ID: " + temp.ticketId +
                               ", Customer: " + temp.customerName +
                               ", Movie: " + temp.movieName +
                               ", Seat: " + temp.seatNumber +
                               ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by customer or movie name
    public void searchTicket(String keyword) {
        if (head == null) {
            System.out.println("No tickets to search.");
            return;
        }

        Ticket temp = head;
        boolean found = false;
        do {
            if (temp.customerName.equalsIgnoreCase(keyword) || temp.movieName.equalsIgnoreCase(keyword)) {
                System.out.println("Ticket Found -> Ticket ID: " + temp.ticketId +
                                   ", Customer: " + temp.customerName +
                                   ", Movie: " + temp.movieName +
                                   ", Seat: " + temp.seatNumber +
                                   ", Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No ticket found with keyword: " + keyword);
        }
    }

    // Count total tickets
    public int countTickets() {
        if (head == null) return 0;

        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }
}


public class OnlineReservation {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();
        system.addTicket(101, "Alice", "Avengers", "A1", "12:00 PM");
        system.addTicket(102, "Bob", "Batman", "B2", "3:00 PM");
        system.addTicket(103, "Charlie", "Avengers", "C3", "6:00 PM");

        system.displayTickets();
        System.out.println("Total Booked Tickets: " + system.countTickets());

        system.searchTicket("Avengers");
        system.removeTicket(102);
        system.displayTickets();

        System.out.println("Total Booked Tickets: " + system.countTickets());
    }
}
