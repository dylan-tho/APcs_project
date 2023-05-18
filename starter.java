import java.io.*;
import javax.swing.*;
 
// Main class
class starter {
 
    // Main driver method
    public static void main(String[] args)
    {
        JFrame frame
            = new JFrame(); // creating instance of JFrame
 
        JButton button = new JButton(
            " GFG WebSite Click"); // creating instance of
                                   // JButton
        button.setBounds(
            100, 100, 50,
            50); // x axis, y axis, width, height

            
        JButton button1 = new JButton(
            " "); // creating instance of
                                   // JButton
        button1.setBounds(
            150, 100, 50,
            50); // x axis, y axis, width, height
 
       

         
 
        JButton button2 = new JButton(
            " "); // creating instance of
                                   // JButton
        button2.setBounds(
            200, 100, 50,
            50); // x axis, y axis, width, height


        JButton button3 = new JButton(
            " ");

            button3.setBounds(100,150,50,50);
 
        frame.add(button); // adding button in JFrame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.setSize(500, 500); // 400 width and 500 height
        frame.setLayout(null); // using no layout managers
        frame.setVisible(true); // making the frame visible
 
      


         
    }        
}