package modul_7.Homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Aleksey on 15.12.2016.
 */



public class PartitionAndDeleteLogic {

    public static Set <Order> uniqueOrders (List<Order> orders){
        Set <Order> uniqueOrders = new HashSet();
       uniqueOrders.addAll(orders);
        return uniqueOrders;
    }

    public static List <Order> deletePrice(List <Order> orders){
        List <Order> availablePrise = new ArrayList<>();
        for (Order order: orders) {
            if (order.getPrice()>=1500){
                availablePrise.add(order);
        }
        }
        return availablePrise;
    }

    public static void currencyList (List <Order> orders){
        List <Order> ordersUSD = new ArrayList<>();
        List<Order> ordersEUR = new ArrayList<>();
        for (Order order: orders){
            if (order.getCurrency() == Currency.USD)ordersUSD.add(order);
            if (order.getCurrency() == Currency.EUR) ordersEUR.add(order);
        }
    }

    public static void cityOrders (List <Order> orders){
        List<List<Order>> uniqueCityArrayList = new ArrayList<>();
        Set<String> uniqueCity = new HashSet<>();
        for (Order order:orders){
            String city = order.getUser().getCity();
            if (uniqueCity.add(city)) {
                List<Order> tempList = new ArrayList<>();
                tempList.add(order);
                uniqueCityArrayList.add(tempList);
            }
            else {
                int count = 0;
                for (List <Order> order1: uniqueCityArrayList )
                {
                    if (order1.get(count).getUser().getCity().equals(city)) {uniqueCityArrayList.get(count).add(order);
                    }
                    else count++;
                }
            }
        }
    }
}

