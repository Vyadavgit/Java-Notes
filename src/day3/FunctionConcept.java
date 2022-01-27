package day3;

public class FunctionConcept {
    public static void main(String[] args){
        int a = 2;
        int b = 3;
        int c = a + b;
        addition(a, b);

        int d = 5;
        int e = 50;
        int f = d + e;
        addition(d, e);

        int g = 2;
        int h = 6;
        int i = add(g, h);

    }

    public static void addition(int a, int b){
        int c = a + b;
        System.out.println(c);
    }

    public static int add(int a, int b){
        int c = a + b;
        System.out.println(c);
        return c;
    }
}
