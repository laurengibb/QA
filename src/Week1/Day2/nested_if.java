package Week1.Day2;

public class nested_if {
    public static void main(String[] args) {
        int x;
        x=150;
        if (x>10){
            System.out.println("A");
            if(x>20){
                System.out.println("C");
            }
        }
        else{
            System.out.println("B");
        }
    }
}
