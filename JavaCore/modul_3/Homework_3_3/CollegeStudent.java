package JavaCore.modul_3.Homework_3_3;

/**
 * Created by Aleksey on 11.11.2016.
 * CollegeStudent унаследован от Student.
 * Дополнительные поля: String collegeName, int rating, long id.
 * Создайте 3 конструктора: 2 таких же, как и в Student and один с аргументами - всеми полями класса.
 */
public class CollegeStudent extends Student {
    private String collegeName;
    private int rating;
    private long id;



    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public CollegeStudent(String firstName, String lastName, int group, String collegeName, int rating, long id) {
        super(firstName, lastName, group);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
