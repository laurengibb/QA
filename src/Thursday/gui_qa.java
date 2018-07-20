package Thursday;

import java.awt.*;

public class gui_qa {
    public static void main(String[] args) {
        new gui_qa();
    }

    public gui_qa(){

        // database
        databaseConnect.buildConnection();
        //
        Frame window = new Frame();
        Panel P = new Panel();
        P.setLayout(new GridLayout(9, 3));

        Label l1 = new Label("");
        Label l2 = new Label("");
        Label l3 = new Label("");
        Label l4 = new Label("");
        Button B1 = new Button("Add Entry");
        Label l5 = new Label("");
        Label l6 = new Label("");
        Label l7 = new Label("");
        Label l8 = new Label("");
        Label l9 = new Label("");
        Button B2 = new Button("View Entry");
        Label l10 = new Label("");
        Label l11 = new Label("");
        Label l12 = new Label("");
        Label l13 = new Label("");
        Label l14 = new Label("");
        Button B3 = new Button("Edit an Entry");
        Label l15 = new Label("");
        Label l16 = new Label("");
        Label l17 = new Label("");
        Label l18 = new Label("");
        Label l19 = new Label("");
        Button B4 = new Button("Delete an Entry");
        Label l20 = new Label("");
        Label l21 = new Label("");
        Label l22 = new Label("");
        Label l23 = new Label("");

        P.add(l1);
        P.add(l2);
        P.add(l3);
        P.add(l4);
        P.add(B1);
        P.add(l5);
        P.add(l6);
        P.add(l7);
        P.add(l8);
        P.add(l9);
        P.add(B2);
        P.add(l10);
        P.add(l11);
        P.add(l12);
        P.add(l13);
        P.add(l14);
        P.add(B3);
        P.add(l15);
        P.add(l16);
        P.add(l17);
        P.add(l18);
        P.add(l19);
        P.add(B4);
        P.add(l20);
        P.add(l21);
        P.add(l22);
        P.add(l23);

        eventHandler_qa eh = new eventHandler_qa();
        B1.addActionListener(eh);
        B2.addActionListener(eh);

        B3.addActionListener(eh);
        B4.addActionListener(eh);

        window.add(P);

        window.setSize(600,600);
        window.setVisible(true);
        window.addWindowListener(new windowCloser());
    }
}
