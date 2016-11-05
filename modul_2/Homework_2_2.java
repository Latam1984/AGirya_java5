package modul_2;

import java.util.Scanner;

/**
 * Created by Aleksey on 03.11.2016.
 *
 *Continue with BANK example
 2.1 Write method which withdraws money from account and takes commision 5% of the transaction. Print OK + commision + balance after withdrawal. Print NO is withdrawal is not possible.

 Example

 Input

 balance = 100
 withdrawal = 10

 Output
 OK 0.5 89.5

 Input

 balance = 100
 withdrawal = 99

 Output
 NO
 *
 *
 *
 */
public class Homework_2_2 {
    public static void main(String[] args) {
        double balance1 = 100, balance2 = 100, withdrawal = 10, withdrawal2 = 99, comis = 0.05;
        balance(balance1, balance2, withdrawal, withdrawal2, comis);
    }

    static void balance  (double balance1, double balance2, double withdrawal, double withdrawal2, double comis){
        System.out.println("Input: \n\n" + "balance = " + (int)balance1 + ";\n" + "withdrawal = " + (int)withdrawal + "; \n");
        if ((balance1 - withdrawal - (withdrawal * comis))>0) {
            double balance = balance1 - withdrawal - (withdrawal * comis);
        System.out.println("Output: \n" + "Ok " + comis + " " + balance + "\n");
        }
        else {
            System.out.println("Input: \n\n" + "balance = " + balance1 + ";\n" + "withdrawal = " + withdrawal + "; \n");
            System.out.println("Output: \nNO");
        };
        if ((balance2 - withdrawal2 - (withdrawal2 * comis))>0) {
            System.out.println("Input: \n\n" + "balance = " + (int)balance2 + ";\n" + "withdrawal = " + (int)withdrawal2 + "; \n");
         double   balance3 = balance2 - withdrawal2 - (withdrawal2 * comis);
        }
        else {
            System.out.println("Input: \n\n" + "balance = " + (int)balance2 + ";\n" + "withdrawal = " + (int)withdrawal2 + "; \n");
            System.out.println("Output: \nNO");}
    }
}
