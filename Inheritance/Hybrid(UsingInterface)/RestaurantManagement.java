// Superclass
class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + " | ID: " + id);
    }
}

// Interface (Simulating Multiple Inheritance)
interface Worker {
    void performDuties();
}

// Subclass 1
class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is preparing " + specialty + " dishes.");
    }

    @Override
    public void displayInfo() {
        System.out.print("Chef -> ");
        super.displayInfo();
        System.out.println("Specialty: " + specialty);
    }
}

// Subclass 2
class Waiter extends Person implements Worker {
    private int tableCount;

    public Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is serving " + tableCount + " tables.");
    }

    @Override
    public void displayInfo() {
        System.out.print("Waiter -> ");
        super.displayInfo();
        System.out.println("Assigned Tables: " + tableCount);
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("Ramesh", 201, "Italian");
        Waiter waiter = new Waiter("Suresh", 301, 5);

        chef.displayInfo();
        chef.performDuties();

        System.out.println();

        waiter.displayInfo();
        waiter.performDuties();
    }
}
