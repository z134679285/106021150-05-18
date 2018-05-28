import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame6  extends JFrame{
    private  JLabel lab =new JLabel("0",SwingConstants.RIGHT);
    private JButton jb1 = new JButton("0");
    private JButton jb2 = new JButton(".");
    private JButton jb3 = new JButton("=");
    private JButton jb4 = new JButton("+");
    private JButton jb5 = new JButton("Exit");
    private JButton jb6 = new JButton("1");
    private JButton jb7 = new JButton("2");
    private JButton jb8 = new JButton("3");
    private JButton jb9 = new JButton("-");
    private JButton jb10 = new JButton("PI");
    private JButton jb11 = new JButton("4");
    private JButton jb12 = new JButton("5");
    private JButton jb13 = new JButton("6");
    private JButton jb14 = new JButton("*");
    private JButton jb15 = new JButton("sqrt");
    private JButton jb16 = new JButton("7");
    private JButton jb17 = new JButton("8");
    private JButton jb18 = new JButton("9");
    private JButton jb19 = new JButton("/");
    private JButton jb20 = new JButton("AC");
    private JPanel  jb21= new JPanel();
    private JButton tmp = new JButton();
    private JPanel  jb22= new JPanel(new GridLayout(4,4,4,4));
    private  Container cp;
    public  frame6(){
        init();
    }
    private  void init(){

        this.setBounds(100,100,400,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp =this.getContentPane();
        cp.setLayout(new BorderLayout(4,5));
        jb22.setLayout(new GridLayout(4,4,4,4));
        cp.add(lab, BorderLayout.NORTH);
        lab.setFont(new Font(null,Font.BOLD,32));
        cp.add(jb22, BorderLayout.CENTER);
        jb22.add(jb16);
        jb22.add(jb17);
        jb22.add(jb18);
        jb22.add(jb19);
        jb22.add(jb20);
        jb22.add(jb11);
        jb22.add(jb12);
        jb22.add(jb13);
        jb22.add(jb14);
        jb22.add(jb15);
        jb22.add(jb6);
        jb22.add(jb7);
        jb22.add(jb8);
        jb22.add(jb9);
        jb22.add(jb10);
        jb22.add(jb1);
        jb22.add(jb2);
        jb22.add(jb3);
        jb22.add(jb4);
        jb22.add(jb5);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lab.setText(lab.getText() + Integer.toString(0));
                }
        });
        jb2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed (ActionEvent actionEvent){
            lab.setText(lab.getText() + ".");
        }

        });
        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lab.setText(lab.getText() + "=");
            }
        });
        jb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lab.setText(lab.getText() + "+");
            }
        });
        jb5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(EXIT_ON_CLOSE);
            }
        });
        jb6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lab.setText(lab.getText() + Integer.toString(1));
            }
        });
        jb7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lab.setText(lab.getText() + Integer.toString(2));
            }
        });
        jb8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lab.setText(lab.getText() + Integer.toString(3));
            }
        });
        jb9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lab.setText(lab.getText() + "-");
            }
        });
        jb10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lab.setText(lab.getText() + Math.PI);
            }
        });
        jb11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lab.setText(lab.getText() + Integer.toString(4));
            }
        });
        jb12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lab.setText(lab.getText() + Integer.toString(5));
            }
        });
        jb13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lab.setText(lab.getText() + Integer.toString(6));
            }
        });
        jb14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lab.setText(lab.getText() + "*");
            }
        });
        jb15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        jb16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lab.setText(lab.getText() + Integer.toString(7));
            }
        });
        jb17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lab.setText(lab.getText() + Integer.toString(8));
            }
        });
        jb18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lab.setText(lab.getText() + Integer.toString(9));
            }
        });
        jb19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lab.setText(lab.getText() + "/");
            }
        });
        jb20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lab.setText("0");
            }
        });
    }
}