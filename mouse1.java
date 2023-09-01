import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class mouse1 extends Frame implements MouseListener
 {
    mouse1()
    {
        setSize(500,500);
        setVisible(true);
    
        addMouseListener(this);

    }
    public void mouseClicked(MouseEvent ae)
    {
        this.setBackground(Color.RED);
    

        
    }
    public void mousePressed(MouseEvent e){
        this.setBackground(Color.BLACK);
    }
    public void mouseReleased(MouseEvent e)
    {
        this.setBackground(Color.CYAN);
    }
    public void mouseEntered(MouseEvent e){
        this.setBackground(Color.MAGENTA);
    }
    public void mouseExited(MouseEvent e){
        this.setBackground(Color.GREEN);
    }

    public static void main(String[] args) 
    {
        new mouse1();
    }
 
   
}
