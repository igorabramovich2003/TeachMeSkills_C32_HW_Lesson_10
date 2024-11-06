package com.teachmeskills.lesson_10.operation.card_operation;

import com.teachmeskills.lesson_10.model.card.Card;

public class CardOperation {

    public static void SearchDuplicateCards(Card[] cards) {
        int count = 0;

        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                if (cards[i].equals(cards[j])) {
                    System.out.println(cards[i] + " is a duplicate of " + cards[j] + " cards.");
                    count++;
                }else {
                    System.out.println(cards[i] + " is not a duplicate of " + cards[j] + " cards.");
                }
                System.out.println("-----------------------------------");
            }
        }
        if (count == 0){
            System.out.println("There are no duplicate cards.");
        }else{
            System.out.println("There are " + count + " duplicate cards in this list.");
        }
    }

    public static void countDuplicateCards(Card[] cards) {
        if (cards == null) {
            System.out.println("There is no cards in this list");
        } else if (cards.length == 1) {
            System.out.println("There is one card in this list");
        } else {
            SearchDuplicateCards(cards);
        }
    }

}
