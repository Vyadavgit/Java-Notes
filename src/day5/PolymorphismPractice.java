package day5;

public class PolymorphismPractice {
    public static void main(String[] args){

        // implicit typecasting
//        Person student = new Student();
//        student.setName("ABC");
//        student.setAge(12);
//
//        Person teacher = new Teacher();
//        teacher.setName("English Teacher");
//        teacher.setAge(50);

        // explicit typecasting
//        Person person = new Student();
//        person.setName("ABC");
//        person.setAge(12);
//        ((Student)person).setStudentClass(6);
////        ((Teacher)person).setSubject(6); // throws error because of incompatible type casting


        // polymorphism in the case of objects
        Person person;

        person = new Student();
        person.setName("ABC");
        person.setAge(12);
        ((Student)person).setStudentClass(6);

        person = new Teacher();
        person.setName("English Teacher");
        person.setAge(50);
    }

    public static void add(int a, int b){
        int temp = a + b;
        System.out.println(temp);
    }

    public static void add(int a, int b, int c){
        int temp = a + b + c;
        System.out.println(temp);
    }

    public static void add(float a, float b){
        float temp = a + b;
        System.out.println(temp);
    }


}
