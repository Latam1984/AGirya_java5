package modul_7.Homework.Homework_5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aleksey on 16.12.2016.
 * API apis[] = new API[3];
 * which contains all impelentations of API interface.
 * Also, controller contains two methods
 * Room[] requstRooms(int price, int persons, String city, String hotel)
 * which finds all the rooms with requested params. Method use all apis available to make search.
 * Found rooms create to DB
 * Room[] check(API api1, API api2)
 * Chech how many the same rooms two different apis return
 */
public class Controller {
    List<API> apis = new ArrayList<>();

    public Controller() {
        apis.add(new BookingComApi());
        apis.add(new TripAdvisorApi());
        apis.add(new GoogleApi());
    }


    public List<API> requestRooms(int price, int persons, String city, String hotel) {
        List<API> resultRequestRooms = new ArrayList<>();
        for (API api : apis) {
            api.findRooms(price, persons, city, hotel);
            resultRequestRooms.add(api);
        }
        return resultRequestRooms;
    }

}
