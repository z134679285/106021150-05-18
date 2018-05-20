import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class frame5 extends JFrame {
     private  JButton b1 = new JButton("Generate");
    private  JButton b2 = new JButton("Exit");
    private Container cp;
    private JPanel jpnc = new JPanel();
    private JPanel jpnr = new JPanel(new GridLayout(1, 6, 2, 2));
    private JLabel lab[] = new JLabel[6];
    private Random random = new Random();
    public frame5(){
        init();
    }

    private  void init(){
       this.setBounds(200,200,600,150);
       this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(2, 2));
        cp.add(jpnc, BorderLayout.CENTER);
        cp.add(jpnr, BorderLayout.SOUTH);
        jpnc.setLayout(new GridLayout(1, 6, 2, 2));
        jpnr.add(b1);
        jpnr.add(b2);
        for(int i=0 ;i<6 ;i++){
            lab[i] = new JLabel("0",SwingConstants.CENTER);
            jpnc.add(lab[i]);
            lab[i].setText(Integer.toString(random.nextInt(49)+1));
            lab[i].setBackground(new Color(0, 255, 239));
            lab[i].setFont(new Font(null, Font.BOLD, 36));
            lab[i].setOpaque(true);
        }
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for (int i = 0; i < 6; i++) {
                    lab[i].setText(Integer.toString(random.nextInt(49) + 1));
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(EXIT_ON_CLOSE);
            }
        });

    }
}
