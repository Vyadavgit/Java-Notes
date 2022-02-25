package day12;
import java.util.Arrays;

public class SortingExamples {
    public static void main(String[] args){
        int[] integers = {3,1,8,5,6};
        System.out.println("*******************Before sorting *************************");

        for (int integer: integers){
            System.out.println(integer);
        }

        // sorting
        Arrays.sort(integers);

        System.out.println(("************************After sorting**"));
        for(int integer: integers){
            System.out.println(integer);
        }
    }

}
