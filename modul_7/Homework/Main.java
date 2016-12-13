package modul_7.Homework;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aleksey on 12.12.2016.
 * <p>
 * В Main создайте 10 заказов с 10 пользователями и добавьте его в List.
 * <p>
 * отсортируйте список за ценой заказа по убыванию
 * отсортируйте список за ценой заказа по возрастанию и за городом пользователя
 * отсортируйте список за наименованием и идентификатором заказа, и городом пользователя
 * <p>
 * Дополнительно (выполняется по желанию):
 * удалите дублированные данные со списка
 * удалите объекты, где цена меньше 1500
 * разделите список на 2 списка - заказы в долларах и в гривнах
 * разделите список на столько списков, сколько уникальных городов в User
 */
public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        List<User> users = new ArrayList<>();

        users.add(new User(1, "Alex", "Girya", "Kiev", 5000));
        users.add(new User(2, "Petya", "Petrov", "Kiev", 1000));
        users.add(new User(3, "Irina", "Sutormina", "Odessa", 1000));
        users.add(new User(4, "Viktor", "Viktorov", "Dnipro", 3000));
        users.add(new User(5, "Stepan", "Sidorov", "Moscow", 2500));
        users.add(new User(6, "Andrea", "Fontalin", "Kiev", 3500));
        users.add(new User(7, "Anton", "Antonov", "Kiev", 2700));
        users.add(new User(8, "Olga", "Leonova", "Dnipro", 3300));
        users.add(new User(9, "Anna", "Antipova", "Kiev", 2400));
        users.add(new User(10, "Helen", "Matveeva", "Kiev", 3700));

        orders.add(new Order(1, 150, Currency.USD, "coffee maker", "Allo", users.get(0)));
        orders.add(new Order(2, 200, Currency.USD, "coffee machine", "Deshevshe.net", users.get(1)));
        orders.add(new Order(3, 350, Currency.EUR, "fridge LG 350", "Eldorado", users.get(2)));
        orders.add(new Order(4, 300, Currency.USD, "fridge Samsung T200", "Rozetka", users.get(3)));
        orders.add(new Order(5, 450, Currency.USD, "television set LG", "Allo", users.get(4)));
        orders.add(new Order(6, 450, Currency.EUR, "TV Samsung", "Eldorado", users.get(5)));
        orders.add(new Order(7, 500, Currency.USD, "TV LG", "Rozetka", users.get(6)));
        orders.add(new Order(8, 1000, Currency.USD, "iPhone7", "Citrus", users.get(7)));
        orders.add(new Order(1, 150, Currency.USD, "coffee maker", "Allo", users.get(0)));
        orders.add(new Order(4, 300, Currency.USD, "fridge Samsung T200", "Rozetka", users.get(3)));

        orders.sort(new PriseComparator());
        //  orders.sort(new PriseAndCityComparator());
        //  orders.sort(new NamePriceAndCityComparator());

        System.out.println(orders.toString());
        System.out.println(orders.get(0));
    }

}
