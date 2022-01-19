package edu.rice.cs.playingcards.card;

import junit.framework.TestCase;

public class CardTest extends TestCase {
    private static Card card1 = new Card(Card.Rank.ACE, Card.Suit.SPADES);

    public void testCardToString() {
        assertEquals("A of Spades", card1.toString());
    }

    public void testNullsNotAcceptedInConstructor() {
        // Test that null Rank and null Suit are not accepted
        try {
            new Card(null, null);
            fail ("Expected: " + NullPointerException.class.getName());
        } catch (NullPointerException npe) {}

        // Test that null Rank is not accepted
        for (Card.Suit suit: Card.Suit.values()) {
            try {
                new Card(null, suit);
                fail("Expected: " + NullPointerException.class.getName());
            } catch (NullPointerException npe) {}
        }

        // Test that null Suit is not accepted
        for (Card.Rank rank: Card.Rank.values()) {
            try {
                new Card(rank, null);
                fail("Expected: " + NullPointerException.class.getName());
            } catch (NullPointerException npe) {}
        }
    }
}