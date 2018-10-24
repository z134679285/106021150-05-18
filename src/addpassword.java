import javafx.stage.FileChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class addpassword extends JFrame {
    private JMenuBar jmb=new JMenuBar() ;
    private  JMenu use =new JMenu("File");
    private  JMenuItem  j1 = new JMenuItem("New");
    private  JMenuItem  j2 = new JMenuItem("Open");
    private  JMenuItem  j3 = new JMenuItem("Save");
    private  JMenuItem  j4 = new JMenuItem("Exit");
    private String[] stra = {"Caesar","DES","RSA","XOR"};
    private JTextField jf = new JTextField("");
    private JTextArea  area1 = new JTextArea("");
    private JTextArea  area2 = new JTextArea("");
    private JScrollPane sp1 = new JScrollPane(area1);
    private  JScrollPane sp2 = new JScrollPane(area2);
    private  JLabel lab1 = new JLabel("Method");
    private  JLabel  lab2 = new JLabel("Password");
    private  JRadioButton rb1 = new JRadioButton("Encrypt");
    private  JRadioButton rb2 = new JRadioButton("Decrypt");
    private   ButtonGroup gp = new ButtonGroup();
    private   JComboBox box = new JComboBox(stra);
    private  JButton run =  new JButton("Run");
    private  JButton exit = new JButton("Exit");
    private Container cp;
    private JFileChooser jc = new JFileChooser();
    public addpassword(){
        init();
    }
    private void init(){
     cp = this.getContentPane();
     this.setBounds(200,200,800,600);
     this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     cp.setLayout(null);
     sp1.setBounds(0,0,300,600);
     sp2.setBounds(500,0,300,600);
     lab1.setBounds(360,20,100,50);
     lab1.setFont(new Font(null,Font.BOLD,16));
     box.setBounds(355,60,100,50);
     lab2.setBounds(360,150,100,50);
     lab2.setFont(new Font(null,Font.BOLD,16));
     jf.setBounds(355,200,100,50);
     rb1.setBounds(355,250,100,50);
     rb1.setFont(new Font(null,Font.BOLD,16));
     rb2.setBounds(355,300,100,50);
     rb2.setFont(new Font(null,Font.BOLD,16));
     run.setBounds(355,350,100,50);
     exit.setBounds(355,400,100,50);
     cp.add(lab1);
     cp.add(lab2);
     cp.add(sp1);
     cp.add(sp2);
     cp.add(box);
     cp.add(jf);
     cp.add(rb1);
     cp.add(rb2);
     cp.add(run);
     cp.add(exit);
     gp.add(rb1);
     gp.add(rb2);
     this.setJMenuBar(jmb);
     jmb.add(use);
     use.add(j1);
     use.add(j2);
     use.add(j3);
     use.add(j4);
     exit.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             System.exit(0);
         }
     });
        j2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (jc.showOpenDialog(null) == jc.APPROVE_OPTION) {
                        String str;

                        FileReader fr= new FileReader(jc.getSelectedFile());
                        BufferedReader bfr = new BufferedReader(fr);
                        while ((str = bfr.readLine())!=null){
                            area1.setText(str);
                        }
                        fr.close();
                    }
                }catch (ArrayIndexOutOfBoundsException e1){
                       JOptionPane.showMessageDialog(addpassword.this,"open error");
                }catch (Exception e2){
                    JOptionPane.showMessageDialog(addpassword.this,"error");
                }
            }
        });
        j3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(jc.showSaveDialog(null) ==jc.APPROVE_OPTION ){
                             FileWriter fr= new FileWriter(jc.getSelectedFile());
                             BufferedWriter bfr = new BufferedWriter(fr);
                             bfr.write(area1.getText());
                             bfr.close();
                    }
                }catch (ArrayIndexOutOfBoundsException e1){
                    JOptionPane.showMessageDialog(addpassword.this,"save error");
                }catch (Exception e2){
                    JOptionPane.showMessageDialog(addpassword.this," error");
                }
            }
        });
     rb1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             rb1.setSelected(true);
         }
     });
     rb2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             rb2.setSelected(true);
         }
     });
     run.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             switch (box.getSelectedIndex()){
                 case 0 :
                     try {
                         if(rb1.isSelected()) {
                             final int N = Integer.parseInt(area1.getText());
                             final char[] S = area1.getText().toCharArray();
                             final int K = Integer.parseInt(jf.getText());
                             for (int i = 0; i <N; i++) {
                                 char c = S[i];
                                 if (c >= 'A' && c <= 'Z') {
                                     final int v = c - 'A';
                                     c = (char) ((v + K) % 26 + 'A');
                                 } else if (c >= 'a' && c <= 'z') {
                                     final int v = c - 'a';
                                     c = (char) ((v + K) % 26 + 'a');
                                 }
                                 String str = Integer.toString(c);
                                 area2.setText(area2.getText()+str);
                             }
                         } else if(rb2.isSelected()){

                         }
                     }catch (ArrayIndexOutOfBoundsException e1){
                       JOptionPane.showMessageDialog(addpassword.this,"Caesar error");
                     }catch (Exception e2){
                         JOptionPane.showMessageDialog(addpassword.this,"error");
                     }

                 case 1:

                 case 2:

                 case 3:
                     if(rb1.isSelected()){
                         char data[]= area1.getText().toCharArray();
                         char key[]=jf.getText().toCharArray();
                         for(int i=0;i<data.length;i++){
                             data[i]=(char)((int)data[i]^(int)key[i%key.length]);
                         }area2.setText(new String(data));

                 }
             }

         }
     });
    }
}
