package Week1.Day5;

public class iAmGoingToLondon {

    public void count(String msg){
        int start = 0;
        int end = msg.length();
        int counter = 0;

        for (int i = 0; i<msg.length(); i++){
            if (msg.substring(i, i+1).equals(" ")){
                counter++;
            }
        }

        for(int i = counter; i>=0; i--) {

            for (int var = end; var > 0; var--) {
                String alpha;
                alpha = msg.substring(var - 1, var);

                if (alpha.equals(" ")) {
                    start = var;
                    break;
                } else if (var == 1) {
                    start = 0;
                }
            }

            System.out.println(msg.substring(start, end));
            end = start -1;

            if (end<0){
                end =0;
            }
        }
    }


    public void count2(String msg){
        int A=0;
        String Word="";
        for (A=msg.length()-1;A>=0;A--){
            if( msg.substring(A,A+1).equals(" ")){
                System.out.println(Word);
                Word="";
            }
            else{
                Word=msg.substring(A,A+1)+Word;
            }
        }
        System.out.println(Word);
    }
}