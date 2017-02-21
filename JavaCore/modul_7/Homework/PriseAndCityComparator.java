package JavaCore.modul_7.Homework;

import java.util.Comparator;

/**
 * Created by Aleksey on 13.12.2016.
 */
public class PriseAndCityComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        if (o1.getPrice() == o2.getPrice()){
        return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        }
        return o1.getPrice() - o2.getPrice();
    }
}
