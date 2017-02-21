package JavaCore.modul_10.Homework_10.Hometask5;

/**
 * Created by Aleksey on 17.01.2017.
 */
public class MyException2 extends Exception {
    int someExceptionNumber;

    public void myException2(String s) {
        this.someExceptionNumber = someExceptionNumber;
    }

    @Override
    public String toString() {
        return "MyException2{" +
                '}';
    }
}
