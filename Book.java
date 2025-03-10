class Book{
    String title;
    String author;
    int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Price of Persia", "Siddharth", 500);
        book1.display();
    }
}
//Title: Price of Persia
//Author: Siddharth
//Price: 500
