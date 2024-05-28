// 5:43:49 -->> https://youtu.be/xk4_1vDrzzo?list=PLi9yRdofDldH_dw6tC5jNSrbO4fFScCim 

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 0, 500, 500);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(500, 0, 500, 500);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 500, 500, 500);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
        frame.add(greenPanel);
        frame.add(redPanel);
        frame.add(bluePanel);
    }
}
