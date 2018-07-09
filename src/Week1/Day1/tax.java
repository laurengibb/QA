package Week1.Day1;

public class tax {
    public static void main(String[] args) {
        String name;
        int salary;
        float tax;

        name = "Lauren";
        salary = 19000;
        System.out.println("Name:" + name);
        System.out.println("Salary: £" + salary);

        if (salary > 20000){
            tax = (salary/100f)*21f;
            System.out.println("Tax: £" + tax);
            System.out.println("Net Salary: £" + (salary - tax));
        }

        if (salary <20000){
            tax = (salary/100f)*19f;
            System.out.println("Tax: £" + tax);
            System.out.println("Net Salary: £" + (salary - tax));
        }
    }
}
