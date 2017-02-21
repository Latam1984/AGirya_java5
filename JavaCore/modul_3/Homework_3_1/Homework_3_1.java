package JavaCore.modul_3.Homework_3_1;

/**
 * Created by Aleksey on 10.11.2016.
 * Домашнее задание №3.1
 * Grade: N/A
 * View Grade Information. Opens a dialogue
 * Добавить метод sing к классу Bird, потом измените основной метод соответственно, чтобы код вывел следующий текст:
 * I am walking
 * I am flying
 * I am singing
 * I am Bird
 *
 * Программа выдает правильный результат, но реализация неправильная. Метод sing() должен выдавать "I am "
 * + action, где action - private переменная типа String.
 * Также должен быть публичный метод setAction который бы изменял значение переменной action.
 *
 * ...или передавать action как параметр sing()
 */
public class Homework_3_1 {
    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.sing(" walking");
        bird.sing(" flying");
        bird.sing(" singing");
        bird.sing(" Bird");
    }

}
