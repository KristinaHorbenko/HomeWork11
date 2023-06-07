package Task0;

public class Circle implements GeometricFigure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Площадь круга: " + area);
        return area;

    }

}
