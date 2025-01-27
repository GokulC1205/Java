// package inheritance_practice;

class Employee {
     String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void work() {
        System.out.println(getName() + " is working.");
    }
}

class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    public void manageTeam() {
        System.out.println(getName() + " is managing the team.");
    }
}

public class EmployeeExample {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice");
        mgr.work();
        mgr.manageTeam();
    }
}