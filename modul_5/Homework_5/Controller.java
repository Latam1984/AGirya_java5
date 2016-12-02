package modul_5.Homework_5;

/**
 * Created by Aleksey on 25.11.2016.
 * <p>
 * Создайте класс Controller, в котором есть глобальная переменная API apis[] = new API[3],
 * которая содержит все реализации интерфейса API.
 * Также у Controller есть 2 метода:
 * Room[] requstRooms(int price, int persons, String city, String hotel)
 * ищет все номера с запрашиваемыми параметрами.
 * <p>
 * Все методы используют доступные методы API для поиска.
 * Найденные номера формируют новую DB.
 * <p>
 * Room[] check(API api1, API api2)
 * <p>
 * Проверить, сколько одинаковых номеров возвращают две разные API.
 */
public class Controller {


    API apis[] = new API[3];

    public Controller() {
        apis [0] = new BookingComAPI();
        apis [1] = new GoogleApi();
        apis [2] = new TripAdvisorAPI();
    }

    Room[] requestRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (API room : apis) {
            count += room.findRooms(price, persons, city, hotel).length;

        }

        Room[] result = new Room[count];
        int i = 0;
        for (API a : apis) {
            for (Room r : a.findRooms(price, persons, city, hotel))
            {result[i] = r;
            i++;}
        }

        return result;


    }

    public Room[] check(API api1, API api2) {
        int count = 0;
        for (int i = 0; i < api1.getRooms().length; i++) {
            for (int j = 0; j < api1.getRooms().length; j++) {
                if (api1.getRooms()[i].equals(api2.getRooms()[j])) {
                    count++;
                }
            }
        }

        Room[] result = new Room[count];
        for (int i = 0; i < api1.getRooms().length; i++) {
            if (api1.getRooms()[i].equals(api2.getRooms()[i]))
            {result[i] = api1.getRooms()[i];}
        }
        return result;
    }
}
