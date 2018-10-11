import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame1002 extends JFrame {
    private Container cp;
    private JMenuBar jmb=new JMenuBar() ;
    private  JMenu use =new JMenu("File");
    private  JMenu seeltRun = new JMenu("Edit");
    private  JMenu build  = new JMenu("View");
    private  JMenu  game = new JMenu("Game");
    private  JMenuItem  j1 = new JMenuItem("New");
    private  JMenuItem  j2 = new JMenuItem("Open");
    private  JMenuItem  j3 = new JMenuItem("Exit");
    private  JMenuItem  g1 = new JMenuItem("OX Game");

     public  frame1002(){
         init();
     }
     private void init(){
         cp = this.getContentPane();
         this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         this.setBounds(100,100,800,600);
         this.setLayout(null);
         jmb.add(game);
         jmb.add(use);
         jmb.add(seeltRun);
         jmb.add(build);
         use.add(j1);
         use.add(j2);
         use.add(j3);
         game.add(g1);
         this.setJMenuBar(jmb);
         j2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 JFileChooser jf =new JFileChooser();
                 Component par =null;
                 jf.showOpenDialog(par);
             }
         });
         g1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 frame09202 fm = new frame09202(frame1002.this);
                 fm.setVisible(true);
                 setVisible(false);
             }
         });
     }
}
