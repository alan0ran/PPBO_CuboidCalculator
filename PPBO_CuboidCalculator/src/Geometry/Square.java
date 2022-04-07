/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometry;
import Interface.Calculate2D;

/**
 *
 * @author Radiv
 */
public class Square implements Calculate2D{
    private double length, width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double area(double x, double y) {
        return x * y;
    }
    
    @Override
    public double area() {
        return length * width;
    }
    @Override
    public double circumference() {
        return 2 * (length + width);
    }
}
