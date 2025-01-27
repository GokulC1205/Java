package Polymorphism;

class Payment {
    public void makePayment() {
        System.out.println("Processing a generic payment...");
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Processing credit card payment...");
    }
}

class PayPalPayment extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Processing PayPal payment...");
    }
}

public class PaymentExample {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCardPayment();
        payment.makePayment();

        payment = new PayPalPayment();
        payment.makePayment();
    }
}

