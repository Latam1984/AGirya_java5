package JavaCore.modul_9.Homework;

import java.util.*;
import java.util.stream.Collectors;

import static JavaCore.modul_9.Homework.Currency.EUR;
import static JavaCore.modul_9.Homework.Currency.USD;

/**
 * Created by Aleksey on 12.12.2016.
 * <p>
 * Используйте структуры с HW модуля 7 (User и Order) и выполните задания, используя Java 8 instruments
 * <p>
 * -отсортируйте список за ценой заказа по убыванию
 * -отсортируйте список за ценой заказа по возрастанию и за городом пользователя
 * -отсортируйте список за наименованием товара, идентификатором заказа, и городом пользователя
 * <p>
 * -удалите дублированные данные со списка
 * -удалите объекты, где цена меньше 1500
 * -разделите список на 2 списка - заказы в долларах и в гривнах
 * -разделите список на столько списков, сколько уникальных городов в User
 * <p>
 * -проверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov”
 * -удалите заказы в USD
 * <p>
 * Ограничения:
 * -нельзя использовать итератор
 * -нельзя использовать циклы
 * <p>
 * Определите каждую подзадачу в отдельный метод.
 * Создайте класс JavaCore.modul_10.Homework_10.Main и протестируйте каждый метод на тестовых данных.
 */
public class Main {
    public static void main(String[] args) {
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

        orders1.add(new Order(1, 1500, USD, "coffee maker", "Allo", users.get(0)));
        orders1.add(new Order(2, 2000, USD, "coffee machine", "Deshevshe.net", users.get(1)));
        orders1.add(new Order(3, 3500, EUR, "fridge LG 350", "Eldorado", users.get(2)));
        orders1.add(new Order(4, 300, USD, "fridge Samsung T200", "Rozetka", users.get(3)));
        orders1.add(new Order(5, 450, USD, "television set LG", "Allo", users.get(4)));
        orders1.add(new Order(6, 450, EUR, "TV Samsung", "Eldorado", users.get(5)));
        orders1.add(new Order(7, 500, USD, "TV LG", "Rozetka", users.get(6)));
        orders1.add(new Order(8, 1000, USD, "iPhone7", "Citrus", users.get(7)));
        orders1.add(new Order(1, 1500, USD, "coffee maker", "Allo", users.get(0)));
        orders1.add(new Order(4, 300, USD, "fridge Samsung T200", "Rozetka", users.get(3)));


//        Predicate<Order> sumPredicate = o -> o.getPrice() < 1500;
//        orders1.stream()
//                .filter(sumPredicate)
//                .collect(Collectors.toList());

        //sortedByLowPrice(orders1);
        //sortedByPriceAndCity(orders1);
        //sortedByItemNumberCity(orders1);
        // deleteDuplicateOrders(orders1);
        // deleteByLessPrice(orders1);
        //twoCurrencyLists(orders1);
        //createListByCity(orders1);
        //checkName(orders1, "Petrov");
        //deleteUsd(orders1);

    }

    //==============================sorted by low price======================
    private static void sortedByLowPrice(List<Order> orders) {
        orders.stream().sorted((o1, o2) -> o1.getPrice() - o2.getPrice()).collect(Collectors.toList());
        System.out.println(orders);
    }

    //=============================sorted by price and city================================
    private static void sortedByPriceAndCity(List<Order> orders) {
        orders.stream().sorted(
                (o1, o2) -> o1.getPrice() != o2.getPrice() ? o1.getPrice() - (o2.getPrice()) :
                        o1.getUser().getCity().compareTo(o2.getUser().getCity()));

//orders.sort(Comparator.comparing(order -> order.getPrice() && order.getUser().getCity()));
        System.out.println(orders);
    }

//     private static void sortedByLowPrice (List<Order> orders) {
//        orders.sort(Comparator.comparing(order -> order.getPrice()));
//        System.out.println(orders);
//}

    //============sorted by item name, indentificational number of order and city=============

    private static void sortedByItemNumberCity(List<Order> orders) {
        orders.stream().sorted(
                (o1, o2) -> {
                    if (o1.getItemName().compareTo(o2.getItemName()) == 0 && o2.getShopIdentificator().compareTo(o2.getShopIdentificator()) == 0) {
                        return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                    }
                    if (o1.getItemName().compareTo(o2.getItemName()) == 0) {
                        return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                    } else return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }
                );
    }


    //========================delete duplicates===========================
    private static void deleteDuplicateOrders(List<Order> orders) {
        orders.stream().distinct().collect(Collectors.toList());
    }

    //========================delete by price <=1500======================
    private static void deleteByLessPrice(List<Order> orders) {
        orders.removeIf((Order o) -> o.getPrice() <= 1500);
        System.out.println(orders);
    }

    //========================create two currency lists===================
    private static void twoCurrencyLists(List<Order> orders) {
        List<Order> list1 = orders.stream().filter(order -> order.getCurrency().equals(USD)).collect(Collectors.toList());
        List<Order> list2 = orders.stream().filter(order -> order.getCurrency() == EUR).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(list2);
    }

    //========================create lists by city=========================
    private static void createListByCity(List<Order> orders) {
        orders.stream().collect(Collectors.groupingBy(order -> order.getUser().getCity()));
    }

    //========================find Petrov=================================Exception
    private static void checkName(List<Order> orders, String name) {
        //   orders.stream().filter("Petrov"::equals).findFirst().get(); как работать с Optional?
        List<Order> petrovWasFind = orders.stream().filter((order -> order.getUser().getLastName().equals(name))).collect(Collectors.toList());
        //List<Order> petrovWasFind = orders.stream().filter((o) -> o.contains("Petrov")).collect(Collectors.toList());
        //  List<String> select = orders.stream().filter((s) -> s.contains("1")).collect(Collectors.toList());
        orders.contains(petrovWasFind + "Petrov was find!");
    }

    //========================delete usd==================================
    private static void deleteUsd(List<Order> orders) {
        orders.removeIf(order -> order.getCurrency() == USD);
        System.out.println(orders);
    }
}

