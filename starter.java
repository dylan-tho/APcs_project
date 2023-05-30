import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.time.format.TextStyle;
import java.util.ArrayList;

// Main class
class Starter {

    // Main driver method
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // creating instance of JFrame
        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setBounds(350, 100, 150, 150);
        panel.setSize(150, 150);
        frame.add(panel);
        JLabel label = new JLabel("Draw Here");
        panel.add(label);
        JButton button = new JButton(" "); // creating instance of JButton
        button.setBounds(100, 100, 50, 50); // x-axis, y-axis, width, height

        JButton button1 = new JButton(""); // creating instance of JButton
        button1.setBounds(150, 100, 50, 50); // x-axis, y-axis, width, height

        JButton button2 = new JButton(" "); // creating instance of JButton
        button2.setBounds(200, 100, 50, 50); // x-axis, y-axis, width, height

        JButton button3 = new JButton(" ");
        button3.setBounds(100, 150, 50, 50);

        JButton button4 = new JButton(" ");
        button4.setBounds(100, 200, 50, 50);

        JButton button5 = new JButton(" ");
        button5.setBounds(150, 200, 50, 50);

        JButton button6 = new JButton(" ");
        button6.setBounds(150, 150, 50, 50);

        JButton button7 = new JButton(" ");
        button7.setBounds(200, 200, 50, 50);

        JButton button8 = new JButton(" ");
        button8.setBounds(200, 150, 50, 50);

        JButton player = new JButton("SaveP1");
        player.setBounds(350, 300, 150, 50);

        JButton player3 = new JButton("SaveP2");
        player3.setBounds(350, 350, 150, 50);

        frame.add(button); // adding button in JFrame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(player);
        frame.add(player3);

        frame.setSize(750, 500); // 400 width and 500 height
        frame.setLayout(null); // using no layout managers
        frame.setVisible(true); // making the frame visible

        ArrayList<Integer> drawing = new ArrayList<Integer>();
        ArrayList<Integer> player1 = new ArrayList<Integer>();
        ArrayList<Integer> player2 = new ArrayList<Integer>();

        player.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i = 0;i<drawing.size();i++){
                    player1.add(drawing.get(i));

                }
                panel.removeAll();
                panel.revalidate();
                panel.repaint();
                JLabel label = new JLabel("Draw Here");
                panel.add(label);
                drawing.clear();
            }
        });
        player3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i = 0;i<drawing.size();i++){
                    player2.add(drawing.get(i));
                }
                panel.removeAll();
                panel.revalidate();
                panel.repaint();
                JLabel label = new JLabel("Draw Here");
                panel.add(label);
                drawing.clear();

            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = button.getGraphics();
                g.drawLine(0, 0, 500, 500);
                /*
                JPanel b = new JPanel();
                b.setBackground(Color.gray);
                b.setBounds(50, 100, 500, 50);
                b.setSize(50,50);
                frame.add(b);
                System.out.print("mrpooleseemmed");
                 */
            }
            });
        panel.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                drawing.add(e.getX());
                drawing.add(e.getY());
                if (drawing.size() % 4 == 0 && drawing.size() != 0) {
                    int x1 = drawing.get(drawing.size() - 4);
                    int y1 = drawing.get(drawing.size() - 3);
                    int x2 = drawing.get(drawing.size() - 2);
                    int y2 = drawing.get(drawing.size() - 1);
                    Graphics g = panel.getGraphics();
                    g.drawLine(x1, y1, x2, y2);
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
