package Math_Class_Demo.src;

public class RealWorldMathDemo {

    public static void main(String[] args) {
        double radius = 7.0;

        // Area of a circle using Math.PI.
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of circle = " + area);

        double x1 = 2, y1 = 3;
        double x2 = 8, y2 = 11;

        // Distance formula using Math.pow and Math.sqrt.
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance between points = " + distance);
    }
}
