package modul_3.Homework_3_2;

/**
 * Created by Aleksey on 11.11.2016.
 *
 * Напишите класс с названием Arithmetic с методом add, который принимает целые числа как параметры и возвращает переменную
 * типа integer, которая есть их суммой.

 Напишите класс Adder, который наследуется от класса Arithmetic.
 У класса Adder должен быть метод check, который сравнивает 2 номера и возвращает true, если а>=b и false в других случаях.

 Сигнатура методов:
 int add(Integer a, Integer b)
 boolean check(Integer a, Integer b)
 */
public class Homework_3_2 {
    public static void main(String[] args) {
        Arithmetic arr = new Arithmetic();
        Adder add = new Adder();
        System.out.println(arr.add(10, 15));
        System.out.println(add.check(113, 15));
    }
}
