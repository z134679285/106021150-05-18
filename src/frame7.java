import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class frame7 extends JFrame {
    private float m;
    private JPanel jpnc = new JPanel();
    private boolean flag = false;
    private int objx=280 , objy=0 , tarx, tary;
    private Container cp;
    private JLabel lab = new JLabel();
    private ImageIcon icon = new ImageIcon("123.png");
    private Timer time;
    public frame7() {
        init();
    }
    public void init() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(100, 50, 800, 800);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(2, 2));
        cp.add(jpnc, BorderLayout.CENTER);
        lab.setBounds(objx,objy,222,167);
        jpnc.add(lab);
        lab.setIcon(icon);
        time = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Math.abs(objx - tarx) < 30 && Math.abs(objy - tary) < 30) {
                    time.stop();
                    flag = false;
                }else if (objx>tarx){
                    objy=(int)(m*(-5)+objy);
                    objx-=5;
                    lab.setLocation(objx,objy);
                    System.out.println(tarx);
                    System.out.println(tary);
                }else {
                    objy=(int)(m*5+objy);
                    objx+=5;
                    lab.setLocation(objx,objy);
                }
            }
        });
        lab.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                flag = true;
            }
        });
        jpnc.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (flag) {
                    tarx = e.getX();
                    tary = e.getY();
                    time.start();
                    m = (float) (tary - objy) / (float) (tarx - objx); }
            }
        });
    }
}