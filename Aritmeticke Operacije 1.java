package com.company;

import java.util.Scanner;

// 1. Aritmeticke opracije1. Aritmeticke opracije
//Na standardni ulaz se unose dva cela broja. Ispisati na standardnom izlazu u zasebnim redovima zbir, razliku,
// proizvod, kolicnik i ostatak deljenja prvog broja drugim tim redom.
public class Main {

    public static void main(String[] args) {
	System.out.println("Uneti 2 cela broja:");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c= a+b;
    System.out.println("Zbir ova dva broja je: " + c);
    int d= a-b;
    System.out.println("Razlika ova dva broja je: " + d);
    int e=a*b;
    System.out.println("Proizvod ova dva broja je: " + e);
    int f=a/b;
    System.out.println("Kolicnik ova dva broja je: " + f);
    int g=a%b;
    System.out.println("Ostatak pri deljenju prvog broja drugim je: " + g);
    }
}
