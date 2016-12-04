package modul_5.Homework_5.Homework_5_2;
import java.util.Date;
import java.util.Arrays;
/**
 * Created by Aleksey on 03.12.2016.
 */
public class Main {

        public static void main(String[] args) {

            Controler controller = new Controler();



            System.out.println("----------------Запрашиваем комнаты по параметрам-----------------");

            Room[] param = controller.requstRooms(150, 1, "Лас-Вегас", "The Cosmopolitan");

            System.out.println(Arrays.toString(param));

            System.out.println();



            Room[] param1 = controller.requstRooms(150, 2, "New York", "Hilton");

            System.out.println(Arrays.toString(param1));

            System.out.println();



            Room[] param3 = controller.requstRooms(200, 1, "Дубай", "Atlantis The Palm");

            System.out.println(Arrays.toString(param3));

            System.out.println();





            System.out.println("------------СравнениеAPI--------------------");

            Room[] sad = controller.check(new BookingComApi(), new GoogleApi());

            Room[] sad1 = controller.check(new BookingComApi(), new TripAdvisorApi());

            Room[] sad2 = controller.check(new TripAdvisorApi(), new GoogleApi());



            System.out.println(Arrays.toString(sad));

            System.out.println();



            System.out.println(Arrays.toString(sad1));

            System.out.println();



            System.out.println(Arrays.toString(sad2));

            System.out.println();

            System.out.println("---------------Работаем с ДАО-----------------------------------");



            Room[] DB = controller.getDao().getDataBase();

            Date date = new Date();

            Room room = new Room(13321, 456, 4, date, "Киев", "Киев");

            Room room1 = new Room(13361, 455, 5, date, "Москва", "Киев");

            controller.getDao().save(room);

            controller.getDao().save(room1);

            System.out.println(Arrays.toString(DB));



            controller.getDao().delete(room);



            System.out.println(Arrays.toString(DB));



            controller.getDao().update(room1);

            controller.getDao().findById(13361);

        }

    }
