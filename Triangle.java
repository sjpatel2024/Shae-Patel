public class Triangle {
	public static final double DEFAULT_SIDE = 1.0;
    public static final String POLYGONSHAPE = "Triangle";

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        sideA = DEFAULT_SIDE;
        sideB = DEFAULT_SIDE;
        sideC = DEFAULT_SIDE;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        if (isValidTriangle(sideA, sideB, sideC)) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            this.sideA = DEFAULT_SIDE;
            this.sideB = DEFAULT_SIDE;
            this.sideC = DEFAULT_SIDE;
        }
    }

    public Triangle(double[] sides) {
        if (sides != null && sides.length == 3 && isValidTriangle(sides[0], sides[1], sides[2])) {
            sideA = sides[0];
            sideB = sides[1];
            sideC = sides[2];
        } else {
            sideA = DEFAULT_SIDE;
            sideB = DEFAULT_SIDE;
            sideC = DEFAULT_SIDE;
        }
    }

    public Triangle(Triangle triangle) {
        if (triangle != null) {
            sideA = triangle.sideA;
            sideB = triangle.sideB;
            sideC = triangle.sideC;
        } else {
            sideA = DEFAULT_SIDE;
            sideB = DEFAULT_SIDE;
            sideC = DEFAULT_SIDE;
        }
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double[] getSides() {
        return new double[] {sideA, sideB, sideC};
    }

    public double getAngleA() {
        return lawOfCosines(sideB, sideC, sideA);
    }

    public double getAngleB() {
        return lawOfCosines(sideA, sideC, sideB);
    }

    public double getAngleC() {
        return lawOfCosines(sideA, sideB, sideC);
    }

    public double[] getAngles() {
        return new double[] {getAngleA(), getAngleB(), getAngleC()};
    }

    public boolean setSideA(double sideA) {
        if (isValidTriangle(sideA, sideB, sideC)) {
            this.sideA = sideA;
            return true;
        }
        return false;
    }

    public boolean setSideB(double sideB) {
        if (isValidTriangle(sideA, sideB, sideC)) {
            this.sideB = sideB;
            return true;
        }
        return false;
    }

    public boolean setSideC(double sideC) {
        if (isValidTriangle(sideA, sideB, sideC)) {
            this.sideC = sideC;
            return true;
        }
        return false;
    }

    public boolean setSides(double[] sides) {
        if (sides != null && sides.length == 3 && isValidTriangle(sides[0], sides[1], sides[2])) {
            sideA = sides[0];
            sideB = sides[1];
            sideC = sides[2];
            return true;
        }
        return false;
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }

    public static double lawOfCosines(double a, double b, double c) {
        return Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));
    }

    @Override
    public String toString() {
        return String.format("Triangle(%.4f, %.4f, %.4f)", sideA, sideB, sideC);
    }
   
    public static boolean isTriangle(double[] sides) {
        if (sides == null || sides.length != 3) {
            return false;
        }
        double a = sides[0];
        double b = sides[1];
        double c = sides[2];
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }

    public static boolean isTriangle(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }
}