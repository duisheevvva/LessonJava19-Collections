package lessonTasks;

import java.util.ArrayList;

public class MainList {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Sultan",18));
        students.add(new Student("Marlen",20));
        students.add(new Student("Ayana",16));

//        System.out.println(students);

        for (Student student: students) {
            System.out.println(student);
        }

    }
}
