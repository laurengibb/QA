package Friday;

import javax.swing.*;

public class frames {
    JFrame F = new JFrame("Hello");
    JMenuBar Bar = new JMenuBar();
    JMenu menu1 = new JMenu("Operations1");
    JMenu menu2 = new JMenu("Operations2");
    JMenuItem M1 = new JMenuItem("Additions");
    JMenuItem M2 = new JMenuItem("Subtraction");
    JMenuItem M3 = new JMenuItem("Multiply");
    JMenuItem M4 = new JMenuItem("Divide");

    public frames() {
        menu1.add(M1);
        menu1.add(M2);
        menu2.add(M3);
        menu2.add(M4);

        Bar.add(menu1);
        Bar.add(menu2);

        F.setJMenuBar(Bar);

        F.setSize(300, 300);
        F.setVisible(true);
    }

    public static void main(String[] args) {

        new frames();

    }
}
