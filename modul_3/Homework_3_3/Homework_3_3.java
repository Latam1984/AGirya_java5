package modul_3.Homework_3_3;

import java.util.Date;

/**
 * Created by Aleksey on 11.11.2016.
 * <p>
 * Класс Course с полями:
 * Date startDate,
 * String name,
 * int hoursDuration,
 * String teacherName.
 * Создайте 2 конструктора с аргументами
 * startDate, name;
 * hourseDuration, name, teacherName.
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
 * <p>
 * CollegeStudent унаследован от Student.
 * Дополнительные поля: String collegeName, int rating, long id.
 * Создайте 3 конструктора: 2 таких же, как и в Student and один с аргументами - всеми полями класса.
 * <p>
 * Class SpecialStudent унаследован от CollegeStudent.
 * Дополнительные поля long secretKey, String email.
 * Создайте 3 конструктора: 2 таких же, как и в CollegeStudent и один с аргументом secretKey.
 * <p>
 * Создайте get-, set-методы для всех полей и сделайте их private согласно принципам ООП.
 * Создайте 5 объектов класса Course. Создайте объекты других классов, используя все конструкторы.
 * У вас должно быть 13 объектов в классе Solution.
 */
public class Homework_3_3 {


    Course course = new Course(new Date(), "Java4");
    Course course1 = new Course("Java", 40, "Pasha");
    Course course2 = new Course("Java5", 80, "Andrey");
    Course course3 = new Course("Java6", 120, "Pasha");
    Course course4 = new Course("Java7", 180, "Andrey, Pasha");

    Course[] courses = {course, course1, course2, course3, course4};

    Student student1 = new Student("Aleks", "Girya", 5);
    Student student2 = new Student("Girya", courses);
    CollegeStudent collegeStudent = new CollegeStudent("Anton", "Morozov", 7);
    CollegeStudent collegeStudent1 = new CollegeStudent("Petrov", courses);
    CollegeStudent collegeStudent2 = new CollegeStudent("Ivan", "Ivanov", 6, "NTU", -1, 1515);
    SpecialStudent specialStudent = new SpecialStudent("Ivanov", courses);
    SpecialStudent specialStudent1 = new SpecialStudent("Aleksandrov", "Aleksandr", 6);
    SpecialStudent specialStudent2 = new SpecialStudent("Anton", "Antipenko", 5, "NTU", 9, 1514, 123432156);
}
