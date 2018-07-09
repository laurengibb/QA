package Week1.Day4;

public class accounts {
    private float tax(int salary){
        float t = 0;
        if (salary<1000){
            t = 0;
        }
        else if (salary>=1000 & salary <2000){
            t = (salary*15)/100;
        }
        else {
            t = (salary*21)/100;
        }
        return t;
    }
    public void netSalary(int salary){
        System.out.println("Your Tax: " +tax(salary));
        System.out.println("Net Salary: " + (salary -tax(salary)));
    }

}
