package modul_10.Homework_10.Hometask2;

/**
 * Created by Aleksey on 16.01.2017.
 */
public class MyException extends Exception {
    String ex;

    public MyException(String ex) {
       this.ex = ex;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "ex='" + ex + '\'' +
                '}';
    }
}
