public class CartItem {
    String itemName;
    int price;
    int quantity;

    public CartItem(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int quantity) {
        this.quantity += quantity;
    }

    public void removeItem(int quantity) {
        if (quantity >= this.quantity) {
            this.quantity = 0;
        } else {
            this.quantity -= quantity;
        }
    }

    public double getTotalCost() {
        return this.price * this.quantity;
    }

    public static void main(String[] args) {
        CartItem cartItem = new CartItem("Biscuits", 100, 5);
        System.out.println("Total Cost : " + cartItem.getTotalCost());
        cartItem.addItem(1);
        cartItem.removeItem(3);
        System.out.println("Total Cost remains after removal of 3 packets : " + cartItem.getTotalCost());
    }
}


//Total Cost : 500.0
//Total Cost remains after removal of 3 packets : 300.0