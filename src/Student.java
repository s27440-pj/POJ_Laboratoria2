// Autor: Krystyna Tokarska
// Zadanie 2: Zaimplementuj klasę Student, do przechowywania imienia, nazwiska, numer indeksu i obecność
// (wyrażonej w procentach) oceny z POJ (typu int). Jeżeli podczas tworzenia obiektu nie zostało przekazane imię
// i nazwisko, pola powinny być ustawione wartością "Unknown". Dodaj odpowiednie metody set i get do wszystkich pól
// klasy. Jeżeli obecnocność jest mniejsza niż 50%, student powinien otrzymać ocenę 2. Przetestuj program, tworząc
// trzy różne obiekty klasy Student.
public class Student {
    private String name = "Unknown";
    private String surname = "Unknown";
    private String index_number;
    private int grade_POJ;
    private double presence;

    public Student(String name, String surname, String index_number, int grade_POJ, double presence) {
        this.name = name;
        this.surname = surname;
        this.index_number = index_number;
        if (grade_POJ < 2 || grade_POJ > 5) {
            throw new RuntimeException("The lowest grade is 2, and the highest is 5");
        } else this.grade_POJ = grade_POJ;
        if (presence < 0 || presence > 100) {
            throw new RuntimeException("Presence need to be grater or equal 0 and lower or equal 100.");
        } else {
            this.presence = presence;
            if (presence < 50) {
                this.grade_POJ = 2;
            }
        }
    }

    public Student(String index_number, int grade_POJ, double presence) {
        this.index_number = index_number;
        if (grade_POJ < 2 || grade_POJ > 5) {
            throw new RuntimeException("The lowest grade is 2, and the highest is 5");
        } else this.grade_POJ = grade_POJ;
        if (presence < 0 || presence > 100) {
            throw new RuntimeException("Presence need to be grater or equal 0 and lower or equal 100.");
        } else {
            this.presence = presence;
            if (presence < 50) {
                this.grade_POJ = 2;
            }
        }
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIndex_number() {
        return index_number;
    }

    public void setIndex_number(String index_number) {
        this.index_number = index_number;
    }

    public double getPresence() {
        return presence;
    }

    public void setPresence(double presence) {
        if (presence < 0 || presence > 100) {
            throw new RuntimeException("Presence need to be grater or equal 0 and lower or equal 100.");
        } else {
            this.presence = presence;
            if (presence < 50) {
                this.setGrade_POJ(2);
            }
            this.presence = presence;
        }
    }

    public int getGrade_POJ() {
        return grade_POJ;
    }

    public void setGrade_POJ(int grade_POJ) {
        if (grade_POJ < 2 || grade_POJ > 5) {
            throw new RuntimeException("The lowest grade is 2, and the highest is 5");
        } else this.grade_POJ = grade_POJ;
    }

    public void student_description() {
        System.out.println("Student's name is " + getName() + " and surname is " + getSurname() + " index number: "
                + getIndex_number());
        System.out.println("Her/His presence on POJ was " + getPresence() + "%, and his/her grade is: "
                + getGrade_POJ());
    }
}
