package day23;

public class GenericMethodPractice {

    public static void main(String[] args) {

        Integer[] values = {1,2,3,4,5};
        String[] sValues = {"a","b","c"};
        Float[] fValues = {2f,3f,4f,5f};

        printArray(values);
        printArray(sValues);
        printArray(fValues);
    }


    // This is called with integer and float array
    public static <T extends Number> void printArray(T[] values){
        for (T val : values) {
            System.out.println(val);
        }
        System.out.println("It is of type number");
    }

    //This is called with string array
    public static <T> void printArray(T[] values){
        for (T val : values) {
            System.out.println(val);
        }
    }

//    public static void printArray(Integer[] values){
//        for (Integer val : values) {
//            System.out.println(val);
//        }
//    }
//
//    public static void printArray(String[] values){
//        for (String val : values) {
//            System.out.println(val);
//        }
//    }
//
//    public static void printArray(Float[] values){
//        for (Float val : values) {
//            System.out.println(val);
//        }
//    }
}