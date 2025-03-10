public class MobilePhone {
    String brand;
    String model;
    int price;

    public MobilePhone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Motorolla","e3",12000);
        phone1.display();
    }
}

//Brand : Motorolla
//Model : e3
//Price : 12000
