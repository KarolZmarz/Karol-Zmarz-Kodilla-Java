package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeCollector {

    List<Shape> shapes = new ArrayList<>();

    public int getShapesQuantity() {
        return shapes.size();
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public  boolean removeFigure(Shape shape) {
        if(shapes.contains(shape)) {
            shapes.remove(shape);
            return true;
        }
        return false;
    }
    public Shape getFigure(int i) {
        if(i >= 0 && i < getShapesQuantity()) {
            return shapes.get(i);
        }
        return null;
    }
    public String showFigures() {
        return shapes.stream().map(Shape::getShapeName).collect(Collectors.joining());
    }

}
