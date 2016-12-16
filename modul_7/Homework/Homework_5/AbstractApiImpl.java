package modul_7.Homework.Homework_5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aleksey on 16.12.2016.
 */
public abstract class AbstractApiImpl implements API {
    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        List <Room> findRooms = new ArrayList<>();
        for (Room room : getRoom()){
            if (room.getPrice() == price && room.getPersons() == persons && room.getCityName() == city && room.getHotelName() == hotel) {
                findRooms.add(room);
            }
        }
        return findRooms;
    }


}
