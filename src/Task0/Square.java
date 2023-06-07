package Task0;

public class Square implements GeometricFigure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double area = Math.pow(side, 2);
        System.out.println("Площа квадрата: " + area);
        return area;
    }
}
