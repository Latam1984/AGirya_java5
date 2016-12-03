package modul_5.Homework_5.Homework_5_1;

/**
 * Created by Aleksey on 25.11.2016.
 * <p>
 * Создать интерфейс DAO и его реализацию. Методы выводят название операции и объекта, над которым она произведена.
 * Room save(Room room)
 * boolean delete(Room room)
 * Room update(Room room)
 * Room findById(long id)
 */
public interface DAO {

    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room FindById(long id);

}

