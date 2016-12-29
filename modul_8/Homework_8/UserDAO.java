package modul_8.Homework_8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aleksey on 24.12.2016.
 */
public class UserDAO<T extends User> extends AbstractDAOImpl<T> {


    @Override
    public void save(T target) {
        super.save(target);
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
        new ArrayList<>(list);
    }

    @Override
    public List getList() {
        return new ArrayList(list);
    }

    @Override
    public void daleteById(long id) {
        list.remove((int) id);
    }

    @Override
    public T get(long id) {
        return list.get((int) id);
    }
}
