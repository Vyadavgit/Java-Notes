package day4;

public class EncapsulationPractice {
    public static void main(String[] args) {

        Student student1 = new Student(); // student object
        student1.setName("Ram");
//        student1.name = "Ram";
//        student1.playing();

        Student student2 = new Student();
        student2.setName("Hari");
        //        student2.name = "Hari";
//        student2.playing();

        Student student3 = new Student();
        student3.setName("Sita");
        //        student3.name = "Sita";
//        student2.playing();

        System.out.println(student1.getName());
        System.out.println(student2.getName());
        System.out.println(student3.getName());

    }
}
