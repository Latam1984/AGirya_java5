package JavaCore.modul_5.Homework_5.Homework_5_1;

import java.util.Date;

/**
 * Created by Aleksey on 25.11.2016.
 */
public class TripAdvisorAPI implements API {
    Room[] rooms;

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int counter = 0;
        for (Room r : getRooms()) {
            if (r.getPrice() == price && r.getPersons() == persons && r.getCityName() == city && r.getHotelName() == hotel)
                ;
            counter++;
        }
        Room room[] = new Room[counter];

        int temp = 0;
        for (Room r : getRooms()) {
            if (r.getPrice() == price && r.getPersons() == persons && r.getCityName() == city && r.getHotelName() == hotel) {
                room[temp] = r;
            }
        }

        return room;
    }

    public TripAdvisorAPI() {
        rooms = new Room[5];
        rooms[0] = new Room(10, 100, 2, new Date(), "Krakiv", "Kiev");
        rooms[1] = new Room(1, 60, 2, new Date(), "Dnipro", "Kiev");
        rooms[2] = new Room(1, 80, 1, new Date(), "Hreshatik", "Kiev");
        rooms[3] = new Room(1, 160, 2, new Date(), "Respect", "Kiev");
        rooms[4] = new Room(12, 250, 3, new Date(), "Krakiv", "Kiev");
    }

    @Override
    public Room[] getRooms() {
        return rooms;
    }


}
