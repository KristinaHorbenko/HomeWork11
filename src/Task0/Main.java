package Task0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Task0.TotalArea.calculateTotalArea;

public class Main {
    public static void main(String[] args) {
        List<GeometricFigure> geometricFigures = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість фігур: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Фігура #" + (i + 1));
            System.out.print("Введіть тип фігури (1 - Круг, 2 - Трикутник, 3 - Квадрат): ");
            int type = scanner.nextInt();

            if (type == 1) {
                System.out.print("Введіть радіус кола: ");
                double radius = scanner.nextDouble();
                geometricFigures.add(new Circle(radius));


            } else if (type == 2) {
                System.out.print("Введіть основу трикутника: ");
                double base = scanner.nextDouble();
                System.out.print("Введіть висоту трикутника: ");
                double height = scanner.nextDouble();
                geometricFigures.add(new Triangle(base, height));
            } else if (type == 3) {
                System.out.print("Введіть бік квадрата: ");
                double side = scanner.nextDouble();
                geometricFigures.add(new Square(side));
            } else {
                System.out.println("Неправильний тип фігури. Фігура буде пропущена.");
            }
        }

        calculateTotalArea(geometricFigures);

    }
}










