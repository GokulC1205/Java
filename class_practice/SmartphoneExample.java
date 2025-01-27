package class_practice;

class Smartphone {
    String brand;
    String model;
    double price;

    public String info() {
        return "Brand: " + brand + ", Model: " + model + ", Price: $" + price;
    }
}

public class SmartphoneExample {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.brand = "Apple";
        phone.model = "iPhone 15";
        phone.price = 999.99;
        System.out.println(phone.info());
    }
}
