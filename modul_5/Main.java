package modul_5;

/**
 * Created by Aleksey on 25.11.2016.
 * <p>
 * В методе класса Main создайте Controller и сделайте 3 запроса с разными параметрами, чтобы найти номера.
 * Также проверьте все методы 3 раза с разными API, чтобы продемонстрировать, как работает программа.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        System.out.println(controller.requstRooms(60, 2, "Dnipro", "Kiev"));
        System.out.println(controller.requstRooms(160, 2, "Respect", "Kiev"));
        System.out.println(controller.requstRooms(160, 2, "Respect", "Kiev"));

        API api1 = new BookingComAPI();
        API api2 = new GoogleApi();
        API api3 = new TripAdvisorAPI();
        System.out.println(controller.check(api1, api2));
        System.out.println(controller.check(api2, api3));


    }
}
