package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        double a = firstSide;
        double b = secondSide;
        double c = thirdSide;
        System.out.println(
                ((a + b > c) && (b + c > a) && (a + c > b))? "this is a valid triangle" : "it's not a triangle"
        );
    }
}
