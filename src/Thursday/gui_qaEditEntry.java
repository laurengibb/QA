package Thursday;

import java.awt.*;

public class gui_qaEditEntry extends Parent {
    Label l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27, l28, l29, l30, l31, l32, l33, l34, l35;
    Button B1, B2;

    public gui_qaEditEntry() {
        Frame window = new Frame();
        Panel P = new Panel();
        P.setLayout(new GridLayout(8, 6));

        l1 = new Label("");
        l2 = new Label("");
        l3 = new Label("");
        l4 = new Label("");
        l5 = new Label("");
        l6 = new Label("");
        l7 = new Label("");
        l8 = new Label("RegNo: ");
        T1 = new TextField(10);
        l9 = new Label("");
        B1 = new Button("Search");
        l10 = new Label("");
        l11 = new Label("");
        l12 = new Label("");
        l13 = new Label("");
        l14 = new Label("");
        l15 = new Label("");
        l16 = new Label("");
        l17 = new Label("");
        l18 = new Label("Name: ");
        T2 = new TextField(10);
        l19 = new Label("");
        l20 = new Label("");
        l21 = new Label("");
        l22 = new Label("");
        l23 = new Label("Address: ");
        T3 = new TextField(10);
        l24 = new Label("");
        l25 = new Label("");
        l26 = new Label("");
        l27 = new Label("");
        l28 = new Label("Postcode: ");
        T4 = new TextField(10);
        l29 = new Label("");
        l30 = new Label("");
        l31 = new Label("");
        l32 = new Label("");
        l33 = new Label("");
        l34 = new Label("");
        l35 = new Label("");
        B2 = new Button("Edit");

        P.add(l1);
        P.add(l2);
        P.add(l3);
        P.add(l4);
        P.add(l5);
        P.add(l6);
        P.add(l7);
        P.add(l8);
        P.add(T1);
        P.add(l9);
        P.add(B1);
        P.add(l10);
        P.add(l11);
        P.add(l12);
        P.add(l13);
        P.add(l14);
        P.add(l15);
        P.add(l16);
        P.add(l17);
        P.add(l18);
        P.add(T2);
        P.add(l19);
        P.add(l20);
        P.add(l21);
        P.add(l22);
        P.add(l23);
        P.add(T3);
        P.add(l24);
        P.add(l25);
        P.add(l26);
        P.add(l27);
        P.add(l28);
        P.add(T4);
        P.add(l29);
        P.add(l30);
        P.add(l31);
        P.add(l32);
        P.add(l33);
        P.add(l34);
        P.add(l35);
        P.add(B2);

        eventHandler_qa eh = new eventHandler_qa(this);
        B1.addActionListener(eh);
        B2.addActionListener(eh);
        window.add(P);

        window.setSize(600, 300);
        window.setVisible(true);
        window.addWindowListener(new windowCloser());
    }
}
