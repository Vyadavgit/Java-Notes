package day24;

public class WildCardPractice {

    public static void main(String[] args) {
        Pair<Integer> pair1 = new Pair<>(1,2000);
        Pair<Float> pair2 = new Pair<>(1f,2000f);
        Pair<String> pair3 = new Pair<>("name","ABC");

        printPair(pair1);
        printPair(pair2);
        printPair(pair3);

    }

    public static void printPair(Pair<?> pair){

    }

}