package JavaCore.modul_5.Homework_5.Homework_5_2;

/**
 * Created by Aleksey on 03.12.2016.
 */
public interface API {


        Room[] findRooms(int price, int persons, String city, String hotel);

        Room[] getAll();


}
