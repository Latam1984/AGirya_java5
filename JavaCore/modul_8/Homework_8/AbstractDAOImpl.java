package JavaCore.modul_8.Homework_8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aleksey on 24.12.2016.
 */
public class AbstractDAOImpl<T> implements AbstractDAO<T> {
    List<T> list = new ArrayList<>();

    @Override
    public String toString() {
        return "Users: " + list;
    }

    @Override
    public void save(T target) {
        list.add(target);
    }

    @Override
    public void delete(T target) {
        list.remove(target);
    }

    @Override
    public void deleteAll(List T) {
        list.removeAll(T);
    }

    @Override
    public void saveAll(List T) {
        list.addAll(T);
    }

    @Override
    public List getList() {
        return list;
    }

    @Override
    public void daleteById(long id) {
        list.remove(id);

    }

    @Override
    public T get(long id) {
        return list.get((int) id);
    }
}
