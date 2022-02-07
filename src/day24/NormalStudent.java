package day24;

import java.util.Objects;

public class NormalStudent {

    private String name;
    private int rollNumber;

    public NormalStudent(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    @Override
    public String toString() {
        return "NormalStudent{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NormalStudent that = (NormalStudent) o;
        return rollNumber == that.rollNumber && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNumber);
    }
}