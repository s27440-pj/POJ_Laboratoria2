// Autor: Krystyna Tokarska
// Zad5.Zaimplementuj klasę Numbers. Dodaj konstruktor który przyjmuje trzy liczby typu integer. Dodaj metody: - sum(),
// zwraca sumę liczb; - average(), zwraca średnią arytmetyczną liczb; - min(), zwraca najmniejszą z liczb; - max(),
// zwraca największą z liczb; - geometric(), zwraca średnią geometryczną liczb; Przetestuj zaimplementowany program.
public class NumberTest {

    public static void main(String[] args) {
        Number set1 = new Number(4, 9, 12);
        Number set2 = new Number(-10, 9, 12);
        Number set3 = new Number(-2, 9, -22);

        set1.allMethods();
        System.out.println();
        set2.allMethods();
        System.out.println();
        set3.allMethods();
    }
}
