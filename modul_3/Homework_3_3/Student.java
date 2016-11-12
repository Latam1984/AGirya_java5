package modul_3.Homework_3_3;

/**
 * Created by Aleksey on 11.11.2016.
 * <p>
 * Класс Student с полями:
 * String firstName,
 * String lastName,
 * int group,
 * Course[] coursesTaken,
 * int age.
 * С 2 конструкторами с аргументами
 * firstName, lastName, group;
 * lastName, coursesTaken.
 */
public class Student {
    private String firstName;
    private String LastName;
    private int group;
    private Course[] coursesTaken;
    private int age;


    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.LastName = lastName;
        this.group = group;
    }

    public Student(String lastName, Course[] coursesTaken) {
        this.LastName = lastName;
        this.coursesTaken = coursesTaken;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
