package Week1.Day5;

public class stringExample {

    public static void main(String[] args) {
        int x;
        String message = "abc";

        for (x = 0; x < message.length(); x++) {
            System.out.println(message.substring(0, x+1));
        }
    }
}
