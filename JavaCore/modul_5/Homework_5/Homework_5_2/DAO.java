package JavaCore.modul_5.Homework_5.Homework_5_2;

/**
 * Created by Aleksey on 03.12.2016.
 */
public interface DAO {

        Room save(Room room);

        boolean delete(Room room);

        Room update(Room room);

        Room findById(long id);

        Room[] getAll();

    }

