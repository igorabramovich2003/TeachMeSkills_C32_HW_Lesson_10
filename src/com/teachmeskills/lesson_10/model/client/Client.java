package com.teachmeskills.lesson_10.model.client;

import com.teachmeskills.lesson_10.model.card.Card;

public class Client {
    private String name;
    private Card[] cards;

    public Client(String name) {
        this.name = name;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
