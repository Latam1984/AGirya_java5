package JavaCore.modul_4.Homework_4;

/**
 * Created by Aleksey on 21.11.2016.
 */
public class BankSystemImpl implements BankSystem  {

    @Override
    public void withdrawOfUser(User user, int amount) {
        double comision = user.getBank().getCommission(amount)*0.01;
        double limit = user.getBank().getLimitOfWithdrawal();
        if (amount >= limit) System.out.println("limit is exceeded");
        else System.out.println( "withdraw: " + "amount: " + amount + "; " + "balance: " + (user.getBalance() - (amount+(amount*comision))) + ";");
    }

    @Override
    public void fundUser(User user, int amount) {
        double limitOfFunding = user.getBank().getLimitOfFunding();
        if (amount <= limitOfFunding) user.setBalance(user.getBalance()+ amount);
        else System.out.println("limit is exceeded");
        System.out.println("fund: " + "amount: " + amount + "; " + "balance: " + user.getBalance());
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double balance1 = fromUser.getBalance() - amount;
        double balance2 = toUser.getBalance() + amount;
        System.out.println("transfer: " + "amount: " + amount + "; " + "balance: " + balance2 + ";");
    }

    @Override
    public void paySalary(User user) {
        double salary = user.getSalary();
        double balance = user.getBalance() + user.getSalary();
        System.out.println("paySalary:" + "salary: " + salary + ";"+ " balance: " + balance + ";");
    }
}
