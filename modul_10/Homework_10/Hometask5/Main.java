package modul_10.Homework_10.Hometask5;

/**
 * Created by Aleksey on 17.01.2017.
 * Создайте три новых типа исключений. Напишите класс с методом, который будет кидать все три из них.
 * В main() вызовите этот метод, но используйте только один catch-блок который будет ловить все три типа исключений.
 */
public class Main {
    public static void main(String[] args) {
        int someNumber = 6;
        try {
            someNumberCatch(someNumber);
        } catch (MyException1 | MyException2 | MyException3 someException) {
            System.out.println("What we catch? ");
            System.out.println(someException);
        }


//
//        } catch (MyException1 myException1) {
//            myException1.printStackTrace();
//            System.out.println("Exception number 1 catch");
//
//        } catch (MyException2 myException2) {
//            myException2.printStackTrace();
//            System.out.println("Exception number 2 catch");
//
//        } catch (MyException3 myException3) {
//            myException3.printStackTrace();
//            System.out.println("Exception number 3 catch");
//        }
    }

    private static void someNumberCatch(int someNumber) throws MyException1, MyException2, MyException3 {
        if (someNumber == 10) throw new MyException1();
        if (someNumber == 5) throw new MyException2();
        if (someNumber == 6) throw new MyException3();
    }
}
