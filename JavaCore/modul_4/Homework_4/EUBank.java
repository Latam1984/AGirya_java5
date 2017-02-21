package JavaCore.modul_4.Homework_4;



/**
 * Created by Aleksey on 19.11.2016.
 *
 *  EUBank: лимит снятия = 2000, если валюта - USD и 2200, если EUR
 лимит пополнения - 20000, если EUR и 10000, если USD
 месячная ставка - 0% на USD и 1% на EUR
 комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
 2%, если EUR и до 1000 и 4%, если EUR и больше 1000
 */
public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (this.getCurrency().equals(Currency.USD)) return 2000;
        else return 2200;
    }

    @Override
    public int getLimitOfFunding() {
        if (this.getCurrency().equals(Currency.USD)) return 10000;
        else return 20000;
    }

    @Override
    public int getMonthlyRate() {
        if (this.getCurrency().equals(Currency.USD)) return 0;
        else return 1;
    }


    public int getCommission(int sum) {
        if (this.getCurrency().equals(Currency.USD)) {if (sum < 1000) return 5;
            else return 7;}
        else {if (sum < 1000) return  2;
        else return 4;
        }
    }
}
