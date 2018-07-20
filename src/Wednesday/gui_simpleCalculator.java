package Wednesday;

import java.awt.*;

public class gui_simpleCalculator {
    public static void main(String[] args) {
        new gui_simpleCalculator();
    }

    public gui_simpleCalculator(){

        Frame window = new Frame();
        Panel P1 = new Panel();
        Panel P2 = new Panel();
        P2.setLayout(new GridLayout(4, 4));

        Button B0 = new Button("0");
        Button B1 = new Button("1");
        Button B2 = new Button("2");
        Button B3 = new Button("3");
        Button B4 = new Button("4");
        Button B5 = new Button("5");
        Button B6 = new Button("6");
        Button B7 = new Button("7");
        Button B8 = new Button("8");
        Button B9 = new Button("9");
        Button B10 = new Button("+");
        Button B11 = new Button("-");
        Button B12 = new Button("*");
        Button B13 = new Button("/");
        Button B14 = new Button("=");
        Button B15 = new Button("C");

        P2.add(B0);
        P2.add(B1);
        P2.add(B2);
        P2.add(B3);
        P2.add(B4);
        P2.add(B5);
        P2.add(B6);
        P2.add(B7);
        P2.add(B8);
        P2.add(B9);
        P2.add(B10);
        P2.add(B11);
        P2.add(B12);
        P2.add(B13);
        P2.add(B14);
        P2.add(B15);

        TextField T = new TextField(20);
        P1.add(T);

        eventHandler_simpleCalculator eh = new eventHandler_simpleCalculator(T);
        B0.addActionListener(eh);
        B1.addActionListener(eh);
        B2.addActionListener(eh);
        B3.addActionListener(eh);
        B4.addActionListener(eh);
        B5.addActionListener(eh);
        B6.addActionListener(eh);
        B7.addActionListener(eh);
        B8.addActionListener(eh);
        B9.addActionListener(eh);
        B10.addActionListener(eh);
        B11.addActionListener(eh);
        B12.addActionListener(eh);
        B13.addActionListener(eh);
        B14.addActionListener(eh);
        B15.addActionListener(eh);

        window.add(P1, BorderLayout.NORTH);
        window.add(P2);

        window.setSize(600,600);
        window.setVisible(true);
    }
}
