package modul_8.Homework_8;

import java.util.ArrayList;
import java.util.List;

/**
 * ЗАДАНИЕ 1
 * Create universal interface AbstractDAO (T) with following methods
 * List ---- out DB emulator
 * T save(T)
 * void delete(T)
 * void deleteAll(List T)
 * void saveAll(List T)
 * List T getList()
 * Дополнительно (выполнение по желанию):
 * void daleteById(long id)
 * T get(long id)
 * <p>
 * ЗАДАНИЕ 2
 * Create universal interface AbstractDAO (T) with following methods
 * List ---- out DB emulator
 * void deleteById(long id)
 * T get(long id)
 * <p>
 * ЗАДАНИЕ 3
 * Make implementation AbstractDAOImpl
 * <p>
 * ЗАДАНИЕ 4
 * Create UserDAO that exdents AbstractDAOImpl and has the same methods
 * User class:
 * long id
 * String name
 * <p>
 * Еxample:
 * UserDAO extends .. {
 * User save(User user) {
 * save(user);
 * return user;
 * }
 * <p>
 * Created by Aleksey on 24.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        UserDAO users = new UserDAO();

        users.save(new User(1, "Aleksey Girya"));
        users.save(new User(2, "Andrey Demchuk"));
        users.save(new User(3, "Vadim Timchenko"));
        users.save(new User(4, "Evgeniy Gusar"));

        System.out.println(users);

//deleteById
        users.daleteById(1);
        System.out.println(users);

//getID
        System.out.println(users.get(1));

//getList
        System.out.println(users.getList());

//delete
        users.delete(users.get(1));
        System.out.println(users);
    }
}
