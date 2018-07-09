package Week1.Day3;

public class for_loop {
    public static void main(String[] args) {

        int a;
        int b;

        for (a=1; a<=20; a++){
            System.out.println("Times table of: " +a);
            System.out.println("-----------------");
            for (b = 1; b <= 10; b++) {
                System.out.println(a +" x " + b + " = " + a * b);
            }
        }
    }
}
