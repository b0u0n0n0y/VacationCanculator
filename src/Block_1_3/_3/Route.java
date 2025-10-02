package Block_1_3._3;

public class Route {
    City city;
    int cost;

    Route(City city, int cost) {
        this.city = city;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return city.name + ": " + cost;
    }
}
