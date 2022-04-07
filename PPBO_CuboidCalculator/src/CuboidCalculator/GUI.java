/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuboidCalculator;
import javax.swing.*;

/**
 *
 * @author Radiv
 */
public class GUI extends JFrame {
    JLabel ltitle = new JLabel("Cuboid Calculator");
    //length
    JLabel llength = new JLabel("Length");
    JTextField flength = new JTextField();
    //width
    JLabel lwidth = new JLabel("Width");
    JTextField fwidth = new JTextField();
    //height
    JLabel lheight = new JLabel("Heigth");
    JTextField fheight = new JTextField();
    //result
    JLabel lresult = new JLabel("Result :");
    JLabel larea = new JLabel("");
    JLabel lcircumference = new JLabel("");
    JLabel lvolume = new JLabel("");
    JLabel lsurface = new JLabel("");
    //button
    JButton bcount = new JButton("Count");
    JButton breset = new JButton("Reset");
    
    public GUI() {
        setTitle("Cuboid Calculator");
        setSize(400, 450);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(ltitle);
        ltitle.setBounds(150, 20, 150, 20);
        //length
        add(llength);
        llength.setBounds(40, 80, 100, 20);      
            add(flength);
            flength.setBounds(125, 80, 220, 20);
        //width
        add(lwidth);
        lwidth.setBounds(40, 120, 100, 20);
            add(fwidth);
            fwidth.setBounds(125, 120, 220, 20);
        //height
        add(lheight);
        lheight.setBounds(40, 160, 100, 20);
            add(fheight);
            fheight.setBounds(125, 160, 220, 20);
        //result
        add(lresult);
        lresult.setBounds(170, 190, 100, 20);
        add(larea);
        larea.setBounds(40, 225, 400, 20);
        add(lcircumference);
        lcircumference.setBounds(40, 260, 400, 20);
        add(lvolume);
        lvolume.setBounds(40, 295, 400, 20);
        add(lsurface);
        lsurface.setBounds(40, 330, 400, 20);
        //button
        add(bcount);
        bcount.setBounds(60, 380, 120, 20);
        add(breset);
        breset.setBounds(210, 380, 120, 20);   
    }

    public String getFlength() {
        return flength.getText();
    }
    public String getFwidth() {
        return fwidth.getText();
    }
    public String getFheight() {
        return fheight.getText();
    }
}
