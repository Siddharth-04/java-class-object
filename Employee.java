class Employee{
    String name;
    int salary;
    int id;

    public Employee(String name, int salary, int id){
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public void details(){
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("ID: " + this.id);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("Mary", 1000, 1);
        e1.details();
    }
}
//Name: Mary
//Salary: 1000
//ID: 1