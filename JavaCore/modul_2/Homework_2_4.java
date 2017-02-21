package JavaCore.modul_2;

/**
 * Created by Aleksey on 05.11.2016.
 */
public class Homework_2_4 {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String name = "Jack";
        int withdrawal = 1000;
        balance(balances, ownerNames, name, withdrawal);
    }

    public static void balance(int[] balances, String[] ownerNames, String name, int withdrawal) {

        for (int i = 0; i < ownerNames.length; i++) {
            if (name.equals(ownerNames[i])) {
                int b = balances[i];
                int result = b + withdrawal;
                System.out.println("Owner name: " + name + "\nWithdrawal = " + withdrawal + "\nBalance " + result);
            }
        }
    }
}

