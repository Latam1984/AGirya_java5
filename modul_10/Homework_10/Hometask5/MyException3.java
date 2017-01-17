package modul_10.Homework_10.Hometask5;

/**
 * Created by Aleksey on 17.01.2017.
 */
public class MyException3 extends Exception {
    int someExceptionNumber;

    public void myException3(String s) {
        this.someExceptionNumber = someExceptionNumber;
    }

    @Override
    public String toString() {
        return "MyException3{" +
                '}';
    }
}
