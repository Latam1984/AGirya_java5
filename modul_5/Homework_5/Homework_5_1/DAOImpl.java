package modul_5.Homework_5.Homework_5_1;

import java.util.Date;

/**
 * Created by Aleksey on 28.11.2016.
 */
public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println(room + "is saved!");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room + " is deleted!");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room + "is updated!");
        return room;
    }

    @Override
    public Room FindById(long id) {
        Room room = new Room(1213,200,2,new Date(), "Dnipro", "Kiev");
        System.out.println();
        return room;
    }
}
