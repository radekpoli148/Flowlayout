package flowlayout2;

import javax.swing.*;
import java.awt.*;

public class Flowlayout2 extends JFrame {

    public Flowlayout2()
    {
        super("FlowLayout");
        this.setBounds(300, 320, 300, 200);
        
        initComponents();
        //this.pack();
        this.setDefaultCloseOperation(3);
    }
    public void initComponents()
    {
        button1.setPreferredSize(new Dimension(100, 100));
        button2.setPreferredSize(button2.getPreferredSize());
        panel1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        
        this.getContentPane().add(panel1, BorderLayout.CENTER);
    }
    
    JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEADING));
    
    JButton button1 = new JButton("Button1");
    JButton button2 = new JButton("Button2");
    JButton button3 = new JButton("Button3");
    JButton button4 = new JButton("Button4");

    public static void main(String[] args) {
        new Flowlayout2().setVisible(true);
    }
    
}
