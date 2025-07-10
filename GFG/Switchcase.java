import java.util.List;

class Switchcase {
    static double switchCase(int choice, List<Double> arr) {
        switch (choice) {
            case 1:
                // Area of circle: π * r^2
                if (arr.size() != 1) return -1; // must have only radius
                double radius = arr.get(0);
                return Math.PI * radius * radius;

            case 2:
                // Area of rectangle: L * B
                if (arr.size() != 2) return -1; // must have length & breadth
                double length = arr.get(0);
                double breadth = arr.get(1);
                return length * breadth;

            default:
                return -1; // invalid input
        }
    }
}
