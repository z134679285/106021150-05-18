import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class finaltest extends JFrame {
    private  JButton b1 = new JButton("New Game");
    private  JButton b2 =  new JButton("Option");
    private  JButton b3 = new JButton("Exit");

    public finaltest(){
        init();
    }
    private void init(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE );
        this.setLayout(null);
        this.setBounds(400,150,600,800);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        b1.setBackground(new Color(0,255,255));
        b1.setSize(200,50);
        b1.setLocation(200,200);
        b2.setBackground(new Color(0,255,255));
        b2.setSize(200,50);
        b2.setLocation(200,300);
        b3.setBackground(new Color(0,255,255));
        b3.setSize(200,50);
        b3.setLocation(200,400);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final1 frm1 = new final1();
                frm1.setVisible(true);
                finaltest.this.setVisible(false);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(EXIT_ON_CLOSE);
            }
        });

    }
}
