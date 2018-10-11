import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;
public class game extends JFrame {
    private Container cp;
    private JLabel jlb = new JLabel();
    private ImageIcon img = new ImageIcon("1.png");
    private ImageIcon img3 = new ImageIcon("");
    private ImageIcon img1 = new ImageIcon("12345.png");
    private ImageIcon img4 = new ImageIcon("細菌.png");
    public int yy=0;
    public int yy1=0;
    public  int xx=0;
    public  int xx1=0;

//    public  String context;
//    public  int count=0;
    class bullet extends JLabel{
//        private  game game1;
        private JLabel jlb1 = new JLabel();
        private Timer t1;
        public bullet(){
            jlb1.setIcon(img1);
//            monster m1= new monster();
//               int v1= m1.jlb2.getX();
//               int v2 =m1.jlb2.getY();

            jlb1.setBounds(jlb.getX()-99,jlb.getY()+10,150,100);
            t1 = new Timer(10, new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    cp.add( jlb1);
                    jlb1.setLocation(jlb1.getX(),jlb1.getY()-3);
                    if(jlb1.getY()<=0 ){
                        cp.remove(jlb1);
                        t1.stop();
                    }
                    xx= jlb1.getX();
                    yy= jlb1.getY();

                    if(xx==xx1 && yy==yy1 ){
                        cp.remove(jlb1);
                        jlb1.setIcon(null);
                    }
                }
            });t1.start();
        }
    }
    class show  extends  JLabel {
        private Timer t3;
        public show() {
            t3 = new Timer(2000, new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    cp.add(new monster());
                }
            });
            t3.start();
        }
    }
    class monster extends JLabel{
        private JLabel jlb2 = new JLabel();
        private Timer t2 ;
        public monster(){
//            monster m1[] = new monster[2];
//            m1[0]= new monster();
//            m1[1]= new monster();
//            for(int i=0; i<m1.length;i++){
//                m1[i]= new monster();
//            }
            Random r1 = new Random();
            int v1=r1.nextInt(200);
            jlb2.setIcon(img4);


            jlb2.setBounds(800,v1,120,60);
            t2 = new Timer(30, new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    cp.add(jlb2);
                    jlb2.setLocation(jlb2.getX()-5,jlb2.getY());
                    if(jlb2.getX()<=-10){
                        cp.remove(jlb2);
                        t2.stop();
                    }
                     xx1= jlb2.getX();
                     yy1= jlb2.getY();

                    if(xx==xx1  && yy==yy1 ){
                        cp.remove(jlb2);
                        jlb2.setIcon(null);
                    }
                }
            });
            t2.start();
        }
    }

    public game(){
        init();
    }

    public void init(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100,100,800,650);
        this.setLayout(null);
        cp = this.getContentPane();
        Image tmp = img.getImage();
        Image tmp1 = tmp.getScaledInstance(200,120,Image.SCALE_SMOOTH);
        img.setImage(tmp1);
        jlb.setIcon(img);
        jlb.setBounds(400,500,200,100);
        cp.add(jlb);
        tmp = img3.getImage();
        tmp1 = tmp.getScaledInstance(120,60,Image.SCALE_SMOOTH);
        img3.setImage(tmp1);
        tmp = img1.getImage();
        tmp1 = tmp.getScaledInstance(150,100,Image.SCALE_SMOOTH);
        img1.setImage(tmp1);
        tmp = img4.getImage();
        tmp1 = tmp.getScaledInstance(120,60,Image.SCALE_SMOOTH);
        img4.setImage(tmp1);
        cp.add(new show());
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                switch (e.getKeyCode()){
                    case 37:
                        jlb.setIcon(img);
                        jlb.setLocation(jlb.getX()-10,jlb.getY());
                        break;
                    case 39:
                        jlb.setIcon(img);
                        jlb.setLocation(jlb.getX()+10,jlb.getY());
                        break;
                    case 32:
                        cp.add(new bullet());
                        Timer t3 = new Timer(10, new AbstractAction() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });
                        break;
                }
                System.out.println(e.getKeyCode());
            }
        });
    }
}