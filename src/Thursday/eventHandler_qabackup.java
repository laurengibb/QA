//package Thursday;
//
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.ResultSet;
//
//public class eventHandler_qabackup implements ActionListener {
//    gui_qaAddEntry add;
//    gui_qaDeleteEntry del;
//    gui_qaEditEntry edit;
//    static String currentFrame;
//
//    public eventHandler_qabackup(){
//    }
//
//    public eventHandler_qabackup(gui_qaAddEntry add) {
//        this.add = add;
//    }
//
//    public eventHandler_qabackup(gui_qaDeleteEntry del) { this.del = del; }
//
//    public eventHandler_qabackup(gui_qaEditEntry edit) {
//        this.edit = edit;
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        Button btn;
//        btn = (Button) e.getSource();
//        String buttonText = btn.getLabel();
//
//        if (buttonText.equals("Add Entry")) {
//            new gui_qaAddEntry();
//        }
//        if (buttonText.equals("View All Entry's")) {
//            //gui_qaFrames.viewAll();
//        }
//        if (buttonText.equals("Edit an Entry")) {
//            new gui_qaEditEntry();
//            currentFrame = "editFrame";
//        }
//        if (buttonText.equals("Delete an Entry")) {
//            new gui_qaDeleteEntry();
//            currentFrame = "delFrame";
//
//        }
//
//
//        if (buttonText.equals("Save")){
//            String regno= "",name="",address="",postcode="";
//
//            regno= add.T1.getText();
//            name=add.T2.getText();
//            address=add.T3.getText();
//            postcode=add.T4.getText();
//
//            String query="insert into students values("+regno+",'"+name+"','"+address+"','"+postcode+"')";
//
//            try{
//                databaseConnect.St.executeUpdate(query);
//            }
//            catch(Exception T){
//                System.out.println(T.toString());
//            }
//        }
//
//
//        if (buttonText.equals("Search")) {
//            if (currentFrame == "editFrame") {
//               // String regno = "";
//                search(edit);
//              /*  regno = edit.T1.getText();
//                int regno_Num = Integer.parseInt(regno);
//
//                String query = "select * from students WHERE RegNo = " + regno_Num;
//
//                try {
//                    ResultSet result = databaseConnect.St.executeQuery(query);
//
//                    if (result.next()) {
//                        String name = result.getString("Name");
//                        edit.T2.setText(name);
//                        String address = result.getString("address");
//                        edit.T3.setText(address);
//                        String postcode = result.getString("postcode");
//                        edit.T4.setText(postcode);
//                    }
//                } catch (Exception T) {
//                    System.out.println(T.toString());
//                } */
//            }
//
//            if (currentFrame == "delFrame") {
//
//                search(del);
//
//               /* String regno = "";
//
//                regno = del.T1.getText();
//                int regno_Num = Integer.parseInt(regno);
//
//                String query = "select * from students WHERE RegNo = " + regno_Num;
//
//                try {
//                    ResultSet result = databaseConnect.St.executeQuery(query);
//
//                    if (result.next()) {
//                        String name = result.getString("Name");
//                        del.T2.setText(name);
//                        String address = result.getString("address");
//                        del.T3.setText(address);
//                        String postcode = result.getString("postcode");
//                        del.T4.setText(postcode);
//                    }
//                } catch (Exception T) {
//                    System.out.println(T.toString());
//                }
//                */
//            }
//        }
//
//        if (buttonText.equals("Delete")){
//            String regno= "";
//
//            regno= del.T1.getText();
//
//            String query="DELETE FROM students WHERE RegNo= "+regno;
//
//            try{
//                databaseConnect.St.executeUpdate(query);
//            }
//            catch(Exception T){
//                System.out.println(T.toString());
//            }
//
//        }
//
//
////        if (buttonText.equals("Search")) {
////            Object classRef = "";
////
////            if (currentFrame == "editFrame") {
////                classRef = "edit";
////            }
////            if (currentFrame == "delFrame") {
////                classRef = "del";
////            }
////
////                String regno = "";
////
////                regno = classRef.T1.getText();
////                int regno_Num = Integer.parseInt(regno);
////
////                String query = "select * from students WHERE RegNo = " + regno_Num;
////
////                try {
////                    ResultSet result = databaseConnect.St.executeQuery(query);
////
////                    while (result.next()) {
////                        String name = result.getString("Name");
////                        edit.T2.setText(name);
////                        String address = result.getString("address");
////                        edit.T3.setText(address);
////                        String postcode = result.getString("postcode");
////                        edit.T4.setText(postcode);
////                    }
////                } catch (Exception T) {
////                    System.out.println(T.toString());
////                }
////            }
//
//
//
//
//    }
//    public void search(Parent X){
//
//         String regno_Num = X.T1.getText();
//        String query = "select * from students WHERE RegNo = " + regno_Num;
//        try {
//            ResultSet result = databaseConnect.St.executeQuery(query);
//
//            if (result.next()) {
//                System.out.println("hello");
//                String name = result.getString("Name");
//                X.T2.setText(name);
//                String address = result.getString("address");
//                X.T3.setText(address);
//                String postcode = result.getString("postcode");
//                X.T4.setText(postcode);
//            }
//        } catch (Exception T) {
//            System.out.println(T.toString());
//        }
//    }
//}