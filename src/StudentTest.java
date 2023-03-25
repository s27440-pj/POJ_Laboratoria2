// Autor: Krystyna Tokarska
// Zadanie 2: Zaimplementuj klasę Student, do przechowywania imienia, nazwiska, numer indeksu i obecność
// (wyrażonej w procentach) oceny z POJ (typu int). Jeżeli podczas tworzenia obiektu nie zostało przekazane imię
// i nazwisko, pola powinny być ustawione wartością "Unknown". Dodaj odpowiednie metody set i get do wszystkich pól
// klasy. Jeżeli obecnocność jest mniejsza niż 50%, student powinien otrzymać ocenę 2. Przetestuj program, tworząc
// trzy różne obiekty klasy Student.
public class StudentTest {

    public static void main(String[] args) {

        Student krysia = new Student("Krystyna", "Tokarska", "27440", 5, 70);

        Student basia = new Student();
        basia.setName("Barbara");
        basia.setGrade_POJ(3);
        basia.setPresence(40);
        basia.setIndex_number("12345");
        basia.setPresence(40);

        Student adam = new Student("12947", 4, 20);
        adam.setSurname("Walentkowski");

        System.out.println("krysia");
        krysia.student_description();
        System.out.println("basia");
        basia.student_description();
        System.out.println("adam");
        adam.student_description();
    }
}
