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
public class Clock {
    private int hours=12;
    private int minutes=0;
    private int seconds=0;

    public Clock() {
    }

    public Clock(int hours, int minutes, int seconds) {
        if (hours < 0 || hours > 23) {
            throw new RuntimeException("Hours need to be a number between 0 and 23");
        } else {
            this.hours = hours;
        }

        if (minutes < 0 || minutes > 59) {
            throw new RuntimeException("Minutes have to be a number between 0 and 59");
        } else {
            this.minutes = minutes;
        }

        if (seconds < 0 || seconds > 59) {
            throw new RuntimeException("Minutes have to be a number between 0 and 59");
        } else {
            this.seconds = seconds;
        }
    }

    public Clock(int seconds) {
        int minute_in_seconds = 60;
        int hour_in_seconds = 3600;
        int day_in_seconds = 86400;
        // If another day comes - clock is again showing 00:00:00 and we have to show only time, not day
        seconds = seconds % day_in_seconds;
        if (seconds < 0) {
            throw new RuntimeException("Seconds have to be a number higher than 0");
        } else if (seconds < minute_in_seconds) {
            this.seconds = seconds;
            this.minutes = 0;
            this.hours = 0;
        } else if (seconds < hour_in_seconds) {
            this.minutes = (int) Math.floor(seconds / minute_in_seconds);
            this.seconds = seconds % minute_in_seconds;
            this.hours = 0;
        } else {
            this.hours = (int) Math.floor(seconds / hour_in_seconds);
            seconds = seconds - this.hours * hour_in_seconds;
            this.minutes = (int) Math.floor(seconds / minute_in_seconds);
            this.seconds = seconds % minute_in_seconds;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 0 || hours > 23) {
            throw new RuntimeException("Hours need to be a number between 0 and 23");
        } else {
            this.hours = hours;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 59) {
            throw new RuntimeException("Minutes have to be a number between 0 and 59");
        } else {
            this.minutes = minutes;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59) {
            throw new RuntimeException("Minutes have to be a number between 0 and 59");
        } else {
            this.seconds = seconds;
        }
    }

    public void tick() {
        if (this.seconds == 59) {
            setSeconds(0);
            if (this.minutes == 59) {
                setMinutes(0);
                if (this.hours == 23) {
                    setHours(0);
                } else {
                    setHours(this.hours + 1);
                }
            } else {
                setMinutes(this.minutes + 1);
            }
        } else {
            setSeconds(this.seconds + 1);
        }
    }

    public void tickDown() {
        if (this.seconds == 0) {
            setSeconds(59);
            if (this.minutes == 0) {
                setMinutes(59);
                if (this.hours == 0) {
                    setHours(23);
                } else {
                    setHours(this.hours - 1);
                }
            } else {
                setMinutes(this.minutes - 1);
            }
        } else {
            setSeconds(this.seconds - 1);
        }
    }

    // Needs to have a name toString - change it later

    @Override
    public String toString() {
        String hour;
        String minute;
        String second;
        if (this.hours < 10) {
            hour = ("0" + this.hours + "-");
        } else {
            hour = (this.hours + "-");
        }
        if (this.minutes < 10) {
            minute = ("0" + this.minutes + "-");
        } else {
            minute = (this.minutes + "-");
        }
        if (this.seconds < 10) {
            second = ("0" + this.seconds);
        } else {
            second = (this.seconds + "");
        }
        return (hour + minute + second);
    }

}
