package modul_5;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Aleksey on 25.11.2016.
 */
public class TripAdvisorAPI implements API {
    Room[] rooms;

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }

    public TripAdvisorAPI() {
        rooms = new Room[5];
        rooms[0] = new Room(10, 100, 2, new Date(), "Krakiv", "Kiev");
        rooms[1] = new Room(1, 60, 2, new Date(), "Dniro", "Kiev");
        rooms[2] = new Room(1, 80, 1, new Date(), "Hreshatik", "Kiev");
        rooms[3] = new Room(1, 160, 2, new Date(), "Respect", "Kiev");
        rooms[4] = new Room(12, 250, 3, new Date(), "Krakiv", "Kiev");
    }

    @Override
    public Room[] getRooms() {
        return new Room[0];
    }


}
