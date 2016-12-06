package modul_6.Homework_6;

/**
 * Created by Aleksey on 02.12.2016.
 * Создайте класс UserUtils с последующими методами:
 * User[] uniqueUsers(User[] users)
 * //users совпадают, когда все их поля совпадают
 * User[] usersWithContitionalBalance(User[] users, int balance)
 * //user’s balance == balance
 * User[] paySalaryToUsers(User[] users)
 * long[] getUsersId(User[] users)
 * User[] deleteEmptyUsers(User[] users)
 * Удостоверьтесь, что методы paySalaryToUsers и getUsersId не могут быть перегружены в других классах.
 */
public class UserUtils {

    public static User[] uniqueUsers(User[] users) {
        User[] users2 = users;
        User[] uniqUsers = new User[users.length];
        int count = 0;

        for (int i = 1; i < users.length; i++) {
            for (int j = 0; j < users2.length-1; j++)
                if (users[i].equals(users2[j])) {
                    uniqUsers[j] = null;
                } else {
                    uniqUsers[count] = users2[j];
                    count++;
                }
        }
        return deleteEmptyUsers(uniqUsers);
    }


    public User[] usersWithConditionalBalance(User[] users, int balance) {
        int counter = 0;
        for (User user : users) {
            if (user.getBalance() == balance)
                counter++;
        }

        User[] eqBalance = new User[counter];
        int temp = 0;
        for (User eqBalanceUser : users) {
            if (eqBalanceUser.getBalance() == balance) {
                eqBalance[temp] = eqBalanceUser;
                temp++;
            }
        }
        return eqBalance;
    }


    final static User[] paySalaryToUsers(User[] users) {
        for (User user : users)
            user.setBalance(user.getBalance() + user.getSalary());
        return users;
    }

    public static long[] getUsersId(User[] users) {
        long userId[] = new long[users.length];
        int counter = 0;
        for (User user : users)
            userId[counter] = user.getId();
        counter++;
        return userId;
    }

    final static User[] deleteEmptyUsers(User[] users) {
        int deletedUser = 0;

        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                deletedUser++;
            }
        }

        User uniqueUsers[] = new User[users.length - deletedUser];

        for (int j = 0; j < users.length; j++) {
            if (users[j] != null) {
                users = uniqueUsers;
            }
        }
        return uniqueUsers;
    }
}
