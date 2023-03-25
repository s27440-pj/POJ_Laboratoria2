// Autor: Krystyna Tokarska
// Zadanie 3: Zaimplementuj klasę MyDate, która przechowuje informację: month (typu int), day(typu int) i year
// (type int). Klasa powinna zawierać konstruktor, który inicjalizuje zmienne, sprawdzając poprawność zakresów
// (day 0-31, month 0-12, year 1990-2050). Zaimplementuj methody set i get dla wszystkich pól. Dodaj metodę
// displayDate, która wyświetli pola z uwzględnieniem zer nieznaczących oddzielone znakiem "/", np 21/03/2051.
// Przetestuj zaimplementowaną klasę.
public class MyDateTest {
    public static void main(String[] args) {
        MyDate data1 = new MyDate(10, 20, 2023);
        MyDate data2 = new MyDate(9, 1, 1991);
//        MyDate data3 = new MyDate(12, 31, 1989);      // Incorrect ones - to test

        data1.displayDate();
        data2.displayDate();
    }
}
