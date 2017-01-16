package modul_10.Homework_10.Hometask1;

/**
 * Created by Aleksey on 16.01.2017.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Exception exception = new Exception("Some exeption");
            throw exception;
        } catch (Exception e) {
            System.out.println("We catch some exception!");
        } finally {
            System.out.println("Some finally block.");
        }
    }
}
