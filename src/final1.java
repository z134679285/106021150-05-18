import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.*;

public class final1 extends JFrame  {
//    private  boolean flag =true;
    private  Timer time;
    private  Container cp;
     private  ImageIcon icon = new ImageIcon("1.png");
    private  ImageIcon icon1 = new ImageIcon("12345.png");
    private  ImageIcon icon2 = new ImageIcon("細菌.png");
     private  JLabel lab  = new JLabel();
    private  JLabel lab3  = new JLabel();
    private  JLabel lab4  = new JLabel();
    private  JLabel lab1= new JLabel("Score:0");
    private  JLabel lab2 = new JLabel("Life:3");
    public final1(){
        init();
    }
    private    void init(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE );
        cp= this.getContentPane();
        cp.setLayout(null);
        this.setBounds(400,150,600,800);
        cp.add(lab);
        cp.add(lab4);
        lab4.setIcon(icon2);
        lab.setIcon(icon);
        lab3.setIcon(icon1);
        lab4.setBounds(300,100,100,100);
        lab.setBounds(250,650,120,80);

        Image  img =icon.getImage();
        Image img2=img.getScaledInstance(120,80,Image.SCALE_SMOOTH);
        icon.setImage(img2);

        Image  img3 =icon1.getImage();
        Image img4=img3.getScaledInstance(50,50,Image.SCALE_SMOOTH);
        icon1.setImage(img4);

        Image  img5 =icon2.getImage();
        Image img6=img5.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        icon2.setImage(img6);

        this.add(lab1);
        this.add(lab2);
        lab1.setFont(new Font(null,Font.BOLD,20));
        lab1.setForeground(Color.blue);
        lab1.setLocation(10,5);
        lab1.setSize(100,50);
        lab2.setFont(new Font(null,Font.BOLD,20));
        lab2.setForeground(Color.blue);
        lab2.setLocation(10,25);
        lab2.setSize(100,50);


        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                System.out.println(e.getKeyCode());
                switch(e.getKeyCode())

                {

                    case 37:
                        lab.setLocation(lab.getX()-10,lab.getY());
                        break;

                    case 39:
                        lab.setLocation(lab.getX()+10,lab.getY());
                        break;
                    case 38:
                        lab.setLocation(lab.getX(),lab.getY()-10);
                        break;
                    case 40:
                        lab.setLocation(lab.getX(),lab.getY()+10);
                        break;
                    case  32:
                        lab3.setBounds(lab.getX()+37,lab.getY()-40,50,50);
                        break;
                }

            }
        });
        time = new Timer(50, new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cp.add(lab3);
                lab3.setLocation(lab3.getX(),lab3.getY()-5);

            }
        });
        time.start();
    }
}
