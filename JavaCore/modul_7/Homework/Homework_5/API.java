package JavaCore.modul_7.Homework.Homework_5;

import java.util.List;

/**
 * Created by Aleksey on 16.12.2016.
 */
public interface API {

    List<Room> findRooms(int price, int persons, String city, String hotel);

    List<Room> getRoom();
}
