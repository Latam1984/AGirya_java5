package JavaCore.modul_7.Homework.Homework_5;

/**
 * Created by Aleksey on 16.12.2016.
 */
public interface DAO {

    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);
}
