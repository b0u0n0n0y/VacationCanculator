package Block_1_3._1;

public class StudentRunner {

    static int[] copyGrades(int[] grades) {
        int[] copy = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            copy[i] = grades[i];
        }
        return copy;
    }

    public static void main(String[] args) {


        int []grades = {3, 4, 5};
        Student vasy = new Student("Вася",grades);
        Student pety = new Student("Петя", grades);
        pety.grades[0] = 5;
        System.out.println(vasy);
        System.out.println(pety);

        Student andrey = new Student("Андрей", copyGrades(vasy.grades));
        vasy.grades[0] = 2;

        System.out.println();
        System.out.println(vasy);
        System.out.println(andrey);



    }
}
