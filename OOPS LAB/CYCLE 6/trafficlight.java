import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TrafficLight implements ActionListener {
    JFrame jf;
    JRadioButtonMenuItem r1, r2, r3;
    JLabel l1;

    TrafficLight() {
        jf = new JFrame();
        jf.setSize(350, 200);
        jf.setTitle("Traffic Lights");
        FlowLayout FL = new FlowLayout(FlowLayout.CENTER, 20, 20);
        jf.setLayout(FL);

        l1 = new JLabel("", SwingConstants.CENTER);
        l1.setFont(new Font("Arial", Font.BOLD, 30));
        l1.setPreferredSize(new Dimension(200, 100));

        r1 = new JRadioButtonMenuItem("RED");
        r2 = new JRadioButtonMenuItem("YELLOW");
        r3 = new JRadioButtonMenuItem("GREEN");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        jf.add(l1);
        jf.add(r1);
        jf.add(r2);
        jf.add(r3);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == r1) {
            l1.setText("RED");
            l1.setBackground(Color.RED);
            l1.setOpaque(true);
        } else if (ae.getSource() == r2) {
            l1.setText("YELLOW");
            l1.setBackground(Color.YELLOW);
            l1.setOpaque(true);
        } else if (ae.getSource() == r3) {
            l1.setText("GREEN");
            l1.setBackground(Color.GREEN);
            l1.setOpaque(true);
        }
    }

    public static void main(String[] args) {
        new TrafficLight();
    }
}

