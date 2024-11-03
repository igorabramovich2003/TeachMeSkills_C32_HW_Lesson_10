package com.teachmeskills.lesson_10;

import com.teachmeskills.lesson_10.model.client.Client;

public class ApplicationRunner {
    public static void main(String[] args) {
        Client client1 = new Client(5);

        client1.addCard(322, "1234", 1000);
        client1.addCard(322, "1234", 2000);
        client1.addCard(322, "1234", 3000);
        client1.addCard(322, "1234", 4000);
        client1.addCard(322, "1234", 5000);


        client1.countDuplicateCards();

    }
}
