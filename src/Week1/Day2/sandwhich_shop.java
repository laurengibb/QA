package Week1.Day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sandwhich_shop {
    public static void main(String[] args) {
        float bill, paid, change;
        int n50, n20, n10, n5, n2, n1, c50, c20, c10, c5, c2, c1;

        bill = 25.23f;
        paid = 50f;
        change = paid - bill;

        System.out.println("Change Due:");

        if(change < 0) System.out.println("Not enough paid.");

        if(change == 0) System.out.println("No change due.");

        if(change >= 50) {
            n50 = (int) change / 50;
            change = change - (n50 * 50);
            System.out.println("£50 = " + n50);
        }
        if(change >= 20) {
            n20 = (int) change / 20;
            change = change - (n20 * 20);
            System.out.println("£20 = " + n20);
        }
        if(change >= 10) {
            n10 = (int) change / 10;
            change = change - (n10 * 10);
            System.out.println("£10 = " + n10);
        }
        if(change >= 5) {
            n5 = (int) change / 5;
            change = change - (n5 * 5);
            System.out.println("£5 = " + n5);
        }
        if(change >= 2) {
            n2 = (int) change / 2;
            change = change - (n2 * 2);
            System.out.println("£2 = " + n2);
        }
        if(change >= 1) {
            n1 = (int) change / 1;
            change = change - (n1 * 1);
            System.out.println("£1 = " + n1);
        }
        if(change >= 0.50) {
            c50 = (int)( change / 0.50f);
            change = change - (c50 * 0.50f);
            System.out.println("50p = " + c50);
        }
        if(change >= 0.20) {
            c20 = (int) (change / 0.20f);
            change = change - (c20 * 0.20f);
            System.out.println("20p = " + c20);
        }
        if(change >= 0.10) {
            c10 = (int) (change / 0.10f);
            change = change - (c10 * 0.10f);
            System.out.println("10p = " + c10);
        }
        if(change >= 0.05) {
            c5 = (int) (change / 0.05f);
            change = change - (c5 * 0.05f);
            System.out.println("5p = " + c5);
        }
        if(change >= 0.02) {
            c2 = (int) (change / 0.02f);
            change = change - (c2 * 0.02f);
            System.out.println("2p = " + c2);
        }
        if(change >= 0.01) {
            c1 = (int) (change / 0.01f);
            change = change - (c1 * 0.01f);
            System.out.println("1p = " + c1);
        }
    }
}