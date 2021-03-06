package JavaCore.modul_4.Homework_4;


/**
 * Created by Aleksey on 17.11.2016.
 *
 * Создайте следующую структуру:
 1. Абстрактный класс Bank и 3 класса, которые его расширяют: USBank, EUBank, ChinaBank.

 Абстрактный класс Bank должен содержать поля:
 long id
 String bankCountry
 Currency currency
 int numberOfEmployees
 double avrSalaryOfEmployee
 long rating
 long totalCapital

 Создайте get-,set-методы и конструктор с аргументами - всеми полями.
 Методы:
 abstract int getLimitOfWithdrawal()
 abstract int getLimitOfFunding()
 abstract int getMonthlyRate()
 abstract int getCommission(int summ)
 double moneyPaidMonthlyForSalary()
 */
public abstract class Bank {
    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployees;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    public abstract int getLimitOfWithdrawal();
    public abstract int getLimitOfFunding();
    public abstract int getMonthlyRate();
    public abstract int getCommission(int sum);
    public double moneyPaidMonthlyForSalary() {
        return 0;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", bankCountry='" + bankCountry + '\'' +
                ", currency=" + currency +
                ", numberOfEmployees=" + numberOfEmployees +
                ", avrSalaryOfEmployee=" + avrSalaryOfEmployee +
                ", rating=" + rating +
                ", totalCapital=" + totalCapital +
                '}';
    }

    public Bank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bank)) return false;

        Bank bank = (Bank) o;

        if (getId() != bank.getId()) return false;
        if (getNumberOfEmployees() != bank.getNumberOfEmployees()) return false;
        if (Double.compare(bank.getAvrSalaryOfEmployee(), getAvrSalaryOfEmployee()) != 0) return false;
        if (getRating() != bank.getRating()) return false;
        if (getTotalCapital() != bank.getTotalCapital()) return false;
        if (!getBankCountry().equals(bank.getBankCountry())) return false;
        return getCurrency() == bank.getCurrency();

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getBankCountry().hashCode();
        result = 31 * result + getCurrency().hashCode();
        result = 31 * result + getNumberOfEmployees();
        temp = Double.doubleToLongBits(getAvrSalaryOfEmployee());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (getRating() ^ (getRating() >>> 32));
        result = 31 * result + (int) (getTotalCapital() ^ (getTotalCapital() >>> 32));
        return result;
    }
}

