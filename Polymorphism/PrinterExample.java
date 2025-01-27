package Polymorphism;

class Printer {
    public void print(String text) {
        System.out.println("Printing text: " + text);
    }

    public void print(int number) {
        System.out.println("Printing number: " + number);
    }

    public void print(double number) {
        System.out.println("Printing decimal number: " + number);
    }
}

public class PrinterExample {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hello, World!");
        printer.print(42);
        printer.print(3.14);
    }
}
