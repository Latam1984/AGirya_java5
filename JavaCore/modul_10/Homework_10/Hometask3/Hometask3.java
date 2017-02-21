package JavaCore.modul_10.Homework_10.Hometask3;

/**
 * Created by Aleksey on 16.01.2017.
 */
public class Hometask3 {
    public static void main(String[] args) {
        Object someObject = new Object();
        someObject = null;

        try {
            someObject.notify();
        } catch (NullPointerException n) {
            System.out.println("Object null!");
        }
    }
}
