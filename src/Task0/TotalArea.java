package Task0;

import java.util.ArrayList;
import java.util.List;

public class TotalArea {
    private static ArrayList<GeometricFigure> geometricShapes;

    public TotalArea() {

        this.geometricShapes = new ArrayList<>();
    }

    public static double calculateTotalArea(List<GeometricFigure> figures) {
       double totalArea = 0;
       for (GeometricFigure figure : figures) {
           totalArea += figure.calculateArea();

       }
        System.out.println("Суммарная площадь всех фигур: " + Rounder.roundValue(totalArea, 2));
        return totalArea;

   }


}


