package modul_5.Homework_5.Homework_5_1;

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
        int counter = 0;
        for (Room r : getRooms()) {
            if (r.getPrice() == price && r.getPersons() == persons && r.getCityName() == city && r.getHotelName() == hotel)
                ;
            counter++;

        }


        Room[] room = new Room[counter];

        int temp = 0;
        for (Room r : getRooms()) {
            if (r.getPrice() == price && r.getPersons() == persons && r.getCityName() == city && r.getHotelName() == hotel) {
                room[temp] = r;
            }
        }
        return room;
    }


    public BookingComAPI() {
        rooms = new Room[5];
        rooms[0] = new Room(1, 50, 1, new Date(), "Ukraine", "Kiev");
        rooms[1] = new Room(1, 60, 2, new Date(), "Dnipro", "Kiev");
        rooms[2] = new Room(1, 80, 1, new Date(), "Hreshatik", "Kiev");
        rooms[3] = new Room(1, 160, 2, new Date(), "Respect", "Kiev");
        rooms[4] = new Room(1, 340, 2, new Date(), "King", "Kiev");
    }

    @Override
    public Room[] getRooms() {
        return rooms;
    }


}

