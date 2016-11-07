package modul_2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Aleksey on 04.11.2016.
 */
public class Homework_2_3 {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        balance(balances, ownerNames);

    }

    public static void balance(int[] balances, String[] ownerNames) {
        double commision = 0.05;
        double b;
        double calculation;

        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter name:");
        String name = in.next();
        System.out.println("Please, enter withdrawal amount:");
        String withdrawal = in.next();

        int result = Integer.parseInt(withdrawal);
        for (int i = 0; i < ownerNames.length; i++) {
            if (name.equals(ownerNames[i])) {
                b = balances[i];
                if ((calculation = b - result - (result * commision)) >= 0) {
                    System.out.println("Owner name: " + ownerNames[i] + ";\n Withdrawal: " + withdrawal + "; " +
                            "\n Balance: " + calculation + ";");
                    break;
                } else {
                    System.out.println("Operation denied!");
                    break;
                }
            }
        }
    }
}


