import java.util.*;
class FoodDeliveryApp {

    private String name;
    private String location;
    private String [] foodItems;

    public FoodDeliveryApp(String name, String location, String[] foodItems) {
        this.name = name;
        this.location = location;
        this.foodItems = foodItems;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Location : " + location);
        System.out.print("Food Items:" + Arrays.toString(foodItems));
    }

    public boolean isFoodAvailable(String foodItem){
        for(int i=0 ; i<foodItems.length ; i++){
            if(foodItems[i].equalsIgnoreCase(foodItem)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String [] foodItems1 = new String [] {"Pasta", "Pizza","Burger"};
        String [] foodItems2 = new String[] {"Sushi", "Ramen","Ricecake"};

        FoodDeliveryApp foodDeliveryApp1 = new FoodDeliveryApp("Restaurant1", "Delhi", foodItems1);
        FoodDeliveryApp foodDeliveryApp2 = new FoodDeliveryApp("Restaurant2", "Mumbai", foodItems2);
        System.out.println("Restraunt 1 details -------------------------");
        foodDeliveryApp1.displayDetails();
        System.out.println("\nRestraunt 2 details --------------------------");
        foodDeliveryApp2.displayDetails();

        //checking food availability
        System.out.println("Checking if Pasta available in restaurant 1");
        System.out.println(foodDeliveryApp1.isFoodAvailable("Pasta"));

        System.out.println("Checking if Ramen available in restaurant 2");
        System.out.println(foodDeliveryApp1.isFoodAvailable("SushiiOp"));

    }
}