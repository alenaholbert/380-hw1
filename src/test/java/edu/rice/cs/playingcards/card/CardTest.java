package edu.rice.cs.playingcards.card;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CardTest {
    private static Card card1 = new Card(Card.Rank.ACE, Card.Suit.SPADES);

    @Test
    @Order(1)
    void testCardToString() {
        assertEquals("A of Spades", card1.toString());
    }
}