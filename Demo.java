import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;

public class Demo extends JFrame
{
  Demo() 
{
 Container c = getContentPane();
c.setBackground(Color.white);
c.setLayout(null);
ImageIcon im = new ImageIcon("download.jpg");
JLabel jl = new JLabel(im);
jl.setBounds(250, 10, 120, 120);
c.add(jl);
JLabel l1 = new JLabel("Sharad Institute of Technology");
l1.setBounds(160, 130, 300, 30);
l1.setForeground(Color.red);
l1.setHorizontalAlignment(JLabel.CENTER);
c.add(l1);
JLabel l2 = new JLabel("College of Engineering");
l2.setBounds(160, 160, 300, 30);
l2.setForeground(Color.blue);
l2.setHorizontalAlignment(JLabel.CENTER);
c.add(l2);
JLabel l3 = new JLabel("An Autonomous Institute");
l3.setBounds(160, 190, 300, 30);
l3.setForeground(Color.red);
l3.setHorizontalAlignment(JLabel.CENTER);
c.add(l3);
JLabel l4 = new JLabel("NAAC 'A' Grade, NBA Accredited Programs");
l4.setBounds(200, 220, 400, 30);
c.add(l4);
JLabel l5 = new JLabel("& An ISO 9001:2015 Certified Institute");
l5.setBounds(210, 250, 400, 30);
c.add(l5);
ImageIcon im1 = new ImageIcon("sukhankar1.jpg");
JLabel jl1 = new JLabel(im1);
jl1.setBounds(255, 290, 100, 120);
c.add(jl1);

JLabel jl2 = new JLabel("Name :");
jl2.setBounds(200, 420, 80, 30);
c.add(jl2);
JTextField t1 = new JTextField();
t1.setBounds(270, 420, 150, 30);
c.add(t1);
JLabel jl3 = new JLabel("Address:");
jl3.setBounds(200, 460, 80, 30);
c.add(jl3);
JTextArea ta1 = new JTextArea();
ta1.setBounds(270, 460, 150, 60);
ta1.setBorder(new LineBorder(Color.black));
c.add(ta1);
JLabel jl4 = new JLabel("Branch:");
jl4.setBounds(200, 540, 80, 30);
c.add(jl4);
String allList[] = {"CSE", "AIDS", "ENTC", "CIVIL", "A&R"};
JComboBox<String>cb = new JComboBox<>(allList);
cb.setBounds(270, 540, 150, 30);
c.add(cb);
JLabel jl5 = new JLabel("DOB :");
jl5.setBounds(200, 580, 80, 30);
c.add(jl5);
JTextField t2 = new JTextField("DD/MM/YYYY");
t2.setBounds(270, 580, 150, 30);
c.add(t2);
JLabel jl6 = new JLabel("ph./cell :");
jl6.setBounds(200, 620, 80, 30);
c.add(jl6);
JTextField t3 = new JTextField();
t3.setBounds(270, 620, 150, 30);
c.add(t3);


}

public static void main(String[] args)
{
 Demo d=new Demo();

d.setTitle("Sukhankar");
d.setVisible(true);
d.setLayout(null);
d.setSize(600,600);
d.setTitle("ID Form");
d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
