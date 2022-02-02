package vezbanje;

import java.util.Scanner;

public class vezbanje55 {
    public static void main(String[] args) {
        //55.Uneti double konstante a, b, c, a zatim i pozitivan ceo broj n. Zatim se unose n double brojeva jedan po jedan.
        // Cim se unese jedan od tih brojeva, na standardni izlaz (tj. konzola) ispisuje se resenje polinoma: a*x^2 + b*x + c. [Ovaj zadatak je dosta komplikovan!]
        Scanner sc = new Scanner(System.in);
        double a = 5.1, b = 4.2, c = 3.3;
        int n = 6;
        int brUnosa = 0;
        System.out.println("Imamo 6 unosa.");
        while (brUnosa < n) {
            System.out.println(" ");
            System.out.println("Unesite realan broj x:");
            double x = sc.nextDouble();
            double polinom = a*x*x + b*x + c;
            System.out.println("a*x^2 + b*x + c=" + polinom);
            brUnosa++;
        }


    }
}



