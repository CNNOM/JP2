package com.example.task1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

abstract class Shape {
    protected Color color;
    protected double x, y;

    public Shape(Color color) {
        this.color = color;
    }

    abstract double area();

    abstract void draw(GraphicsContext gr);

    public void setColor(Color color) {
        this.color = color;
    }
}