package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 2.[Suma intervala] Korisnik unosi cele brojeve m i n sa konzole, m <= n. Ispisati sumu brojeva [m, n].
        Scanner sc=new Scanner(System.in);
        System.out.println("Uneti 2 cela broja.\nPrvi broj mora biti manji ili jednak drugom broju.");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int sum=0;
        if(m<=n){
            for(int i=m;i<=n;i++)
            sum=sum+i;
            System.out.println(sum);
        } else{
            System.out.println("Ne moze to tako.");
        }
    }
}
