public class Card {

    private String cardname;
    private int cardValue;

    public Card(String cardname, int cardFaceValue) {
        this.cardname = cardname;
        this.cardValue = cardFaceValue;// Changed from cardValue
    }

    public String getCardname() {
        return cardname;
    }

    public int getCardValue() {
        return cardValue;
    }
}
