package day23;

import java.util.ArrayList;

public class GenericClassPractice {

    public static void main(String[] args) {
        Pair<String, String> pair = new Pair<>("name", "Taman Neupane");

        Pair<Integer, Integer> pair2 = new Pair<>(1, 1000);

        Pair<Float, Float> pair3 = new Pair<>(1f, 1000f);

        Pair<String, Integer> pair4 = new Pair<>("name", 1);

        System.out.println(pair);
        System.out.println(pair2);
        System.out.println(pair3);
        System.out.println(pair4);


    }
}