package Block_1_3._1;

import java.util.Arrays;

public class Student {
    String name;
    int [] grades;

    public Student(String name, int[] grades){
        this.name = name;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return name + ": " + Arrays.toString(grades);
    }
}
