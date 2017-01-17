package modul_10.Homework_10.Hometask4;

/**
 * Created by Aleksey on 17.01.2017.
 * В g() киньте (throw) исключение нового типа, который вы определили. В f() вызовите g(), поймайте его исключение и
 * в блоке catch киньте другое исключение (другого типа, который вы определили). Протестируйте свой код в main().
 */
public class Main {
    public static void main(String[] args) {
       try {
           f();
       } catch (ArithmeticException a){
           System.out.println("Arithmetic exception catch!");
       }
    }

    private static void f() {
        try {
            g();
        } catch (NullPointerException a) {
            System.out.println("Null pointer  exception catch! ");
            throw new ArithmeticException();
        }
    }

    private static void g() {
        throw new NullPointerException();
    }
}
