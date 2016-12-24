package modul_8.Homework_8;

import java.util.List;

/**
 * Created by Aleksey on 24.12.2016.
 */
public interface AbstractDAO <T> {
   // List ---- out DB emulator;
    void save(T target);
    void delete(T target);
    void deleteAll(List T);
    void saveAll(List T);
    List <T> getList();
    void daleteById(long id);
    T get(long id);
}
