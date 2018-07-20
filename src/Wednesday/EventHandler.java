package Wednesday;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class EventHandler implements ActionListener {
     TextField T1, T2, T3;

     public EventHandler(TextField t1, TextField t2, TextField t3) {
         T1 = t1;
         T2 = t2;
         T3 = t3;
     }

     @Override
     public void actionPerformed(ActionEvent e) {
         String what;
         int No1, No2, No3=0;
         Button btn;

         No1 = Integer.parseInt(T1.getText());
         No2 = Integer.parseInt(T2.getText());

         btn = (Button) e.getSource();

         what = btn.getLabel();
         if (what.equals("+")) {
             No3 = No1 + No2;
         }
         if (what.equals("-")) {
             No3 = No1 - No2;
         }
         if (what.equals("*")) {
             No3 = No1 * No2;
         }
         if (what.equals("/")) {
             No3 = No1 / No2;
         }

         T3.setText(Integer.toString(No3));
     }
 }
