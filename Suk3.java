
import java.awt.*;

class Suk3 extends Frame {
    Suk3() {
        setSize(400, 400);
        setVisible(true);
        GridLayout obj = new GridLayout(5, 5);
        setLayout(obj);
        setTitle("Sukhankar Frame 3");

        Label l1 = new Label("Name");
        add(l1);
        TextField t1 = new TextField();
        add(t1);
        Label l3 = new Label("Username");
        add(l3);
        TextField t3 = new TextField();
        add(t3);
        Label l4 = new Label("Password");
        add(l4);
        TextField t4 = new TextField();
        t4.setEchoChar('*');
        add(t4);

        Label l2 = new Label("Comfirm password");
        add(l2);
        TextField t2 = new TextField();
        t2.setEchoChar('*');
        add(t2);
        Button b = new Button("Create Account");
        add(b);
        Button b1 = new Button("Clear");
        add(b1);

    }

    public static void main(String[] args) {
         new Suk3();
    }

}