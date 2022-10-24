public class Card {

    private String cardname;
    private int cardValue;

    public Card(String cardname, int cardValue) {
        this.cardname = cardname;
        this.cardValue = cardValue;
    }

    public String getCardname() {
        return cardname;
    }

    public int getCardValue() {
        return cardValue;
    }
}
