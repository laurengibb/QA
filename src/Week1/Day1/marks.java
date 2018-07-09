package Week1.Day1;

public class marks {
    public static void main(String[] args) {
        int phy, chr,mat, total;
        float per;
        phy = 80;
        chr = 80;
        mat = 100;
        total = phy + chr + mat;
        per = (float)(total * 100) /450;
        System.out.println("Marks obtained:" + total);
        System.out.println("Percentage:" +per +             "%");
    }
}
