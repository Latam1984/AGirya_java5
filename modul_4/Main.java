package modul_4;

/**
 * Created by Aleksey on 20.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        USBank bankUsa = new USBank(245618, "USA", Currency.USD, 16, 1800, 3);
        USBank bankUsa1 = new USBank(245618, "USA", Currency.EUR, 16, 1800, 3);
        EUBank bankEur = new EUBank(145321, "EU", Currency.USD, 15, 1700, 5);
        EUBank bankEur1 = new EUBank(145321, "EU", Currency.EUR, 15, 1700, 5);
        ChinaBank bankChina = new ChinaBank(124563, "Asia", Currency.USD, 12,1400, 7);
        ChinaBank bankChina1 = new ChinaBank(124563, "Asia", Currency.EUR, 12,1400, 7);

        BankSystemImpl bankSystem = new BankSystemImpl();

        User user1 = new User(1212, "Alex", 1000, 6, "Luxoft", 6000, bankUsa);
        User user2 = new User (1213, "Andrey", 50000, 5, "GoIT", 1003500, bankUsa1);
        User user3 = new User (1214, "Anton", 100, 5, "SoftServ", 2700, bankEur);
        User user4 = new User (1215, "Aleksey", 5000, 7, "Luxoft", 8500, bankEur1);
        User user5 = new User (1216, "Irina", 4500, 3, "Ciklum", 4700, bankChina);
        User user6 = new User (1217, "Lena",1500, 6, "Ciklum", 13500, bankChina1);

        bankSystem.paySalary(user1);
        bankSystem.fundUser(user1, 1000);
        bankSystem.transferMoney(user4, user1, 500);
        bankSystem.withdrawOfUser(user1, 400);

    }

}
