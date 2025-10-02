package Block_1_2;

public class HumanChangeRunner {
    public static void main(String[] args) {

            Person ivan = new Person(new Name("Чудов", "Иван"), 0);
            Person petr = new Person(new Name("Чудов", "Петр"), 0, ivan);
            Person boris = new Person(new Name("Борис"), 0, petr);

            System.out.println(ivan);  // Чудов Иван
            System.out.println(petr);  // Чудов Петр Иванович
            System.out.println(boris); // Чудов Борис Петрович
        }
}
