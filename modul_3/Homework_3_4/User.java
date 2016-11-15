package modul_3.Homework_3_4;

/**
 * Created by Aleksey on 12.11.2016.
 * <p>
 * Создайте класс User со следующими полями:
 * String name,
 * int balance,
 * int monthsOfEmployment,
 * String companyName,
 * int salary,
 * String currency.
 * <p>
 * Создайте get-, set-методы и конструктор с аргументами - всеми полями класса.
 * Напишите методы:
 * void paySalary() - добавляет заработную плату к балансу пользователя
 * withdraw(int summ) - снимает деньги с баланса с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях
 * companyNameLenght - вычисляет длину имя компании
 * monthIncreaser(int addMonth) - увеличивает monthsOfEmployment на addMonth
 */
public class User {
    private String name;
    private int balance;
    private int monthOfEmployment;
    String companyName;
    private int salary;
    private String currency;


    public void paySalary(int salary, int balance) {
        int paySalary = balance + salary;
        System.out.println(paySalary);
    }

    public double withdraw(int sum) {
        double comis1 = 0.05, comis2 = 0.1;
        if (sum < 1000) {return getBalance() - (sum + (sum * comis1));}
        else { return (getBalance() - (sum + (sum * comis2)));}
    }


    public void companyNameLength() {
        System.out.println(companyName.length());
    }

    public void monthIncreaser(int addMonth) {
        this.monthOfEmployment = monthOfEmployment + addMonth;
        System.out.println(monthOfEmployment);
    }

    public User(String name, int balance, int monthOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthOfEmployment = monthOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthOfEmployment() {
        return monthOfEmployment;
    }

    public void setMonthOfEmployment(int monthOfEmployment) {
        monthOfEmployment = monthOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}

