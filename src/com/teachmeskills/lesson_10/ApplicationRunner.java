package com.teachmeskills.lesson_10;

import com.teachmeskills.lesson_10.model.card.Card;
import com.teachmeskills.lesson_10.model.client.Client;
import com.teachmeskills.lesson_10.operation.card_operation.CardOperation;

public class ApplicationRunner {
    public static void main(String[] args) {
        Client client = new Client("Igor");

        Card[] cards = new Card[]{new Card(322, "1234", 1000),
                                  new Card(322, "1234", 2000),
                                  new Card(322, "1234", 3000),
                                  new Card(322, "1234", 4000),
                                  new Card(322, "1234", 5000)};


        client.setCards(cards);
        CardOperation.countDuplicateCards(client.getCards());

    }
}
