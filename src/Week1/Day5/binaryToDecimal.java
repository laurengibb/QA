package Week1.Day5;

public class binaryToDecimal {
    public static void converter(String Binary){

        int output = 0;
        int multiplier = 1;

        for(int pos = Binary.length(); pos > 0 ;pos--){
            int x = Integer.parseInt(Binary.substring(pos -1, pos));
            output += (x * multiplier);
            multiplier *= 2;

        }
        System.out.println(output);
    }
}