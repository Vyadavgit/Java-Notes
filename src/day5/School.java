package day5;

public class School {
    public static void main(String[] args){
        Student student = new Student();
        student.setName("ABC");
        student.setAge(12);
        student.setStudentClass(6);

        Teacher teacher = new Teacher();
        teacher.setName("English Teacher");
        teacher.setAge(50);
        teacher.setSubject("English");
    }
}
