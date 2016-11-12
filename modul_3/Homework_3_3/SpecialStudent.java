package modul_3.Homework_3_3;

/**
 * Created by Aleksey on 11.11.2016.
 * <p>
 * Class SpecialStudent унаследован от CollegeStudent.
 * Дополнительные поля long secretKey, String email.
 * Создайте 3 конструктора: 2 таких же, как и в CollegeStudent и один с аргументом secretKey.
 */
public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String firstName, String lastName, int group, String collegeName, int rating, long id, long secretKey) {
        super(firstName, lastName, group, collegeName, rating, id);
        this.secretKey = secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
