/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CuboidCalculator;
import Geometry.Cuboid;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Radiv
 */
public class Main {

    public static void main(String[] args) {
        GUI gui = new GUI();
        
        gui.bcount.addActionListener((ActionEvent arg0) -> {
            try {
                float length, width, height;
                length = Float.valueOf(gui.getFlength());
                width = Float.valueOf(gui.getFwidth());
                height = Float.valueOf(gui.getFheight());
                
                Cuboid cuboid = new Cuboid(height, length, width);
                gui.larea.setText("Square Area : " + cuboid.area());
                gui.lcircumference.setText("Square Circumference : " + cuboid.circumference());
                gui.lvolume.setText("Cuboid Volume : " + cuboid.volume());
                gui.lsurface.setText("Cuboid Surface Area : " + cuboid.surfaceArea());
            }
            catch (NumberFormatException nfe) {
                if("empty String".equals(nfe.getMessage())){
                    JOptionPane.showMessageDialog(null, "Cannot be empty");
                }
                else {
                    JOptionPane.showMessageDialog(null, nfe.getMessage());
                }
            }
        });   
        gui.breset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                gui.larea.setText("");
                gui.lcircumference.setText("");
                gui.lvolume.setText("");
                gui.lsurface.setText("");
                gui.fheight.setText("");
                gui.flength.setText("");
                gui.fwidth.setText("");
            }
        });
    }
}
