package Week1.Day2;

public class while_loops {
    public static void main(String[] args) {
//        Print Hello World 10 times
//        int x = 0;
//        while(x<10){
//            System.out.println("Hello World!");
//            x++;
//        }




//        Print 2x tables up to 100
//        int a = 1;
//        while( a<=100){
//            System.out.println("2 X " +a +" = " +(a*2));
//            a++;
//        }




//        Print even numbers up to 100
//        int x = 1;
//        while (x <= 100){
//            if (x%2 == 0){
//                System.out.println(x);
//            }
//            x++;
//        }
//    }
        int a;
        int b = 10;
        String s;

        while(b>0){
            s="";
            a=1;
            while(a<=b){
                if(a==1){
                    s = s+a;}
                else {
                    s += ", " +a;
                }
                a++;
            }
            System.out.println(s +".");
            b--;
        }



}}
