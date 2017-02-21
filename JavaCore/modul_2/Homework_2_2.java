package JavaCore.modul_2;

public class Homework_2_2 {
    public static void main(String[] args) {
        double balance = 100, withdrawal = 10, withdrawal2 = 99, comis = 0.05;
        balance(balance, withdrawal, comis);
        balance(balance, withdrawal2, comis);
    }

    static void balance(double balance, double withdrawal, double comis) {
        double result;
        result = balance - withdrawal - (withdrawal * comis);
        System.out.println("Input: \n\n" + "balance = " + (int) balance + ";\n" + "withdrawal = " + (int) withdrawal + "; \n");
        if (result > 0) {System.out.println("Output: \n" + "Ok " + comis + " " + result + "\n");
        } else {System.out.println("Output: \nNO");}
    }
}
