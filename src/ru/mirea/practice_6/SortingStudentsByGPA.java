package ru.mirea.practice_6;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGpa() - o2.getGpa();
    }
}
/*
Интерфейс Comparator. Класс, который его реализует говорит: "Я реализую функцию сравнения объектов".
Comparator возвращает int по следующей схеме:
отрицательный int (первый объект отрицательный, то есть меньше)
положительный int (первый объект положительный, хороший, то есть больший)
ноль = объекты равны
 */