package anonymClass;

import java.util.Comparator;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


   Comparator<Student> sortByAge = new Comparator<Student>() {
       @Override
       public int compare(Student o1, Student o2) {
           return o1.getAge() - o2.getAge();
       }
   };

    Comparator<Student> sortByName = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}
