package Week1.Day5;

public class findAndReplace {
    public void replace(String msg, String find, String replace) {

        int A = 0;
        String newmessage="";
        for (A = 0; A < msg.length(); A++) {
            if (msg.substring(A, A + 1).equals(find.substring(0, 1))) {
                if (msg.substring(A, A + find.length()).equals(find)) {
                    newmessage+=replace;
                    A=A+find.length()-1;
                }else{
                    newmessage+=msg.substring(A, A + 1);
                }
            }else{
                newmessage+=msg.substring(A, A + 1);
            }
        }
        System.out.println(newmessage);

    }
}
