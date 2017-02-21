package JavaCore.modul_6.Homework_6;

import java.util.Arrays;

/**
 * Created by Aleksey on 02.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        User [] users = new User[5];

        users[0] = new User(1212, "Aleks", "Girya", 2500, 7500);
        users[1] = new User(1212, "Aleks", "Girya", 2500, 7500);
        users[2] = new User(1112, "Anton", "Antonov", 1000, 5000);
        users[3] = new User(1114, "Artur", "Antonov", 1000, 5000);

        UserUtils userUtils = new UserUtils();


        System.out.println(Arrays.toString(UserUtils.uniqueUsers(users)));


    }

}
