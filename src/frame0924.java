import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame0924 extends JFrame {
    private String string = "";
    private String s1="25355277";
    private Container cp;
    private JPasswordField tf = new JPasswordField("");
//    private TextField tf = new TextField("");
    private JButton b1 = new JButton("0");
    private JButton b2 = new JButton("1");
    private JButton b3 = new JButton("2");
    private JButton b4 = new JButton("3");
    private JButton b5 = new JButton("4");
    private JButton b6 = new JButton("5");
    private JButton b7 = new JButton("6");
    private JButton b8 = new JButton("7");
    private JButton b9 = new JButton("8");
    private JButton b10 = new JButton("9");
    private JButton b11 = new JButton("submit");
    private JButton b12 = new JButton("exit");
    private JButton button[][] = new JButton[3][4];
    private  JPanel pane = new JPanel();

    public  frame0924(){
        init();
    }
    private void init(){
        cp = this.getContentPane();
        this.setBounds(200,200,600,400);
        cp.setLayout(new BorderLayout(3,3));
        cp.add(tf, BorderLayout.NORTH);
        tf.setFont(new Font(null,Font.BOLD,24));
        pane.setLayout(new GridLayout(3,4,5,5));
        cp.add(pane,BorderLayout.CENTER);
        pane.add(b1);
        pane.add(b2);
        pane.add(b3);
        pane.add(b4);
        pane.add(b5);
        pane.add(b6);
        pane.add(b7);
        pane.add(b8);
        pane.add(b9);
        pane.add(b10);
        pane.add(b11);
        pane.add(b12);
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(string+b1.getText());
                string = tf.getText();
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(string+b2.getText());
                string = tf.getText();
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(string+b3.getText());
                string = tf.getText();
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(string+b4.getText());
                string = tf.getText();
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(string+b5.getText());
                string = tf.getText();
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(string+b6.getText());
                string = tf.getText();
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(string+b7.getText());
                string = tf.getText();
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(string+b8.getText());
                string = tf.getText();
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(string+b9.getText());
                string = tf.getText();
            }
        });
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(string+b10.getText());
                string = tf.getText();
            }
        });
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             if(s1.equals(tf.getText())){
                 JOptionPane.showMessageDialog(null,"恭喜你成功了");
             }
            }
        });

    }

}
