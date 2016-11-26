package modul_5;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Aleksey on 25.11.2016.
 * <p>
 * Создайте 3 реализации API, которые называются:
 * BookingComAPI,
 * TripAdvisorAPI,
 * GoogleAPI.
 * В каждой реализации есть глобальная переменная Room[] rooms, которая должна быть инициализована констуктором
 * по умолчанию пятью разными объектами Room.
 */
public class BookingComAPI implements API {
    Room[] rooms;

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }


    public BookingComAPI() {
        rooms = new Room[5];
        rooms[0] = new Room(1, 50, 1, new Date(), "Ukraine", "Kiev");
        rooms[1] = new Room(1, 60, 2, new Date(), "Dniro", "Kiev");
        rooms[2] = new Room(1, 80, 1, new Date(), "Hreshatik", "Kiev");
        rooms[3] = new Room(1, 160, 2, new Date(), "Respect", "Kiev");
        rooms[4] = new Room(1, 340, 2, new Date(), "King", "Kiev");
    }

    @Override
    public Room[] getRooms() {
        return new Room[0];
    }


}

