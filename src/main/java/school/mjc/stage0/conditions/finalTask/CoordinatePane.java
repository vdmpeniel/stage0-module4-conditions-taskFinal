package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        String response = (x == 0 && y ==0) ? "zero"
                : (x < 0) ?
                    (y < 0) ? "third" : "second"
                    : (y < 0) ? "fourth" : "first";
        System.out.println(response);
    }
}
