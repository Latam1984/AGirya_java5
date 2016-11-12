package modul_3.Homework_3_2;

/**
 * Created by Aleksey on 11.11.2016.
 */
public class Adder extends Arithmetic {
    public boolean check(Integer a, Integer b) {
        if (a >= b) {
            return true;
        } else {
            return false;
        }
    }
}
