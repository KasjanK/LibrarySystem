package com.company;

public class PaymentService {
    boolean paid = false;

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean pay(int amount, int cost) {
        if (amount < cost) {
            return false;
        }
        paid = true;
        return true;
    }

    public void pay(int cost) {
        if (5 > cost) {
            throw new IllegalStateException();
        }
    }
}
