package modul_10.Homework_10.Hometask2;

/**
 * Created by Aleksey on 16.01.2017.
 */
public class Main {
    public static void main(String[] args) {
    int a = 8, b = 2;
    int result = a/b;

    try {
        checkException(result);
    } catch (MyException someException){
        System.out.println(someException);
    }
    finally {
        System.out.println("Exception works? ");}

}
    private static  void checkException (int result) throws MyException{

        if (result > 0) throw new MyException("We expected number < 0; But number = " + result);
    }
}
