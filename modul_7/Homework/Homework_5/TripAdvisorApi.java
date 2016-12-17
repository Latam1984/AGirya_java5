package modul_7.Homework.Homework_5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Aleksey on 16.12.2016.
 */
public class TripAdvisorApi implements API {
    List<Room> tripAdvisorRooms = new ArrayList<>();

    public TripAdvisorApi() {
        tripAdvisorRooms.add(new Room(1, 50, 1, new Date(), "Ukraine", "Kiev"));
        tripAdvisorRooms.add(new Room(1, 60, 2, new Date(), "Dnipro", "Kiev"));
        tripAdvisorRooms.add(new Room(1, 80, 1, new Date(), "Hreshatik", "Kiev"));
        tripAdvisorRooms.add(new Room(1, 160, 2, new Date(), "Respect", "Kiev"));
        tripAdvisorRooms.add(new Room(1, 340, 2, new Date(), "King", "Kiev"));
    }

    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        List<Room> findRooms = new ArrayList<>();
        for (Room room : getRoom()) {
            if (room.getPrice() == price && room.getPersons() == persons && room.getCityName() == city && room.getHotelName() == hotel) {
                findRooms.add(room);
            }
        }
        return findRooms;
    }

    @Override
    public String toString() {
        return "TripAdvisorApi{" +
                "tripAdvisorRooms=" + tripAdvisorRooms +
                '}';
    }

    @Override
    public List<Room> getRoom() {
        return tripAdvisorRooms;


    }
}
