package com.example.task1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private Color colorBorder;
    private double borderWidth;

    public Triangle(
            Color color,
            Color colorBorder,
            double sideA,
            double sideB,
            double sideC,
            double borderWidth,
            double x) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.colorBorder = colorBorder;
        this.borderWidth = borderWidth;
        this.x = x;
        this.y = y;
    }

    @Override
    double area() {
        // Используем формулу Герона для вычисления площади треугольника
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    void draw(GraphicsContext gr) {
        double[] xPoints = {x, x + sideA, x + sideB};
        double[] yPoints = {y, y + sideC, y + sideC};

        gr.setFill(color);
        gr.fillPolygon(xPoints, yPoints, 3);
        gr.setStroke(colorBorder);
        gr.setLineWidth(borderWidth);
        gr.strokePolygon(xPoints, yPoints, 3);
    }

    @Override
    public String toString() {
        return "Triangle color is " + super.color + " and area is : " + area();
    }
}