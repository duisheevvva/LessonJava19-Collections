package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(
                List.of(
                        new Student("Saikal", 20, Gender.FEMALE),
                        new Student("Ayana", 18, Gender.FEMALE),
                        new Student("Ernis", 17, Gender.MALE),
                        new Student("Sultan", 15, Gender.MALE),
                        new Student("Asgadbek", 22, Gender.MALE)
                )
        );

        // TODO WITHOUT STREAM

        List<Student> studentsMale = new ArrayList<>();
        for (Student student : students) {
            if (student.getGender().equals(Gender.MALE)){
                studentsMale.add(student);
            }
        }

        System.out.println(studentsMale);
        // TODO  WITH STREAM
        students.stream()
                .filter(student -> student.getGender().equals(Gender.FEMALE))
                .sorted(Comparator.comparing(Student::getAge).reversed())
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);
    }
}
