package vezbanje;

import java.util.Scanner;

public class vezbanje39 {
    public static void main(String[]args) {
        //39. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.
        Scanner sc = new Scanner(System.in);
        System.out.println("Upisati mesec i dan:");
        String mesec = sc.next();
        int dan = sc.nextInt();
        switch (mesec) {
            case "mart":
                if (dan >= 21) {
                    System.out.println("Ovan");
                } else {
                    System.out.println("Ribe");
                }
                break;
            case "april":
                if (dan <= 20) {
                    System.out.println("Ovan");
                } else {
                    System.out.println("Bik");
                }
                break;
            case "maj":
                if (dan >= 22) {
                    System.out.println("Blizanci");
                } else {
                    System.out.println("Bik");
                }
                break;
            case "jun":
                if (dan <= 21) {
                    System.out.println("Blizanac");
                } else {
                    System.out.println("Rak");
                }
                break;
            case "jul":
                if (dan <= 22) {
                    System.out.println("Rak");
                } else {
                    System.out.println("Lav");
                }
                break;
            case "avgust":
                if (dan <= 22) {
                    System.out.println("Lav");
                } else {
                    System.out.println("Devica");
                }
                break;
            case "septembar":
                if (dan <= 22) {
                    System.out.println("Devica");
                } else {
                    System.out.println("Vaga");
                }
                break;
            case "oktobar":
                if (dan <= 23) {
                    System.out.println("Vaga");
                } else {
                    System.out.println("Skorpija");
                }
                break;
            case "novembar":
                if (dan <= 23) {
                    System.out.println("Skorpija");
                } else {
                    System.out.println("Strelac");
                }
                break;
            case "decembar":
                if (dan <= 21) {
                    System.out.println("Strelac");
                } else {
                    System.out.println("Jarac");
                }
                break;
            case "januar":
                if (dan <= 20) {
                    System.out.println("Jarac");
                } else {
                    System.out.println("Vodolija");
                }
                break;
            case "februar":
                if (dan <= 19) {
                    System.out.println("Vodolija");
                } else {
                    System.out.println("Ribe");
                }
                break;
            default:
                System.out.println("Trebate uneti mesec i dan.");
                break;
        }
    }
}

