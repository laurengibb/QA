package Wednesday;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.*;

public class eventHandler_simpleCalculator implements ActionListener {
    TextField T;
    String calculation = "";

    public eventHandler_simpleCalculator(TextField t) {
        T = t;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String label;
        Button btn;
        //String calculation = "";

        btn = (Button) e.getSource();
        label = btn.getLabel();

        if (label.equals("0")) {
            calculation += "0";
        }
        else if (label.equals("1")) {
            calculation += "1";
        }
        else if (label.equals("2")) {
            calculation += "2";
        }
        else if (label.equals("3")) {
            calculation += "3";
        }
        else if (label.equals("4")) {
            calculation += "4";
        }
        else if (label.equals("5")) {
            calculation += "5";
        }
        else if (label.equals("6")) {
            calculation += "6";
        }
        else if (label.equals("7")) {
            calculation += "7";
        }
        else if (label.equals("8")) {
            calculation += "8";
        }
        else if (label.equals("9")) {
            calculation += "9";
        }
        else if (label.equals("+")) {
            calculation += "+";
        }
        else if (label.equals("-")) {
            calculation += "-";
        }
        else if (label.equals("*")) {
            calculation += "*";
        }
        else if (label.equals("/")) {
            calculation += "/";
        }
        else if (label.equals("=")) {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            try{
                calculation = String.valueOf(engine.eval(calculation));
            }
            catch (ScriptException x){
            }
        }
        else if (label.equals("C")) {
            calculation = "";
        }

        T.setText(calculation);
    }
}
