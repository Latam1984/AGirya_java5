package modul_6.Homework_6;

/**
 * Created by Aleksey on 02.12.2016.
 * Создайте класс UserUtils с последующими методами:
 User[] uniqueUsers(User[] users)
 //users совпадают, когда все их поля совпадают
 User[] usersWithContitionalBalance(User[] users, int balance)
 //user’s balance == balance
 User[] paySalaryToUsers(User[] users)
 long[] getUsersId(User[] users)
 User[] deleteEmptyUsers(User[] users)
 Удостоверьтесь, что методы paySalaryToUsers и getUsersId не могут быть перегружены в других классах.
 */
public class UserUtils {

     public static User[] uniqueUsers(User[] users){
//        for (int i = 0; i < users.length; i++) {
//            for (int j = 1; j <users.length ; j++) {
//                if (users[i].equals(users[j]))
//                  users[i] = null;
//            }
//        }
//        return deleteEmptyUsers(users);

         int counter = 0;
         for (int i = 0; i <users.length ; i++) {
             for (int j = 1; j <users.length ; j++) {
                 if(users[i].equals(users[j]))
                     counter++;
             }
         }
             User [] uniqUsers = new User[users.length - counter];
            int temp = 0;
             for (int j = 1; j <users.length ; j++) {
                 for (int k = 0; k <users.length ; k++) {
                     if (users[j].equals(users))
                         continue;
                     else uniqUsers[temp] = users[j];
                     temp++;
                 }
             }
         return uniqUsers;
    }



    public User[] usersWithContitionalBalance(User[] users, int balance){


        return null;
    }

    public static User[] paySalaryToUsers(User[] users){


        return null;
    }

    public static   long[] getUsersId(User[] users){


        return null;
    }

    static User[] deleteEmptyUsers(User[] users){
        int deletedUser = 0;

        for (int i = 0; i < users.length; i++) {
            if (users == null){
                deletedUser++;
            }
        }

            User uniqueUsers [] = new User[users.length - deletedUser];

            for (int j = 0; j < users.length; j++) {
            if (users != null){
                users = uniqueUsers;
            }
            }
        return uniqueUsers;
    }
}
