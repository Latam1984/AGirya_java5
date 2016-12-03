package modul_5.Homework_5.Homework_5_1;

import java.util.Arrays;

/**
 * Created by Aleksey on 25.11.2016.
 * <p>
 * В методе класса Main создайте Controller и сделайте 3 запроса с разными параметрами, чтобы найти номера.
 * Также проверьте все методы 3 раза с разными API, чтобы продемонстрировать, как работает программа.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Room [] p1=controller.requestRooms(60, 2, "Dnipro", "Kiev");
        System.out.println(Arrays.toString(p1));

        Room [] p2 = controller.requestRooms(160, 2, "Respect", "Kiev");
        System.out.println(Arrays.toString(p2));

        Room [] p3 = controller.requestRooms(50, 1, "Ukraine", "Kiev");
        System.out.println(Arrays.toString(p3));
//
//        controller.requestRooms(60, 2, "Dnipro", "Kiev");
//        controller.requestRooms(160, 2, "Respect", "Kiev");
//        controller.requestRooms(160, 2, "Respect", "Kiev");
//        Arrays.toString(controller.requestRooms(60, 2, "Dnipro", "Kiev"));
//
        API api1 = new BookingComAPI();
        API api2 = new GoogleApi();
        API api3 = new TripAdvisorAPI();
        System.out.println(controller.check(api1, api2));
        System.out.println(controller.check(api2, api3));

//        System.out.println(Arrays.toString(controller.requstRooms(50, 1, "Ukraine", "Kiev")));
    }
}
