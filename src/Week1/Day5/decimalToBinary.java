package Week1.Day5;

public class decimalToBinary {

    public void converter(int decimal){

        int A = 0;
        String binary = "";

        while (decimal>0){
            A=decimal%2;
            decimal = decimal/2;
            binary = A +binary;
        }
        System.out.println(binary);
    }
}
