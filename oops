=
// 1) Write a Java program to create a class called "Car" with brand, model, and year attributes. Create an instance of the "Car" class, set its attributes using the constructor, and print its details.**

class Car {
  private String brand;
  private String model;
  private int year;

  public Car(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = year;
  }

  void getDetails() {
    System.out.println("Brand: " + brand);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
  }
}

class Main {
  public static void main(String[] args) {
    Car car = new Car("Toyota", "Corolla", 2022);
    car.getDetails();
  }
}

// 2) Write a Java program to create a class called "Student" with name, roll number, and grade attributes. Add methods to display the details and update the grade.**

class Student {
  private String name;
  private int rollNumber;
  private char grade;

  public Student(String name, int rollNumber, char grade) {
    this.name = name;
    this.rollNumber = rollNumber;
    this.grade = grade;
  }

  void getDetails() {
    System.out.println("Name: " + name);
    System.out.println("Roll Number: " + rollNumber);
    System.out.println("Grade: " + grade);
  }

  void updateGrade(char newGrade) {
    this.grade = newGrade;
  }
}

class Main {
  public static void main(String[] args) {
    Student student = new Student("Ravi", 101, 'A');
    student.getDetails();
    student.updateGrade('B');
    student.getDetails();
  }
}

// 3) Write a Java program to create a class called "BankAccount" with account number, holder name, and balance attributes. Add methods to deposit and withdraw money.**

class BankAccount {
  private String accountNumber;
  private String holderName;
  private double balance;

  public BankAccount(String accountNumber, String holderName, double balance) {
    this.accountNumber = accountNumber;
    this.holderName = holderName;
    this.balance = balance;
  }

  void deposit(double amount) {
    balance += amount;
    System.out.println("Deposited: " + amount);
    System.out.println("New Balance: " + balance);
  }

  void withdraw(double amount) {
    if (amount <= balance) {
      balance -= amount;
      System.out.println("Withdrawn: " + amount);
      System.out.println("New Balance: " + balance);
    } else {
      System.out.println("Insufficient Balance!");
    }
  }

  void displayDetails() {
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Holder Name: " + holderName);
    System.out.println("Balance: " + balance);
  }
}

class Main {
  public static void main(String[] args) {
    BankAccount account = new BankAccount("123456789", "Amit", 5000.0);
    account.displayDetails();
    account.deposit(2000);
    account.withdraw(3000);
    account.withdraw(5000);
  }
}


// 4) Write a Java program to create a class called "Employee" with name, ID, and salary attributes. Add methods to calculate and display the annual salary.**

class Employee {
  private String name;
  private int id;
  private double salary;

  public Employee(String name, int id, double salary) {
    this.name = name;
    this.id = id;
    this.salary = salary;
  }

  double calculateAnnualSalary() {
    return salary * 12;
  }

  void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("Monthly Salary: " + salary);
    System.out.println("Annual Salary: " + calculateAnnualSalary());
  }
}

class Main {
  public static void main(String[] args) {
    Employee employee = new Employee("Gokul", 102, 40000);
    employee.displayDetails();
  }
}
