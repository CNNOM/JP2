package com.example.task1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Cross extends Shape {
    private double size;
    private Color colorBorder;
    private double borderWidth;

    public Cross(
            Color color,
            Color colorBorder,
            double width, double size,
            double borderWidth,
            double x,
            double y) {
        super(color);
        this.size = size;
        this.colorBorder = colorBorder;
        this.borderWidth = borderWidth;
        this.x = x;
        this.y = y;
    }

    @Override
    double area() {
        // Площадь крестика можно считать как площадь двух прямоугольников
        return 2 * size * size;
    }

    @Override
    void draw(GraphicsContext gr) {
        gr.setFill(color);
        gr.fillRect(x, y, size, size);
        gr.fillRect(x + size, y + size, size, size);
        gr.setStroke(colorBorder);
        gr.setLineWidth(borderWidth);
        gr.strokeRect(x, y, size, size);
        gr.strokeRect(x + size, y + size, size, size);
    }

    @Override
    public String toString() {
        return "Cross color is " + super.color + " and area is : " + area();
    }
}