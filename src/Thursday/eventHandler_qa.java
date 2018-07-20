package Thursday;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class eventHandler_qa implements ActionListener {
    gui_qaAddEntry add;
    gui_qaDeleteEntry del;
    gui_qaEditEntry edit;
    gui_qaViewEntry view;
    static String currentFrame;

    public eventHandler_qa(){ }

    public eventHandler_qa(gui_qaAddEntry add) {
        this.add = add;
    }

    public eventHandler_qa(gui_qaDeleteEntry del) { this.del = del; }

    public eventHandler_qa(gui_qaEditEntry edit) {
        this.edit = edit;
    }

    public eventHandler_qa(gui_qaViewEntry view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Button btn;
        btn = (Button) e.getSource();
        String buttonText = btn.getLabel();

        if (buttonText.equals("Add Entry")) {
            new gui_qaAddEntry();
        }
        if (buttonText.equals("View Entry")) {
            new gui_qaViewEntry();
            currentFrame = "viewFrame";
        }
        if (buttonText.equals("Edit an Entry")) {
            new gui_qaEditEntry();
            currentFrame = "editFrame";
        }
        if (buttonText.equals("Delete an Entry")) {
            new gui_qaDeleteEntry();
            currentFrame = "delFrame";

        }

        if (buttonText.equals("Save")){
            String regno= "",name="",address="",postcode="";

            regno= add.T1.getText();
            name=add.T2.getText();
            address=add.T3.getText();
            postcode=add.T4.getText();

            String query="insert into students values("+regno+",'"+name+"','"+address+"','"+postcode+"')";

            try{
                databaseConnect.St.executeUpdate(query);
            }
            catch(Exception T){
                System.out.println(T.toString());
            }
        }


        if (buttonText.equals("Search")) {
            if (currentFrame == "editFrame") {
                search(edit);
            }

            if (currentFrame == "delFrame") {
                search(del);

            }

            if (currentFrame == "viewFrame") {
                search(view);

            }
        }

        if (buttonText.equals("Delete")){
            String regno= "";

            regno= del.T1.getText();

            String query="DELETE FROM students WHERE RegNo= "+regno;

            try{
                databaseConnect.St.executeUpdate(query);
            }
            catch(Exception T){
                System.out.println(T.toString());
            }

        }

        if (buttonText.equals("Edit")){
            String regno= "";

            regno= edit.T1.getText();

            //UPDATE students SET ContactName = 'Alfred Schmidt', City= 'Frankfurt' WHERE CustomerID = 1;

            String query="DELETE FROM students WHERE RegNo= "+regno;

            try{
                databaseConnect.St.executeUpdate(query);
            }
            catch(Exception T){
                System.out.println(T.toString());
            }

        }

    }
    public void search(Parent X){

        String regno_Num = X.T1.getText();
        String query = "select * from students WHERE RegNo = " + regno_Num;
        try {
            ResultSet result = databaseConnect.St.executeQuery(query);

            if (result.next()) {
                String name = result.getString("Name");
                X.T2.setText(name);
                String address = result.getString("address");
                X.T3.setText(address);
                String postcode = result.getString("postcode");
                X.T4.setText(postcode);
            }
        } catch (Exception T) {
            System.out.println(T.toString());
        }
    }
}