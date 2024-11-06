package com.example.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.paint.Color;
import javafx.util.converter.DoubleStringConverter;

import java.util.function.UnaryOperator;

public class HelloController {

    @FXML
    private Canvas canvas;

    @FXML
    private ColorPicker colorPicker, colorPickerBorder;

    @FXML
    private TextField widthField, heightField, borderField, xField, yField;

    @FXML
    private void initialize() {
        setupNumericTextField(xField);
        setupNumericTextField(yField);
        setupNumericTextField(widthField);
        setupNumericTextField(heightField);
        setupNumericTextField(borderField);
    }

    private void setupNumericTextField(TextField textField) {
        UnaryOperator<TextFormatter.Change> filter = change -> {
            String newText = change.getControlNewText();
            if (newText.matches("\\d*(\\.\\d*)?")) {
                return change;
            }
            return null;
        };
        textField.setTextFormatter(new TextFormatter<>(new DoubleStringConverter(), 0.0, filter));
    }

    @FXML
    private void onClickRectangle(ActionEvent event) {
        drawRectangle();
    }

    @FXML
    private void onClickCircle(ActionEvent event) {
        drawCircle();
    }

    @FXML
    private void onClickTriangle(ActionEvent event) {
        drawTriangle();
    }

    @FXML
    private void onClickCross(ActionEvent event) {
        drawCross();
    }

    private void drawRectangle() {
        double width = Double.parseDouble(widthField.getText());
        double height = Double.parseDouble(heightField.getText());
        double border = Double.parseDouble(borderField.getText());
        double x = Double.parseDouble(xField.getText());
        double y = Double.parseDouble(yField.getText());

        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.clearRect(0, 0, canvas.getWidth(), canvas.getHeight()); // Очистка всего холста

        Rectangle rectangle = new Rectangle(colorPicker.getValue(), colorPickerBorder.getValue(), width, height, border, x, y);
        rectangle.draw(graphicsContext);
    }

    private void drawCircle() {
        double radius = Double.parseDouble(widthField.getText());
        double border = Double.parseDouble(borderField.getText());
        double x = Double.parseDouble(xField.getText());
        double y = Double.parseDouble(yField.getText());

        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.clearRect(0, 0, canvas.getWidth(), canvas.getHeight()); // Очистка всего холста

        Circle circle = new Circle(colorPicker.getValue(), colorPickerBorder.getValue(), radius, border, x, y);
        circle.draw(graphicsContext);
    }

    private void drawTriangle() {
        double width = Double.parseDouble(widthField.getText());
        double height = Double.parseDouble(heightField.getText());
        double border = Double.parseDouble(borderField.getText());
        double x = Double.parseDouble(xField.getText());
        double y = Double.parseDouble(yField.getText());

        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.clearRect(0, 0, canvas.getWidth(), canvas.getHeight()); // Очистка всего холста

        Triangle triangle = new Triangle(colorPicker.getValue(), colorPickerBorder.getValue(), width, height, border, x, y);
        triangle.draw(graphicsContext);
    }

    private void drawCross() {
        double width = Double.parseDouble(widthField.getText());
        double height = Double.parseDouble(heightField.getText());
        double border = Double.parseDouble(borderField.getText());
        double x = Double.parseDouble(xField.getText());
        double y = Double.parseDouble(yField.getText());

        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.clearRect(0, 0, canvas.getWidth(), canvas.getHeight()); // Очистка всего холста

        Cross cross = new Cross(colorPicker.getValue(), colorPickerBorder.getValue(), width, height, border, x, y);
        cross.draw(graphicsContext);
    }
}