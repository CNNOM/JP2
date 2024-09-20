package com.example.task1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Rectangle extends Shape {
    private double length;
    private double width;
    private Color colorBorder;
    private double borderWidth;

    public Rectangle(
            Color color,
            Color colorBorder,
            double length,
            double width,
            double borderWidth,
            double x,
            double y) {
        super(color);
        this.length = length;
        this.width = width;
        this.colorBorder = colorBorder;
        this.borderWidth = borderWidth;
        this.x = x;
        this.y = y;
    }

//    public void setPosition(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    void draw(GraphicsContext gr) {
        gr.setFill(color);
        gr.fillRect(x, y, length, width);
        gr.setStroke(colorBorder);
        gr.setLineWidth(borderWidth);
        gr.strokeRect(x, y, length, width);
    }

    @Override
    public String toString() {
        return "Rectangle color is " + super.color + " and area is : " + area();
    }
}