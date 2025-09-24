package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(8);
        numbers.add(14);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);

        System.out.println("Do stream" +numbers);
        numbers.forEach(System.out::println);

//        for (Integer number: numbers) {
//            System.out.println(number);
//        }


        System.out.println("Posle stream");

//        numbers.stream().distinct().skip(2).toList();
//        numbers.stream()
//                .filter(n -> n <6)
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);

        System.out.println(numbers.stream().map(x -> x * 3).findFirst());
    }
}
