package JavaCore.modul_4.Homework_4;

/**
 * Created by Aleksey on 20.11.2016.
 *
 * Создайте следующую структуру:
 Интерфейс BankSystem и его реализацию BankSystemImpl.
 Создать интерфейс BankSystem с методами:
 void withdrawOfUser(Room user, int amount)
 void fundUser(Room user, int amount)
 void transferMoney(Room fromUser, Room toUser, int amount)
 void paySalary(Room user)
 и его релизацию.
 */
public interface BankSystem {
    void withdrawOfUser (User user, int amount);

    void fundUser (User user, int amount);

    void transferMoney (User fromUser, User toUser, int amount);

    void paySalary (User user);

}
