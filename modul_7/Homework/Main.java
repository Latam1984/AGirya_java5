package modul_7.Homework;

import java.util.*;

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
 * разделите список на столько списков, сколько уникальных городов в Room
 */
public class Main {
    public static void main(String[] args) {
        Set<Order> orders = new TreeSet<>(new PriseComparator());
        List<User> users = new ArrayList<>();
        List<Order> orders1 = new ArrayList<>();

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

        orders.add(new Order(1, 1500, Currency.USD, "coffee maker", "Allo", users.get(0)));
        orders.add(new Order(2, 2000, Currency.USD, "coffee machine", "Deshevshe.net", users.get(1)));
        orders.add(new Order(3, 3500, Currency.EUR, "fridge LG 350", "Eldorado", users.get(2)));
        orders.add(new Order(4, 300, Currency.USD, "fridge Samsung T200", "Rozetka", users.get(3)));
        orders.add(new Order(5, 450, Currency.USD, "television set LG", "Allo", users.get(4)));
        orders.add(new Order(6, 450, Currency.EUR, "TV Samsung", "Eldorado", users.get(5)));
        orders.add(new Order(7, 500, Currency.USD, "TV LG", "Rozetka", users.get(6)));
        orders.add(new Order(8, 1000, Currency.USD, "iPhone7", "Citrus", users.get(7)));
        orders.add(new Order(1, 1500, Currency.USD, "coffee maker", "Allo", users.get(0)));
        orders.add(new Order(4, 300, Currency.USD, "fridge Samsung T200", "Rozetka", users.get(3)));

        orders1.add(new Order(1, 1500, Currency.USD, "coffee maker", "Allo", users.get(0)));
        orders1.add(new Order(2, 2000, Currency.USD, "coffee machine", "Deshevshe.net", users.get(1)));
        orders1.add(new Order(3, 3500, Currency.EUR, "fridge LG 350", "Eldorado", users.get(2)));
        orders1.add(new Order(4, 300, Currency.USD, "fridge Samsung T200", "Rozetka", users.get(3)));
        orders1.add(new Order(5, 450, Currency.USD, "television set LG", "Allo", users.get(4)));
        orders1.add(new Order(6, 450, Currency.EUR, "TV Samsung", "Eldorado", users.get(5)));
        orders1.add(new Order(7, 500, Currency.USD, "TV LG", "Rozetka", users.get(6)));
        orders1.add(new Order(8, 1000, Currency.USD, "iPhone7", "Citrus", users.get(7)));
        orders1.add(new Order(1, 1500, Currency.USD, "coffee maker", "Allo", users.get(0)));
        orders1.add(new Order(4, 300, Currency.USD, "fridge Samsung T200", "Rozetka", users.get(3)));

        orders1.sort(new PriseComparator());
        System.out.println(orders1);
        orders1.sort(new PriseAndCityComparator());
        System.out.println(orders1);
        orders1.sort(new NamePriceAndCityComparator());
        System.out.println(orders1);



        Iterator<Order> iterator = orders.iterator();
        System.out.println(iterator.next());
        checkPetrov(orders);
        deleteUSD(orders1);
        System.out.println(orders1);

    }

    private static void deleteUSD(List<Order> orders) {
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCurrency().equals(Currency.USD))
                iterator.remove();
        }
    }

    private static void checkPetrov(Set<Order> orders1) {
        for (Order order : orders1)
            if (order.getUser().getLastName().equals("Petrov")) {
                System.out.println("Petov was found");
            }
    }
}
