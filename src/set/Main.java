package set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Set<String> students = new HashSet<>(); // tartipsiz saktait
//        students.add("Saikal");
//        students.add("Saikal");
//        students.add("Nurperi");
//        students.add("Ayana");
//        students.add("Ayana");
//        System.out.println(students);
//
//
//        Set<Integer> numbers = new LinkedHashSet<>();// kandai bersek oshol boidon saktait
//        numbers.add(23);
//        numbers.add(34);
//        numbers.add(4);
//        numbers.add(65);
//        numbers.add(5);
//        numbers.add(34);
//        numbers.add(65);
//        numbers.add(267);
//        System.out.println(numbers);
//
//
//        Set<String> mentors = new TreeSet<>();
//        mentors.add("Urmat");
//        mentors.add("Symbat");
//        mentors.add("Baitenir");
//        mentors.add("Baitenir");
//        mentors.add("Aizat");
//        mentors.add("Ayana");
//
//
////        for (String mentor: mentors) {
////            System.out.println(mentor);
////        }
//
//        List<String> convertMentors = new ArrayList<>(mentors);
//        System.out.println(convertMentors);
//        System.out.println(convertMentors.get(2));
//
//        TreeSet <Integer> numbers1 = new TreeSet<>();
//        numbers1.add(245);
//        numbers1.add(45);
//        numbers1.add(76);
//        numbers1.add(76);
//        numbers1.add(0);
//        numbers1.add(4);
//        numbers1.add(10);
//        numbers1.add(20);
//
//        System.out.println(numbers1);



        // TODO Tapshyrma
//        Random random = new Random();
//        List<Integer> numbersList = new ArrayList<>();
//        for (int i = 0; i < 400; i++) {
//           numbersList.add(random.nextInt(0,20));
//        }
//
//        int counterList = 0;
//        for (Integer i: numbersList) {
//            counterList += i;
//        }
//
//        System.out.println("NumbersList: "  + numbersList);
//        System.out.println("Summ number list: " + counterList);
//
//        Set<Integer> numbersSet = new HashSet<>(numbersList);
//
//        int counterSet = 0;
//        for (Integer i:numbersSet) {
//            counterSet +=i;
//        }
//
//        System.out.println("NumbersSet: "  + numbersSet);
//        System.out.println("Summ number set: " + counterSet);
//



        // TODO Object Set
        Set<Student> students = new TreeSet<>();
        students.add(new Student("Saikal",5));
        students.add(new Student("Nurperi",25));
        students.add(new Student("Ayana",20));
        students.add(new Student("Ayana",20));
        System.out.println(students);
    }
}
