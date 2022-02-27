package day28;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIPractice {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> numberStream = numbers.stream();

        Stream<Integer> newNumberStream = Stream.of(1,2,3,4,5,6,7,9,8,10);
        List<Integer> cubicNewNumbers = newNumberStream
                .sorted()
                .peek(x -> System.out.println(x)) // prints x
                .filter(x -> x % 2 == 0)
                .peek(x -> System.out.println(x)) // prints x
                .map(x -> x * x)
                .toList();

        System.out.println(cubicNewNumbers); // [4, 16, 36, 64, 100]


        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);
        List<List<Integer>> listOfNumbers = Arrays.asList(list1, list2, list3);

        System.out.println(listOfNumbers); // [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

        List<Integer> listOfAllIntegers = listOfNumbers.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        System.out.println(listOfAllIntegers); // [1, 2, 3, 4, 5, 6, 7, 8, 9]


        List<String> countries = Arrays.asList("India", "Australia",
                "SriLanka","Russia", "Australia","SriLanka","India");
        List<String> distinctCountries = countries.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctCountries); // [India, Australia, SriLanka, Russia]



    }
}