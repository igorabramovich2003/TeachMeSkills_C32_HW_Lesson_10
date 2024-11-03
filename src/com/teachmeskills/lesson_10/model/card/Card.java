package com.teachmeskills.lesson_10.model.card;

import java.util.Objects;

public class Card {

    private int cvv;
    private String cardNumber;
    private double amount;

    public Card(int cvv, String cardNumber, double amount) {
        this.cvv = cvv;
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cvv == card.cvv && Objects.equals(cardNumber, card.cardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cvv, cardNumber);
    }

    @Override
    public String toString() {
        return "Card{" +
                "amount=" + amount +
                ", cardNumber='" + cardNumber + '\'' +
                ", cvv=" + cvv +
                '}';
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
