package modul_7.Homework.Homework_5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Aleksey on 16.12.2016.
 */
public class GoogleApi extends AbstractApiImpl {
    List<Room> googleComRooms;

    public GoogleApi() {
        List<Room> rooms = new ArrayList<>();
        googleComRooms.add(new Room(1, 50, 1, new Date(), "Ukraine", "Kiev"));
        googleComRooms.add(new Room(1, 60, 2, new Date(), "Dnipro", "Kiev"));
        googleComRooms.add(new Room(1, 80, 1, new Date(), "Hreshatik", "Kiev"));
        googleComRooms.add(new Room(1, 160, 2, new Date(), "Respect", "Kiev"));
        googleComRooms.add(new Room(1, 340, 2, new Date(), "King", "Kiev"));
    }

//    @Override
//    public List<Room> findRooms(int price, int persons, String city, String hotel) {
//        return null;
//    }

    @Override
    public List<Room> getRoom() {
        return googleComRooms;
    }
}
