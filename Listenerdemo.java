import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class Listenerdemo extends Frame implements ActionListener
 { TextField t1,t2,t3;
    Button bt;
Listenerdemo()
{

    setSize(500,500);
    setVisible(true);
t1=new TextField(15);
t1.setBounds(20,100,80,30);
t2=new TextField(15);
t2.setBounds(20,150,80,30);
t3=new TextField(15);
t3.setBounds(20,200,80,30);
bt=new Button("add");
bt.setBounds(20,260,80,30);
add(t1);
add(t2);
add(t3);
add(bt);
bt.addActionListener(this);
}
public void actionPerformed(ActionEvent ae )
{
    int a=Integer.parseInt(t1.getText());
    int b=Integer.parseInt(t2.getText());
    int c=a+b;
    t3.setText(" "+c);
}
public static void main(String[] args)
{
    new Listenerdemo();

}
} 

