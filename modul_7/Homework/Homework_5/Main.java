package modul_7.Homework.Homework_5;

import java.util.List;

/**
 * Created by Aleksey on 16.12.2016.
 */
public class Main {
    public static void main(String[] args) {
    Controller controller = new Controller();
        List<API> request1 = controller.requestRooms(1, 50, "Kiev", "Ukraine");
        System.out.println(request1);
    }
}
