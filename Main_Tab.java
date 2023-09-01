import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import javax.swing.tree.DefaultMutableTreeNode;




class Tab1 extends JPanel
{
Tab1()
{

DefaultMutableTreeNode root=new DefaultMutableTreeNode("Country");


DefaultMutableTreeNode a =new DefaultMutableTreeNode("India");

DefaultMutableTreeNode b=new DefaultMutableTreeNode("USA");

DefaultMutableTreeNode a1=new DefaultMutableTreeNode("Maharashtra");

DefaultMutableTreeNode aa1=new DefaultMutableTreeNode("Sangli");
DefaultMutableTreeNode aaa2=new DefaultMutableTreeNode("Miraj");

DefaultMutableTreeNode aa2=new DefaultMutableTreeNode("Pune");

DefaultMutableTreeNode a2=new DefaultMutableTreeNode("Delhi");

DefaultMutableTreeNode b1=new DefaultMutableTreeNode("New York");

a.add(a1);
a1.add(aa2);
a1.add(aa1);
aa1.add(aaa2);
a.add(a2);
b.add(b1);
root.add(a);
root.add(b);
JTree j=new JTree(root);
add(j);
}
}

class Tab2 extends JPanel
{
Tab2()
{  
String row[][]={ {"101","Sukhankar","85000"}, {"102","Harsh","80000"}, {"101","Sajjad","70000"}};    
String column[]={"ID","NAME","SALARY"};  
       
    JTable jta=new JTable(row,column);    
    jta.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jta);    
   add(sp);          
}
}

class Tab3 extends JPanel
{
Tab3()
{
GridLayout obj = new GridLayout(5, 5);
        setLayout(obj);
     

        JLabel l1 = new JLabel("Name");
	add(l1);
        
        JTextField t1 = new JTextField();
	t1.setToolTipText("Enter your name");
        add(t1);

        JLabel l3 = new JLabel("Username");
        add(l3);

        JTextField t3 = new JTextField();
	t3.setToolTipText("Enter your Username");
        add(t3);

        JLabel l4 = new JLabel("Password");
        add(l4);

       JPasswordField t4=new JPasswordField();
	t4.setToolTipText("Enter your password");
   
        add(t4);

        JLabel l2 = new JLabel("Comfirm password");
        add(l2);
        JTextField t2 = new JTextField();

        add(t2);
        JButton b = new JButton("Create Account");
        add(b);
        JButton b1 = new JButton("Clear");
        add(b1);
}
}

class Tab4 extends JPanel
{
Tab4()
{
                
setBackground(Color.white);
setLayout(null);
ImageIcon im = new ImageIcon("download.jpg");
JLabel jl = new JLabel(im);
jl.setBounds(250, 10, 120, 120);
add(jl);
JLabel l1 = new JLabel("Sharad Institute of Technology");
l1.setBounds(160, 130, 300, 30);
l1.setForeground(Color.red);
l1.setHorizontalAlignment(JLabel.CENTER);
add(l1);
JLabel l2 = new JLabel("College of Engineering");
l2.setBounds(160, 160, 300, 30);
l2.setForeground(Color.blue);
l2.setHorizontalAlignment(JLabel.CENTER);
add(l2);
JLabel l3 = new JLabel("An Autonomous Institute");
l3.setBounds(160, 190, 300, 30);
l3.setForeground(Color.red);
l3.setHorizontalAlignment(JLabel.CENTER);
add(l3);
JLabel l4 = new JLabel("NAAC 'A' Grade, NBA Accredited Programs");
l4.setBounds(200, 220, 400, 30);
add(l4);
JLabel l5 = new JLabel("& An ISO 9001:2015 Certified Institute");
l5.setBounds(210, 250, 400, 30);
add(l5);
ImageIcon im1 = new ImageIcon("sukhankar1.jpg");
JLabel jl1 = new JLabel(im1);
jl1.setBounds(255, 290, 100, 120);
add(jl1);

JLabel jl2 = new JLabel("Name :");
jl2.setBounds(200, 420, 80, 30);
add(jl2);
JTextField t1 = new JTextField();
t1.setBounds(270, 420, 150, 30);
add(t1);
JLabel jl3 = new JLabel("Address:");
jl3.setBounds(200, 460, 80, 30);
add(jl3);
JTextArea ta1 = new JTextArea();
ta1.setBounds(270, 460, 150, 60);
ta1.setBorder(new LineBorder(Color.black));
add(ta1);
JLabel jl4 = new JLabel("Branch:");
jl4.setBounds(200, 540, 80, 30);
add(jl4);
String allList[] = {"CSE", "AIDS", "ENTC", "CIVIL", "A&R"};
JComboBox<String>cb = new JComboBox<>(allList);
cb.setBounds(270, 540, 150, 30);
add(cb);
JLabel jl5 = new JLabel("DOB :");
jl5.setBounds(200, 580, 80, 30);
add(jl5);
JTextField t2 = new JTextField("DD/MM/YYYY");
t2.setBounds(270, 580, 150, 30);
add(t2);
JLabel jl6 = new JLabel("ph./cell :");
jl6.setBounds(200, 620, 80, 30);
add(jl6);
JTextField t3 = new JTextField();
t3.setBounds(270, 620, 150, 30);
add(t3);
}
}



class Main_Tab extends JFrame
{
Main_Tab()
{
setSize(500,500);
setVisible(true);
setTitle("Sukhankar Frame");


Tab1 ta1=new Tab1();
Tab2 ta2=new Tab2();
Tab3 ta3=new Tab3();
Tab4 ta4=new Tab4();
JTabbedPane jt=new JTabbedPane();

jt.addTab("Tree",ta1);
jt.addTab("Table",ta2);
jt.addTab("Login page",ta3);
jt.addTab("ID Form",ta4);
add(jt);
}
public static void main(String[] args)
{
new Main_Tab();
}
} 




