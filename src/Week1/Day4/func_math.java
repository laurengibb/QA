package Week1.Day4;

public class func_math {

    public func_math(){
        System.out.println("hello");
    }

    //procedure(just can't return items)
    public void addition(int a, int b) {
        int c;
        c = a + b;
        System.out.println("Result: " + c);
    }

    //return function
    public int subtraction(int x, int y){
        int c;
        c = x - y;
        return c;
    }
}
