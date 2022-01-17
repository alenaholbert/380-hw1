import static org.junit.jupiter.api.Assertions.*;

import main.java.edu.rice.cs.playingcards.card.Card.java;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CardTest {
    private static Card card1 = new Card(Rank.ACE, Suit.SPADES);

    @Test
    @Order(1)
    void testCardToString() {
        assertEquals("A of SPADES");
    }
}