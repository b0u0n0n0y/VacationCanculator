package Block_1_3._3;

public class City {
    String name;

    Route route1;
    Route route2;
    Route route3;

    City(String name, Route route1, Route route2, Route route3) {
        this.name = name;
        this.route1 = route1;
        this.route2 = route2;
        this.route3 = route3;
    }

    City(String name, Route route1, Route route2) {
        this(name, route1, route2, null);
    }

    City(String name, Route route1) {
        this(name, route1, null, null);
    }

    City(String name) {
        this(name, null, null, null);
    }

    @Override
    public String toString() {
        String result = name + " -> [";
        boolean first = true;
        if (route1 != null) {
            result += route1.toString();
            first = false;
        }
        if (route2 != null) {
            if (!first) result += ", ";
            result += route2.toString();
            first = false;
        }
        if (route3 != null) {
            if (!first) result += ", ";
            result += route3.toString();
        }
        result += "]";
        return result;
    }
}
