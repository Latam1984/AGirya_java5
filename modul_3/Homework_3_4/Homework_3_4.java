package modul_3.Homework_3_4;

/**
 * Created by Aleksey on 12.11.2016.
 * <p>
 * Создайте класс User со следующими полями:
 * String name,
 * int balance,
 * int monthsOfEmployment,
 * String companyName,
 * int salary,
 * String currency.
 * <p>
 * Создайте get-, set-методы и конструктор с аргументами - всеми полями класса.
 * Напишите методы:
 * void paySalary() - добавляет заработную плату к балансу пользователя
 * withdraw(int summ) - снимает деньги с баланса с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях
 * companyNameLenght - вычисляет длину имя компании
 * monthIncreaser(int addMonth) - увеличивает monthsOfEmployment на addMonth
 */
public class Homework_3_4 {
    public static void main(String[] args) {
        User user1 = new User("Alex", 5000, 6, "Luxoft", 2000, "usd");
        user1.paySalary(2000, 5000);
        System.out.println(user1.withdraw(1000));
        user1.monthIncreaser(2);
    }

}
