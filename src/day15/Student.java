package day15;
import java.util.Objects;


public class Student {
    private String name;
    private int rollNumber;
    private int studentClass;

    public Student(String name, int rollNumber, int studentClass){
        this.name = name;
        this.rollNumber = rollNumber;
        this.studentClass = studentClass;
    }

    @Override
    public boolean equals(Object o){
        if (this==o) return true;
        if (o==null||getClass()!=o.getClass()) return false;
        Student student = (Student) o;
        return name.equalsIgnoreCase(student.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name);
    }

    @Override
    public String toString(){
        return "String{" +
                "name=" + "\'" +
                "}";
    }
}
