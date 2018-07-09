package Week1.Day5;

public class strings {

    public void count(String msg, String What){
        int i, num;
        i=num=0;
        int length = What.length();


        for (; i<=(msg.length()-length); i++){
            String alpha;
            alpha = msg.substring(i, (i+(length)));
            if (alpha.equals(What)){
                num++;
            }
        }
        System.out.println("There are " +num +" " +What +"'s" +" in '" +msg +"'.");
    }
}
