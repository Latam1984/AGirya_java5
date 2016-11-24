package modul_4;



/**
 * Created by Aleksey on 19.11.2016.
 ChinaBank: лимит снятия = 100, если валюта - USD и 150, если EUR
 лимит пополнения - 5000, если EUR и 10000, если USD
 месячная ставка - 1% на USD и 0% на EUR
 комиссия 3%, если USD и до 1000, 5%, если USD и больше 1000
 10%, если EUR и до 1000 и 11%, если EUR и больше 1000
 */
public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (this.getCurrency().equals(Currency.USD)) return 100;
        else return 150;
    }

    @Override
    public int getLimitOfFunding() {
        if (this.getCurrency().equals(Currency.USD)) return 5000;
        else return 10000;
    }

    @Override
    public int getMonthlyRate() {
        if (this.getCurrency().equals(Currency.USD)) return 1;
        else return 0;
     }

     @Override
    public  int  getCommission(int sum) {
        if (this.getCurrency().equals(Currency.USD)) {
            if (sum < 1000) return 3; else return 5;}
        else {if (sum < 1000) return 10; else return  11;}
            }
        }



