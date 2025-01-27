// package inheritance_practice;

class Device {
    String name;

    public void turnOn() {
        System.out.println(name + " is now ON.");
    }
}

class Laptop extends Device {
    public void code() {
        System.out.println(name + " is used for coding.");
    }
}

class Smartphone extends Device {
    public void call() {
        System.out.println(name + " is used for making calls.");
    }
}

public class DeviceExample {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.name = "Dell XPS";
        laptop.turnOn();
        laptop.code();

        Smartphone phone = new Smartphone();
        phone.name = "Samsung Galaxy";
        phone.turnOn();
        phone.call();
    }
}

