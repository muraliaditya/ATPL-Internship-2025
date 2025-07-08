class Payment {
    void processPayment() {
        System.out.println("Processing payment");
    }
}

class CreditCardPayment extends Payment {
    void processPayment() {
        System.out.println("Credit Card Payment");
    }
}

class UPIPayment extends Payment {
    void processPayment() {
        System.out.println("UPI Payment");
    }

    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();

        p1.processPayment();
        p2.processPayment();
    }
}
