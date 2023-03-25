// Autor: Krystyna Tokarska
// Zadanie1: Zaimplementuj klasę Card reprezentującą pojedynczą kartę do gry z talii kart.
// Klasa powinna przechowywać wartość i kolor: kier, karo, pik, trefl. W zadaniu użyj typu wyliczeniowego.
// Napisz program testujący, który stworzy trzy różne obiekty klasy Card.
public class CardTest {
    public static void main(String[] args) {
        Card card1 = new Card();
        card1.setValue(1);
        card1.color = Card.Color.pik;

        Card card2 = new Card();
        card2.setValue(13);
        card2.color = Card.Color.kier;

        Card card3 = new Card(Card.Color.trefl, 13);

        Card.card_information();
        card1.card_description();
        card2.card_description();
        card3.card_description();
    }
}
