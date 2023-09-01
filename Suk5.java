
import java.awt.*;

class ExGrid extends Frame {
    ExGrid() {
        setSize(400, 400);
        setLocation(500, 250);
        setVisible(true);
        GridLayout gl = new GridLayout(3, 2);
        Label l = new Label("Name:");
        add(l);
        TextField t = new TextField();
        add(t);

        Label l1 = new Label("Password:");
        add(l1);
        TextField t1 = new TextField();
        t1.setEchoChar('*');
        add(t1);

        Button b = new Button("Login");
        add(b);
        setLayout(gl);
    }

    public static void main(String[] args) {
        new ExGrid();
    }
}
