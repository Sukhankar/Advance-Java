import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Key1 extends Frame implements KeyListener 
{
    Label l1;
    TextField t1,t2;
    Key1()
    {
        setSize(500,500);
    setVisible(true);
    t1=new TextField(15);
    t1.setBounds(20,100,80,30);
        add(t1);
     l1 = new Label();        
    l1.setBounds(80,200,80,30);
        add(l1);
       t1.addKeyListener(this);
    }
    public void keyPressed(KeyEvent e)
    {
      //System.out.println("key pressed");  this for cmd
      l1.setText("Key is pressed");
    }
    public void keyReleased(KeyEvent e)
    {
        //System.out.println("key is released");  this for cmd
        l1.setText("Key is Released");
    }
    public void keyTyped(KeyEvent e)
    {
       // System.out.println("key is typed"); this for cmd
       l1.setText("Key is Typed");
    }
   
    
public static void main(String[] args)
{
    new Key1();
}   
   
   
}
