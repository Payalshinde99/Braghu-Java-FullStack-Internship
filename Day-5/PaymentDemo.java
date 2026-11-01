
interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.printf(
            "Paid Rs. %.2f using Credit Card.%n", amount);
    }
}

class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.printf(
            "Paid Rs. %.2f using UPI.%n", amount);
    }
}

class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.printf(
            "Paid Rs. %.2f using Cash.%n", amount);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCardPayment();
        payment.pay(1500);

        payment = new UPIPayment();
        payment.pay(750);

        payment = new CashPayment();
        payment.pay(500);
    }
}
