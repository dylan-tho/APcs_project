import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.time.format.TextStyle;
import java.util.ArrayList;

// Main class
class starter {
    // Main driver method
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // creating instance of JFrame
        JPanel panel = new JPanel();
        JPanel b = new JPanel();
        JPanel b1 = new JPanel();
        JPanel b2 = new JPanel();
        JPanel b3 = new JPanel();
        JPanel b4 = new JPanel();
        JPanel b5 = new JPanel();
        JPanel b6 = new JPanel();
        JPanel b7 = new JPanel();
        JPanel b8 = new JPanel();
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
        button.setVisible(false);
                frame.remove(button);
                b.setBackground(Color.gray);
                b.setBounds(100, 100, 50, 50);
                b.setSize(50,50);
                frame.add(b);
                for(int i = 0;i<player1.size()-3;i++){
                    if (drawing.size() % 4 == 0 && drawing.size() != 0){
                Graphics g = b.getGraphics();
                g.drawLine(player1.get(i), player1.get(i+1), player1.get(i+2), player1.get(i+3));
                }
    
            }                 
            }
            });
            button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setVisible(false);
                frame.remove(button1);
                b1.setBackground(Color.gray);
                b1.setBounds(150, 100, 50, 50);
                b1.setSize(50,50);
                frame.add(b1);
            }
            });
            button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button2.setVisible(false);
                frame.remove(button2);
                b2.setBackground(Color.gray);
                b2.setBounds(200, 100, 50, 50);
                b2.setSize(50,50);
                frame.add(b2);
                 
            }
            });
            button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button3.setVisible(false);
                frame.remove(button3);
                b3.setBackground(Color.gray);
                b3.setBounds(100, 150, 50, 50);
                b3.setSize(50,50);
                frame.add(b3);
                 
            }
            });
            button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button4.setVisible(false);
                frame.remove(button4);
                b4.setBackground(Color.gray);
                b4.setBounds(100, 200, 50, 50);
                b4.setSize(50,50);
                frame.add(b4);
                 
            }
            });
            button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button5.setVisible(false);
                frame.remove(button5);
                b5.setBackground(Color.gray);
                b5.setBounds(150, 200, 50, 50);
                b5.setSize(50,50);
                frame.add(b5);
                 
            }
            });
            button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button6.setVisible(false);
                frame.remove(button6);
                b6.setBackground(Color.gray);
                b6.setBounds(150, 150, 50, 50);
                b6.setSize(50,50);
                frame.add(b6);
                 
            }
            });
            button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button7.setVisible(false);
                frame.remove(button7);
                b7.setBackground(Color.gray);
                b7.setBounds(200, 200, 50, 50);
                b7.setSize(50,50);
                frame.add(b7);
                 
            }
            });
            button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button8.setVisible(false);
                frame.remove(button8);
                b8.setBackground(Color.gray);
                b8.setBounds(200, 150, 50, 50);
                b8.setSize(50,50);
                frame.add(b8);
                 
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
