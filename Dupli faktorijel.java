package com.company;

import java.util.Scanner;
// 1.[Dupli faktorijel] Napisati program koji racuna dupli faktorijel unetg broja n. Dupli faktorijel broja n je:
//n!! = n * (n-2) * (n-4) * ... * (2 ili 1)
public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Uneti ceo broj:");
        int n=sc.nextInt();
        int fact=1;


        if(n%2==0) {
            //* ne je paran
            for (int i=n; i>=2; i-=2) {
                fact*=1;
            }
        }
        else{
            // n je neparan
            for (int i=n; i>=1; i-=2 ) {
                fact*=1;
            }

        }
        System.out.println(fact);
    }
}
