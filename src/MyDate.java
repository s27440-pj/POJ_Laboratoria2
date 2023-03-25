// Autor: Krystyna Tokarska
// Zadanie 3: Zaimplementuj klasę MyDate, która przechowuje informację: month (typu int), day(typu int) i year
// (type int). Klasa powinna zawierać konstruktor, który inicjalizuje zmienne, sprawdzając poprawność zakresów
// (day 0-31, month 0-12, year 1990-2050). Zaimplementuj methody set i get dla wszystkich pól. Dodaj metodę
// displayDate, która wyświetli pola z uwzględnieniem zer nieznaczących oddzielone znakiem "/", np 21/03/2051.
// Przetestuj zaimplementowaną klasę.
public class MyDate {

    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year){
        if (month < 1 | month > 12){
            throw new RuntimeException("Month need bo be a number between 1 and 12");
        } else {
            this.month = month;
        }

        if (day < 1 || day > 31){
            throw new RuntimeException("Day need bo be a number between 1 and 31");
        } else {
            this.day = day;
        }

        if (year < 1990 || year > 2050){
            throw new RuntimeException("Year need bo be a number between 1990 and 2050");
        } else {
            this.year = year;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 | month > 12){
            throw new RuntimeException("Month need bo be a number between 1 and 12");
        } else {
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31){
            throw new RuntimeException("Day need bo be a number between 1 and 31");
        } else {
            this.day = day;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1990 || year > 2050){
            throw new RuntimeException("Year need bo be a number between 1990 and 2050");
        } else {
            this.year = year;
        }
    }

    public void displayDate(){
        if (getDay() < 10){
            System.out.print("0" + getDay() + "/");
        } else {
            System.out.print(getDay() + "/");
        }
        if (getMonth()<10){
            System.out.print("0" + getMonth() + "/");
        } else {
            System.out.print(getMonth() + "/");
        }
        System.out.print(getYear());
        System.out.println();
    }
}
