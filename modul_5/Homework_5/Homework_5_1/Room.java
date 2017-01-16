package modul_5.Homework_5.Homework_5_1;

import java.util.Date;

/**
 * Created by Aleksey on 25.11.2016.
 * <p>
 * Создайте часть System, которая может найти комнаты в отелях для бронирования и сохранить их в DataBase.
 * Архитектура следующая:
 * Класс Room, который отображает сущность комнаты, которая используется в системе.
 * API интерфейс и 3 его реализации.
 * DAO интерфейс и его реализацию.
 * Controller, который будет содержать логику.
 * <p>
 * Также создайте класс modul_10.Homework_10.Main с методом main, чтобы отобразить результат.
 * <p>
 * !!! Сначала создайте UML диаграммы, и только потом пишите код. !!!
 * Класс Room должен содержать следующие поля:
 * long id
 * int price
 * int persons
 * Date dateAvailableFrom
 * String hotelName
 * String cityName
 */
public class Room {
    private long id;
    private int price;
    private int persons;
    private Date dateAvailableFrom;
    private String hotelName;
    private String cityName;


    @Override
    public String toString() {
        return "Room{" +
                ", price=" + price +
                ", persons=" + persons +
                ", hotelName='" + hotelName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;

        Room room = (Room) o;

        if (price != room.price) return false;
        if (persons != room.persons) return false;
        return cityName.equals(room.cityName);

    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + persons;
        result = 31 * result + cityName.hashCode();
        return result;
    }

    public Room(long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
