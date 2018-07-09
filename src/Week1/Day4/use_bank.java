package Week1.Day4;

public class use_bank {
    public static void main(String[] args) {
        bank natwest001 = new bank();

        bank natwest002 = new bank();

        System.out.println(bank.netProfit);

        natwest001.updateProfit(5000);
        natwest002.updateProfit(10000);

        System.out.println(bank.netProfit);
    }
}
