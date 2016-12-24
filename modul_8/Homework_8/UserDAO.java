package modul_8.Homework_8;

import java.util.List;

/**
 * Created by Aleksey on 24.12.2016.
 */
public class UserDAO extends AbstractDAOImpl {
    long id;
    String name;

    public UserDAO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserDAO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void save(Object target) {
        super.save(target);
    }

    @Override
    public void delete(Object target) {
        super.delete(target);
    }

    @Override
    public void deleteAll(List T) {
        super.deleteAll(T);
    }

    @Override
    public void saveAll(List T) {
        super.saveAll(T);
    }

    @Override
    public List getList() {
        return super.getList();
    }

    @Override
    public void daleteById(long id) {
        super.daleteById(id);
    }

    @Override
    public Object get(long id) {
        return super.get(id);
    }
}
