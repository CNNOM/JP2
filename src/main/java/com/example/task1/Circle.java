package com.example.task1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Circle extends Shape {
    private double radius;
    private Color colorBorder;
    private double borderWidth;

    public Circle(
            Color color,
            Color colorBorder,
            double radius,
            double borderWidth,
            double x,
            double y) {
        super(color);
        this.radius = radius;
        this.colorBorder = colorBorder;
        this.borderWidth = borderWidth;
        this.x = x;
        this.y = y;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    void draw(GraphicsContext gr) {
        gr.setFill(color);
        gr.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
        gr.setStroke(colorBorder);
        gr.setLineWidth(borderWidth);
        gr.strokeOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }

    @Override
    public String toString() {
        return "Circle color is " + super.color + " and area is : " + area();
    }
}