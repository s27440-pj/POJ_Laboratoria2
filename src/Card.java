// Autor: Krystyna Tokarska
// Zadanie1: Zaimplementuj klasę Card reprezentującą pojedynczą kartę do gry z talii kart.
// Klasa powinna przechowywać wartość i kolor: kier, karo, pik, trefl. W zadaniu użyj typu wyliczeniowego.
// Napisz program testujący, który stworzy trzy różne obiekty klasy Card.

public class Card {
    public enum Color {
        karo, kier, pik, trefl
    }
    public Color color;
    private int value;

    public Card(Color color, int value) {
        this.color = color;
        if ((value < 1) || (value > 13)) {
            throw new RuntimeException("The value of the card have to be higher than 0 and lower than 13.");
        } else this.value = value;
    }

    public Card() {
    }

    public void setValue(int value) {
        if ((value < 1) || (value > 13)) {
            throw new RuntimeException("The value of the card have to be higher than 0 and lower than 13.");
        } else this.value = value;
    }

    //Can add here an information about what card (card1, card2)
    public void card_description() {
        System.out.println("Value of this card is " + value + " and it's a " + color);
    }

    public static void card_information() {
        System.out.println("Ace is represented by 1, Jack by 11, Queen by 12 and King by 13.");
    }
}
