/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometry;
import Interface.Calculate3D;

/**
 *
 * @author Radiv
 */
public class Cuboid extends Square implements Calculate3D {
    private double height;

    public Cuboid(double height, double length, double width) {
        super(length, width);
        this.height = height;
    }
    
    @Override
    public double volume() {
        return super.area() * height;
    }
    @Override
    public double surfaceArea() {
        return 2*(super.area()+super.area(super.getLength(), height)+super.area(super.getWidth(), height));
    }
}
