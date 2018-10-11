import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class frame09202 extends JFrame {
    private Container cp;
    private  JLabel label = new JLabel("game");
//    private  JPanel pane = new JPanel(new GridLayout(3,3,3,3));
    private  JButton button[][] = new JButton[3][3];
    private JPanel jpnc = new JPanel();
    private  boolean flag =true;

    public  frame09202(frame1002 frm){
        initComp(frm);
    }

    private  void initComp(frame1002 frm){
        cp = this.getContentPane();
        this.setBounds(200,200,600,600);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        cp.setLayout(new BorderLayout(3,3));
        cp.add(label, BorderLayout.NORTH);
        jpnc.setLayout(new GridLayout(3, 3, 3, 3));
        label.setOpaque(true);
        label.setBackground( new Color(2, 0, 255));
        label.setFont(new Font(null,Font.BOLD,48));
        cp.add(jpnc,BorderLayout.CENTER);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame1002 frm =new frame1002();
                frm.setVisible(true);
                setVisible(false);
            }
        });

        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                button[i][j] = new JButton();
                button[i][j].setFont(new Font(null,Font.BOLD,36));
                jpnc.add(button[i][j]);
//                button[i][j].setEnabled(false);
                button[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton tmp = (JButton) e.getSource();//取得上次執行的資料
                        if (tmp.getText().equals("")) {
                            if (flag) {
                                tmp.setText("o");
                                tmp.setBackground(new Color(222, 215, 0));
                            } else {
                                tmp.setText("x");
                                tmp.setBackground(new Color(34, 222, 2));
                            }
                            flag = !flag;
                        }
                        check();
                    }
                });
                button[i][j].setBackground(new Color(255,8,25));
                }
            }

    }private  void check(){
        if (button[0][0].getText().equals(button[0][1].getText()) &&
                button[0][0].getText().equals(button[0][2].getText()) && !button[0][0].getText().equals("")) {
            JOptionPane.showMessageDialog(frame09202.this, button[0][0].getText() + ("  win!"));
        } else if(button[1][0].getText().equals(button[1][1].getText()) &&
                button[1][0].getText().equals(button[1][2].getText()) && !button[1][0].getText().equals(""))
            JOptionPane.showMessageDialog(frame09202.this, button[1][0].getText() + ("  win!"));
        else if(button[2][0].getText().equals(button[2][1].getText()) &&
                button[2][0].getText().equals(button[2][2].getText()) && !button[2][0].getText().equals(""))
            JOptionPane.showMessageDialog(frame09202.this, button[2][0].getText() + ("  win!"));
        else if(button[0][0].getText().equals(button[1][0].getText()) &&
                button[0][0].getText().equals(button[2][0].getText()) && !button[0][0].getText().equals(""))
            JOptionPane.showMessageDialog(frame09202.this, button[0][0].getText() + ("  win!"));
        else if(button[0][1].getText().equals(button[1][1].getText()) &&
                button[0][1].getText().equals(button[2][1].getText()) && !button[0][1].getText().equals(""))
            JOptionPane.showMessageDialog(frame09202.this, button[0][1].getText() + ("  win!"));
        else if(button[0][2].getText().equals(button[1][2].getText()) &&
                button[0][2].getText().equals(button[2][2].getText()) && !button[0][2].getText().equals(""))
            JOptionPane.showMessageDialog(frame09202.this, button[0][2].getText() + ("  win!"));
        else if(button[0][0].getText().equals(button[1][1].getText()) &&
                button[0][0].getText().equals(button[2][2].getText()) && !button[0][0].getText().equals(""))
            JOptionPane.showMessageDialog(frame09202.this, button[0][0].getText() + ("  win!"));
        else if(button[0][2].getText().equals(button[1][1].getText()) &&
                button[0][2].getText().equals(button[2][0].getText()) && !button[0][2].getText().equals(""))
            JOptionPane.showMessageDialog(frame09202.this, button[0][2].getText() + ("  win!"));
  }
}

