package JavaCore.modul_7.Homework;

import java.util.Comparator;

/**
 * Created by Aleksey on 13.12.2016.
 */
public class PriseComparator implements Comparator <Order> {

    @Override
    public int compare(Order o1, Order o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
