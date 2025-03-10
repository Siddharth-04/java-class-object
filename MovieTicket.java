public class MovieTicket {
    String movieName;
    int seatNumber;
    int price;

    public MovieTicket(String movieName, int seatNumber, int price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void bookTicket(int seatNumber, int price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Booking ticket for seat " + seatNumber + " and price " + price);
    }

    public void display(){
        System.out.println("Ticket booked successfully for seat " + seatNumber + " and price " + price);
    }

    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket("MovieTicket 1", 1, 100);
        movieTicket.bookTicket(2,100);
        movieTicket.display();
    }
}

//Booking ticket for seat 2 and price 100
//Ticket booked successfully for seat 2 and price 100
