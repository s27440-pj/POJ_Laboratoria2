// Autor: Krystyna Tokarska
// Zad5.Zaimplementuj klasę Numbers. Dodaj konstruktor który przyjmuje trzy liczby typu integer. Dodaj metody: - sum(),
// zwraca sumę liczb; - average(), zwraca średnią arytmetyczną liczb; - min(), zwraca najmniejszą z liczb; - max(),
// zwraca największą z liczb; - geometric(), zwraca średnią geometryczną liczb; Przetestuj zaimplementowany program.
public class Number {

    private Integer number1;
    private Integer number2;
    private Integer number3;

    public Number(Integer number1, Integer number2, Integer number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }


    public Integer sum() {
        Integer sum = number1 + number2 + number3;
        return sum;
    }

    public double average() {
        int n = 3;
        double average = (double) (number1 + number2 + number3) / n;
        return average;
    }

    // There was a problem with pow (number, 1/n) when number was negative. dk why because third degree root exists
    // also for negative numbers.
    public double geometrics() {
        int n = 3;
        int product = number1 * number2 * number3;
        int product_abs = Math.abs(product);
        double geometrics = Math.pow(product_abs, (double) 1 / n);
        if (product < 0) {
            geometrics = -geometrics;
        }
        return geometrics;
    }

    public Integer max() {
        Integer max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        return max;
    }

    public Integer min() {
        Integer min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        return min;
    }

    public void allMethods() {
        System.out.println("Sum: " + sum());
        System.out.println("Min: " + min());
        System.out.println("Max: " + max());
        System.out.println("Average: " + average());
        System.out.println("Geometrics: " + geometrics());
    }
}
