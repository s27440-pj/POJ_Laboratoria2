// Autor: Krystyna Tokarska
// Zadanie 4: Zaimplementuj klasę Clock. Klasa zawierać będzie pola: hours, minutes, seconds. Zmienna hours
// przyjmuje wartości z zakresu 0-23, minutes z zakresu 0-59, seconds 0-59. Dodaj trzy konstruktor: - domyślny -
// inicjalizuje godzinę 12:00:00; - konstruktor zawierający trzy parametry: hours, minutes, seconds, - konstruktor
// z jednym parametrem - czas w sekundach licząc od północy jest konwertowany do pól: hours, minutes, seconds.
// Dodaj metody: - getHours(), getMinutes(), getSeconds(), bez parametrów, które zwracają odpowiednie wartości;
// - setHours(), setMinutes(), setSeconds(), z jednym parametrem, który ustawia odpowiednie wartości; - tick(), bez
// parametrów, która inkrementuje wartość second o jeden. Przykład: wartość 00:00:01 zamieni się na 00:00:02;
// wartość 00:59:59 zmieni się na 01:00:00; - tickDown(), zmniejsza wartość sekund o jedno; analogiczna do tick();
// - toString(), bez parametrów, zwraca reprezentację obiektu w postaci "[hh-mm-ss]", uzupełnioną o nieznaczące zera,
// na przykład: "[03:12:56]". Przetestuj zaimplementowany program.
public class ClockTest {

    public static void main(String[] args) {
        Clock time1 = new Clock(3672);
        Clock time2 = new Clock(125);
        Clock time3 = new Clock(23, 59, 59);
        Clock time4 = new Clock();
        Clock time5 = new Clock();
        time4.setSeconds(0);
        time4.setMinutes(0);
        time4.setHours(0);
        time3.tick();
        time4.tickDown();

        System.out.println(time1.toString());
        System.out.println(time2.toString());
        System.out.println(time3.toString());
        System.out.println(time4.toString());
        System.out.println(time5.toString());
    }
}
