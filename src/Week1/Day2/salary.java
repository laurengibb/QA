package Week1.Day2;

public class salary {
    public static void main(String[] args) {
        float tax=0, net=0, salary;
        salary = 2000f;

        if(salary < 1000) tax = (salary*5)/100;
        if(salary >= 1000 && salary < 2000) tax = (salary*15)/100;
        if(salary >= 2000 && salary < 3000) tax = (salary*17)/100;
        if(salary >= 3000 && salary < 4000) tax = (salary*21)/100;
        if(salary >= 4000) tax = (salary*25)/100;
        net = salary - tax;
        System.out.println("The net value after Week1.Day1.tax: £" + net);
    }
}
