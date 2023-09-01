import java.awt.*;

class Suk2 extends Frame {
    Suk2() {
        setSize(400, 400);
        setVisible(true);
        BorderLayout obj = new BorderLayout(20, 20);
        setLayout(obj);
        setTitle("Sukhankar Frame 3");

        Button b = new Button("North");
        add(b, BorderLayout.NORTH);
        Button b1 = new Button("South");
        add(b1, BorderLayout.SOUTH);
        Button b2 = new Button("East");
        add(b2, BorderLayout.EAST);
        Button b3 = new Button("West");
        add(b3, BorderLayout.WEST);
        Button b4 = new Button("Centre");
        add(b4, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
         new Suk2();
    }

}