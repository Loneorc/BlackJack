import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Card> deck = new ArrayList<>();

        deck.add(new Card("Diamonds 2", 2));
        deck.add(new Card("Diamonds 3", 3));
        deck.add(new Card("Diamonds 4", 4));
        deck.add(new Card("Diamonds 5", 5));
        deck.add(new Card("Diamonds 6", 6));
        deck.add(new Card("Diamonds 7", 7));
        deck.add(new Card("Diamonds 8", 8));
        deck.add(new Card("Diamonds 9", 9));
        deck.add(new Card("Diamonds 10", 10));
        deck.add(new Card("Jack of Diamonds", 10));
        deck.add(new Card("Queen of Diamonds", 10));
        deck.add(new Card("King of Diamonds", 10));
        deck.add(new Card("Ace of Diamonds", 11));
        deck.add(new Card("Hearts 2", 2));
        deck.add(new Card("Hearts 3", 3));
        deck.add(new Card("Hearts 4", 4));
        deck.add(new Card("Hearts 5", 5));
        deck.add(new Card("Hearts 6", 6));
        deck.add(new Card("Hearts 7", 7));
        deck.add(new Card("Hearts 8", 8));
        deck.add(new Card("Hearts 9", 9));
        deck.add(new Card("Hearts 10", 10));
        deck.add(new Card("Jack of Hearts", 10));
        deck.add(new Card("Queen of Hearts", 10));
        deck.add(new Card("King of Hearts", 10));
        deck.add(new Card("Ace of Hearts", 11));
        deck.add(new Card("Clubs 2", 2));
        deck.add(new Card("Clubs 3", 3));
        deck.add(new Card("Clubs 4", 4));
        deck.add(new Card("Clubs 5", 5));
        deck.add(new Card("Clubs 6", 6));
        deck.add(new Card("Clubs 7", 7));
        deck.add(new Card("Clubs 8", 8));
        deck.add(new Card("Clubs 9", 9));
        deck.add(new Card("Clubs 10", 10));
        deck.add(new Card("Jack of Clubs", 10));
        deck.add(new Card("Queen of Clubs", 10));
        deck.add(new Card("King of Clubs", 10));
        deck.add(new Card("Ace of Clubs", 11));
        deck.add(new Card("Spades 2", 2));
        deck.add(new Card("Spades 3", 3));
        deck.add(new Card("Spades 4", 4));
        deck.add(new Card("Spades 5", 5));
        deck.add(new Card("Spades 6", 6));
        deck.add(new Card("Spades 7", 7));
        deck.add(new Card("Spades 8", 8));
        deck.add(new Card("Spades 9", 9));
        deck.add(new Card("Spades 10", 10));
        deck.add(new Card("Jack of Spades", 10));
        deck.add(new Card("Queen of Spades", 10));
        deck.add(new Card("King of Spades", 10));
        deck.add(new Card("Ace of Spades", 11));

        deck.add(new Card("Diamonds 2", 2));
        deck.add(new Card("Diamonds 3", 3));
        deck.add(new Card("Diamonds 4", 4));
        deck.add(new Card("Diamonds 5", 5));
        deck.add(new Card("Diamonds 6", 6));
        deck.add(new Card("Diamonds 7", 7));
        deck.add(new Card("Diamonds 8", 8));
        deck.add(new Card("Diamonds 9", 9));
        deck.add(new Card("Diamonds 10", 10));
        deck.add(new Card("Jack of Diamonds", 10));
        deck.add(new Card("Queen of Diamonds", 10));
        deck.add(new Card("King of Diamonds", 10));
        deck.add(new Card("Ace of Diamonds", 11));
        deck.add(new Card("Hearts 2", 2));
        deck.add(new Card("Hearts 3", 3));
        deck.add(new Card("Hearts 4", 4));
        deck.add(new Card("Hearts 5", 5));
        deck.add(new Card("Hearts 6", 6));
        deck.add(new Card("Hearts 7", 7));
        deck.add(new Card("Hearts 8", 8));
        deck.add(new Card("Hearts 9", 9));
        deck.add(new Card("Hearts 10", 10));
        deck.add(new Card("Jack of Hearts", 10));
        deck.add(new Card("Queen of Hearts", 10));
        deck.add(new Card("King of Hearts", 10));
        deck.add(new Card("Ace of Hearts", 11));
        deck.add(new Card("Clubs 2", 2));
        deck.add(new Card("Clubs 3", 3));
        deck.add(new Card("Clubs 4", 4));
        deck.add(new Card("Clubs 5", 5));
        deck.add(new Card("Clubs 6", 6));
        deck.add(new Card("Clubs 7", 7));
        deck.add(new Card("Clubs 8", 8));
        deck.add(new Card("Clubs 9", 9));
        deck.add(new Card("Clubs 10", 10));
        deck.add(new Card("Jack of Clubs", 10));
        deck.add(new Card("Queen of Clubs", 10));
        deck.add(new Card("King of Clubs", 10));
        deck.add(new Card("Ace of Clubs", 11));
        deck.add(new Card("Spades 2", 2));
        deck.add(new Card("Spades 3", 3));
        deck.add(new Card("Spades 4", 4));
        deck.add(new Card("Spades 5", 5));
        deck.add(new Card("Spades 6", 6));
        deck.add(new Card("Spades 7", 7));
        deck.add(new Card("Spades 8", 8));
        deck.add(new Card("Spades 9", 9));
        deck.add(new Card("Spades 10", 10));
        deck.add(new Card("Jack of Spades", 10));
        deck.add(new Card("Queen of Spades", 10));
        deck.add(new Card("King of Spades", 10));
        deck.add(new Card("Ace of Spades", 11));


        System.out.println("Welcome to our Casino!");
        System.out.println("Here are the rules for the Black Jack Game:");
        System.out.println();
        System.out.println("* Our deck has 104 cards and you play against the Dealer.");
        System.out.println("* When you start the game you take right away 2 cards.");
        System.out.println("* If you hit 21 with your 2 first cards or with any number of cards you win!");
        System.out.println("* If not, you can hit and take another card or stand.");
        System.out.println("* If you stand, Dealer hits until his cards value is equal to or below 16.");
        System.out.println("* In any case, you win if you get a higher card total than the Dealer without going over 21.");
        System.out.println("* All cards have a face value, all figures have a value of 10, all Aces have a value of 11.");
        System.out.println("* If you have 2 Aces in the beginning of the game, your cards value is 2 instead of 22.");
        System.out.println("* You start with 500 chips.");
        System.out.println("* Each bet is 50 chips. If you win you take twice your bet.");
        System.out.println();
        System.out.println("Let's play!!!!!!!");
        System.out.println();

        int playerHandValue = 0;
        String playerHand = "";
        int counter = 0;
        int money = 50; //Changed from 100
        int dealerHandValue = 0;
        String dealerHand = "";

        while (counter != 1) {
            System.out.println("Option 1: Start the game.");
            System.out.println("Option 2: Exit program.");
            System.out.print("Option: ");

            int option2 = scanner.nextInt();
            System.out.println("**********************************");
            if (option2 == 1) {
                //Dealer gets 1
                for (int i = 0; i < 1; i++) {
                    int randomNumber = ThreadLocalRandom.current().nextInt(0, deck.size());

                    dealerHandValue += deck.get(randomNumber).getCardValue();
                    dealerHand += deck.get(randomNumber).getCardname() + "\n";
                    deck.remove(deck.get(randomNumber));
                }
                //Player gets 2
                for (int i = 0; i < 2; i++) {
                    int randomNumber = ThreadLocalRandom.current().nextInt(0, deck.size());

                    playerHandValue += deck.get(randomNumber).getCardValue();
                    playerHand += deck.get(randomNumber).getCardname() + "\n";
                    deck.remove(deck.get(randomNumber));

                    if (playerHandValue == 21) {
                        money += 100;

                        System.out.println("YOU WON! BLACKJACK!!!! ;)");
                        System.out.println("\nYour cards are: " + "\n" + playerHand);
                        System.out.println("Your cards value is: " + playerHandValue + ".");
                        System.out.println("Your balance is: " + money);
                        System.out.println();

                        dealerHand="";
                        dealerHandValue = 0;
                        playerHandValue = 0;
                        playerHand ="";
                        break;
                    } else if (playerHandValue > 21) {
                        playerHandValue = 2;
                        System.out.println("You got 2 ACES , go on!");
                        break;
                    }
                }
                if (playerHandValue > 0) {
                    System.out.println("Dealer's card is: " + dealerHand);
                    System.out.println("Dealer's cards value is: " + dealerHandValue);
                    System.out.println("\nYour cards are: " + "\n" + playerHand);
                    System.out.println("Your cards value is: " + playerHandValue + ".");
                    System.out.println("Your balance is: " + money);
                    System.out.println();
                }
                counter++;

            }  else if (option2 == 2) {
                System.out.println("\nExiting...");
                System.exit(0);
            }
            do {


                if (money == 0){
                    System.out.println("YOU ARE OUT OF MONEY! GO HOME!");
                    System.exit(0);
                }
                if (money >= 1000){
                    System.out.println("BANK ROBBED! YOU ARE VERY RICH AND YOU CAN ENJOY YOUR LIFE!");
                    System.out.println("Your balance is: " + money);
                    System.exit(0);
                }

                System.out.print("**********************************");
                System.out.println("\nHow do you want to continue?");
                System.out.println("\nOption 1: Start a new round");
                System.out.println("Option 2: Hit another card");
                System.out.println("Option 3: Stand");
                System.out.print("Option 4: Quit");
                System.out.print("\n**********************************");
                System.out.print("\nOption: ");
                int option = scanner.nextInt();
                System.out.println("**********************************");

                if (option == 1) {

                    if (playerHandValue > 0) {
                        System.out.println("You cannot start a new round. Just hit or stand!");
                    } else {
                        //Dealer gets 1 card
                        for (int i = 0; i < 1; i++) {
                            int randomNumber = ThreadLocalRandom.current().nextInt(0, deck.size());

                            dealerHandValue += deck.get(randomNumber).getCardValue();
                            dealerHand += deck.get(randomNumber).getCardname() + "\n";
                            deck.remove(deck.get(randomNumber));
                        }
                        //Player gets 2 card
                        for (int i = 0; i < 2; i++) {
                            int randomNumber = ThreadLocalRandom.current().nextInt(0, deck.size());

                            playerHandValue += deck.get(randomNumber).getCardValue();
                            playerHand += deck.get(randomNumber).getCardname() + "\n";
                            deck.remove(deck.get(randomNumber));
                            if (playerHandValue == 21) {
                                money += 100;

                                System.out.println("YOU WON! BLACKJACK! ;)");
                                System.out.println("\nYour cards are: " + "\n" + playerHand);
                                System.out.println("Your cards value is: " + playerHandValue + ".");
                                System.out.println("Your balance is: " + money);
                                System.out.println();

                                dealerHand = "";
                                dealerHandValue = 0;
                                playerHandValue = 0;
                                playerHand = "";

                                if(deck.size() < 8){
                                    System.out.println("We are out of cards! You cannot start another round!");
                                    System.out.println("Your balance is: " + money);
                                    System.exit(0);
                                }

                                break;
                            } else if (playerHandValue > 21) {
                                playerHandValue = 2;
                                System.out.println("You got 2 Aces , go on!");
                                break;
                            }
                        }
                        if (playerHandValue > 0) {
                            System.out.println("Dealer's card is: " + dealerHand);
                            System.out.println("Dealer's cards value is: " + dealerHandValue);
                            System.out.println("\nYour cards are: " + "\n" + playerHand);
                            System.out.println("Your cards value is: " + playerHandValue + ".");
                            System.out.println("Your balance is: " + money);
                            System.out.println();
                        }
                    }
                }

                if (option == 2) {
                    if (playerHandValue == 0){
                        System.out.println("You cannot hit! Just choose option 1 and start a new round!");
                    } else {
                        for (int i = 0; i < 1; i++) {
                            //Deal 2 cards for the player
                            int randomNumber = ThreadLocalRandom.current().nextInt(0, deck.size());
                            System.out.println("You got: " + deck.get(randomNumber).getCardname());
                            playerHandValue += deck.get(randomNumber).getCardValue();
                            playerHand += deck.get(randomNumber).getCardname() + "\n";
                            deck.remove(deck.get(randomNumber));
                        }
                        System.out.println("\nYour cards are: " + "\n" + playerHand);
                        System.out.println("Your cards value is: " + playerHandValue);
                        if (playerHandValue == 21) {
                            System.out.println("**********");
                            System.out.println("*YOU WON!*");
                            System.out.println("**********");
                            playerHandValue = 0;
                            playerHand = "";
                            money += 100;
                            dealerHand = "";
                            dealerHandValue = 0;
                            System.out.println("Your balance is: " + money);
                            System.out.println();

                            if(deck.size() < 8){
                                System.out.println("We are out of cards! You cannot start another round!");
                                System.exit(0);
                            }
                            //break;
                        } else if (playerHandValue > 21) {
                            System.out.println("***********");
                            System.out.println("*YOU LOST!*");
                            System.out.println("***********");
                            playerHandValue = 0;
                            playerHand = "";
                            money -= 50;
                            dealerHand = "";
                            dealerHandValue = 0;
                            System.out.println("Your balance is: " + money);
                            System.out.println();
                            if(deck.size() < 8){
                                System.out.println("We are out of cards! You cannot start another round!");
                                System.exit(0);
                            }
                            //break;
                        }
                    }
                } else if (option == 4) {
                    System.out.println("\nExiting...");
                    System.exit(0);
                } else if (option == 3) {
                    if (playerHandValue == 0) {
                        System.out.println("You cannot stand! Just choose option 1 and start a new round!");
                    } else {
                        while (dealerHandValue <= 16) {
                            int randomNumber = ThreadLocalRandom.current().nextInt(0, deck.size());
                            dealerHandValue += deck.get(randomNumber).getCardValue();
                            dealerHand += deck.get(randomNumber).getCardname() + "\n";
                            deck.remove(deck.get(randomNumber));
                        }
                        System.out.println();
                        System.out.println("Dealer's hand is: " + "\n" + dealerHand);
                        System.out.println("Dealer's cards value is: " + dealerHandValue);
                        System.out.println("Your cards value is: " + playerHandValue);
                        System.out.println();
                        if (dealerHandValue > 21 || dealerHandValue < playerHandValue) {
                            System.out.println("**********");
                            System.out.println("*YOU WON!*");
                            System.out.println("**********");
                            money += 100;
                            System.out.println("Your balance is: " + money);
                            System.out.println();

                        } else {
                            System.out.println("***********");
                            System.out.println("*YOU LOST!*");
                            System.out.println("***********");
                            money -= 50;
                            System.out.println("Your balance is: " + money);
                            System.out.println();
                        }
                        playerHandValue = 0;
                        dealerHandValue = 0;
                        dealerHand = "";
                        playerHand = "";

                        if(deck.size() < 8){
                            System.out.println("We are out of cards! You cannot start another round!");
                            System.exit(0);
                        }
                    }
                }
            }
            while (true);
        }
    }
}