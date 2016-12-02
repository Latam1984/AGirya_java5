package modul_5.Homework_5;

/**
 * Created by Aleksey on 25.11.2016.
 * <p>
 * Создайте API интерфейс с одним методом
 * Room[] findRooms(int price, int persons, String city, String hotel)
 */
public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getRooms();

    public String toString();
    // Room [] rooms;
}
