import java.util.Scanner;

public class CircleWithException {

    private double radius;

    public CircleWithException(double radius){
        this.radius =radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(getRadius(),2);
    }

    public double getDiameter(){
        return (2 * getRadius());
    }

    public static void verify(double radius, double area) throws Exception, IllegalArgumentException {

        if (radius < 0) {
            throw new IllegalArgumentException("Radius must be a positive number");
        }

        if (area > 1000) {
            throw new IllegalArgumentException("Area should not be bigger than 1000");
        }

    }

    public static void main(String[] args) {

        try {

            CircleWithException circle;
            Scanner input = new Scanner(System.in);

            System.out.println("Enter radius: ");

            double radius = input.nextDouble();
            circle = new CircleWithException(radius);

            verify(circle.getRadius(), circle.getArea());

            System.out.println("Radius of circle is: " + circle.getRadius());
            System.out.println("Area of circle is: " + circle.getArea());
            System.out.println("Diameter of circle is: " + circle.getDiameter());

        } catch (Exception e) {

            System.out.println(e);

        }

    }
}

