package day26;

import java.util.Objects;

public class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o== null || getClass() !=o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && Objects.equals(name,student.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, rollNumber);
    }

    @Override
    public String toString(){
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    //    @Override
//    public int compareTo(Student o) {
//        return this.name.compareTo(o.name);
//    }
}
