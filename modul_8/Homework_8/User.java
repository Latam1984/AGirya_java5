package modul_8.Homework_8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aleksey on 28.12.2016.
 */
public class User {
    long id;
    String name;


    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "id = " + id +
                "; name = " + name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
