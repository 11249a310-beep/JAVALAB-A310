interface Payment {
    void pay();
}

class UPIPayment implements Payment {
    public void pay() {
        System.out.println("Payment made using UPI.");
    }
}

class CardPayment implements Payment {
    public void pay() {
        System.out.println("Payment made using Card.");
    }
}

class main {
    public static void main(String[] args) {
        Payment p1 = new UPIPayment();
        Payment p2 = new CardPayment();

        p1.pay();
        p2.pay();
    }
}