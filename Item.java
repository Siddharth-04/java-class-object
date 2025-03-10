public class Item {
    int itemCode;
    String itemName;
    int price;

    public Item(int itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void display() {
        System.out.println("Item code : " + this.itemCode);
        System.out.println("Item name : " + this.itemName);
        System.out.println("Item price : " + this.price);
    }
    public static void main(String[] args) {
        Item item1 = new Item(101,"Book",100);
        item1.display(); //display details
        int quantity  = 12;
        int totalPrice = item1.price * quantity;
        System.out.println("Total price : " + totalPrice);
    }
}
//Item code : 101
//Item name : Book
//Item price : 100
//Total price : 1200
