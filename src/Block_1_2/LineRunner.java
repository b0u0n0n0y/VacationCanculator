package Block_1_2;
import Block_1_1.*;

public class LineRunner {

    public static void main(String[] args) {
        Line line1 = new Line(new Point(1, 3), new Point(23, 8));
        Line line2 = new Line(new Point(5, 10), new Point(25, 10));


        Point line3Start = line1.start;
        Point line3End = line2.end;

        System.out.println(line1);
        System.out.println(line2);
        System.out.println("Линия от  " + line3Start + " до " + line3End);

        line1.start.x = 10;
        line1.start.y = 20;
        line2.end.x = 30;
        line2.end.y = 40;

        System.out.println("После изменнения :");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println("Линия от " + line3Start + " до " + line3End);

    }
}
