package Block_1_3._3;

public class CityRunner {
    public static void main(String[] args) {
        City C = new City("C");
        City D = new City("D", new Route(C, 4));
        City E = new City("E", new Route(D, 2));
        City B = new City("B", new Route(C, 3));
        City F = new City("F", new Route(B, 1), new Route(E, 2));
        City A = new City("A", new Route(B, 5), new Route(F, 1), new Route(D, 6));

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
    }
}
