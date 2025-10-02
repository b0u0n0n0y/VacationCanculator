package Block_1_2;
import Block_1_1.*;

public class HumanWithName {
    public static void main(String[] args) {
        Human h1 = new Human(new Block_1_1.Name("Клеопатра"), 152);
        Human h2 = new Human(new Block_1_1.Name("Пушкин","Александр","Сергеевич"), 167);
        Human h3 = new Human(new Block_1_1.Name("Маяковский","Владимир"), 152);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }
}
