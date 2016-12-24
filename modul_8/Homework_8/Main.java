package modul_8.Homework_8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * ЗАДАНИЕ 1
 Create universal interface AbstractDAO (T) with following methods
 List ---- out DB emulator
 T save(T)
 void delete(T)
 void deleteAll(List T)
 void saveAll(List T)
 List T getList()
 Дополнительно (выполнение по желанию):
 void daleteById(long id)
 T get(long id)

 ЗАДАНИЕ 2
 Create universal interface AbstractDAO (T) with following methods
 List ---- out DB emulator
 void deleteById(long id)
 T get(long id)

 ЗАДАНИЕ 3
 Make implementation AbstractDAOImpl

 ЗАДАНИЕ 4
 Create UserDAO that exdents AbstractDAOImpl and has the same methods
 User class:
 long id
 String name

 Еxample:
 UserDAO extends .. {
 User save(User user) {
 save(user);
 return user;
 }

 * Created by Aleksey on 24.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        UserDAO user = new UserDAO(1, "Aleks");
        UserDAO user1 = new UserDAO(2, "Andrey");
        UserDAO user2 = new UserDAO(3, "Vadim");
        UserDAO user3 = new UserDAO(4, "Evgeniy");
        user.save(user);
        user.save(user1);
        user.save(user2);
        user.save(user3);
        System.out.println(user.list);


        user.delete(user2);
        System.out.println(user.list);

        user.daleteById(4);
        System.out.println(user.list);
    }
}
