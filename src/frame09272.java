import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame09272 extends JFrame {
    private Container cp;
    private  String s1 =  "abc";
    private  String s2 =  "123";
    private JTextField tf = new JTextField("");
    private JPasswordField jp = new JPasswordField("");
    private  JLabel lab1 = new JLabel("ID:");
    private  JLabel lab2 = new JLabel("PW:");
    private  JButton key = new JButton("KeyBoard");
    private  JButton login = new JButton("Login");
    private  JButton exit = new JButton("Exit");
    public frame09272(String string){
        init(string);
    }
    private void init(String string){
        cp = this.getContentPane();
        this.setBounds(300,250,600,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp.setLayout(null);
//        cp.setLayout(new BorderLayout(3,3));
        lab1.setBounds(200,100,100,50);
        lab2.setBounds(200,150,100,50);
        tf.setBounds(250,100,200,50);
        jp.setBounds(250,150,200,50);
        key.setBounds(100,200,100,50);
        login.setBounds(250,200,100,50);
        exit.setBounds(400,200,100,50);
        cp.add(lab1);
        cp.add(lab2);
        cp.add(tf);
        cp.add(jp);
        cp.add(key);
        cp.add(login);
        cp.add(exit);
        key.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame0927 frm = new frame0927(frame09272.this);
                frm.setVisible(true);
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jp.setText(string);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(s1.equals(tf.getText())&& s2.equals(jp.getText())){
                    frame1002 frm = new frame1002();
                    frm.setVisible(true);
                    frame09272.this.dispose();
                }else {
                    JOptionPane.showMessageDialog(frame09272.this,"Wrong ID or Password ,Please try again.");
                }
            }
        });
    }public void jp (String string){
        jp.setText(string);
    }
}
