package Wednesday;

import java.awt.*;

public class gui_calculator {
    public static void main(String[] args) {

        new gui_calculator();
    }

    public gui_calculator(){

        Frame window = new Frame();
        window.setLayout(new FlowLayout());

        TextField T1, T2, T3;
        Label l1, l2,l3;
        l1 = new Label("no.1:");
        l2 = new Label("no.2:");
        l3 = new Label("Result:");
        T1 = new TextField(10);
        T2 = new TextField(10);
        T3 = new TextField(10);
        Button B1 = new Button("+");
        Button B2 = new Button("-");
        Button B3 = new Button("*");
        Button B4 = new Button("/");

        EventHandler eh = new EventHandler(T1, T2, T3);
        B1.addActionListener(eh);
        B2.addActionListener(eh);
        B3.addActionListener(eh);
        B4.addActionListener(eh);


        window.add(l1);
        window.add(T1);
        window.add(l2);
        window.add(T2);
        window.add(B1);
        window.add(B2);
        window.add(B3);
        window.add(B4);
        window.add(l3);
        window.add(T3);

        window.setSize(600,100);
        window.setVisible(true);

    }
}
