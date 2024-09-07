/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author sifu
 */
public class MyFirstFrame extends JFrame {
    public MyFirstFrame()
    {
     setTitle("My First GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
      setSize(100,150);
        setResizable(true);
        setVisible(true);
        setForeground(Color.red);
        
    
    
    }
    
}
