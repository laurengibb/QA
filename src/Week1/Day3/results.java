package Week1.Day3;

public class results {

    private int phy, che, mat, phyPer, chePer, matPer;
    private float tot, per;
    private int invalid;
    private int failCount = 0;

    public void physics(int a){
        if(a>=0 & a<=150) {
            phy = a;
            phyPer = (phy*100)/150;
            if(phyPer < 60) failCount++;
        }
        else {
            System.out.println("Invalid physics mark!");
            invalid=-1;
        }
    }

    public void chemistry(int b){
        if(b>=0 & b<=150) {
            che = b;
            chePer = (che*100)/150;
            if(chePer < 60) failCount++;
        }
        else {
            System.out.println("Invalid physics mark!");
            invalid=-1;
        }
    }

    public void math(int c){
        if(c>=0 & c<=150) {
            mat = c;
            matPer = (mat*100)/150;
            if(matPer < 60) failCount++;
        }
        else {
            System.out.println("Invalid physics mark!");
            invalid = -1;
        }
    }

    public void showResults(){
        if (invalid==-1) {
            System.out.println("Please check your marks!");
        }
        else {
            if (failCount == 1){
                System.out.println("Retake the exam.");
            }
            if (failCount == 2){
                System.out.println("Retake the course");
            }
            if (failCount == 3){
                System.out.println("Go home!");
            }
            if (failCount == 0) {
                tot = phy + che + mat;
                per = (tot * 100) / 450;
                System.out.println("Total:" + tot);
                System.out.println("Percentage:" + per);
            }
        }

    }

}

