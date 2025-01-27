package class_practice;

class Temperature {
    double celsius;

    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public double toKelvin() {
        return celsius + 273.15;
    }
}

public class TemperatureExample {
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        temp.celsius = 25;
        System.out.println("Fahrenheit: " + temp.toFahrenheit());
        System.out.println("Kelvin: " + temp.toKelvin());
    }
}
