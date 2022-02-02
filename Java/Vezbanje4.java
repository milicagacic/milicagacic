package vezbanje;

import java.util.Scanner;

public class Vezbanje4 {
    public static void main(String[]args){
        //4. Napisati program koji racuna povrsinu kvadrata stranice a i povrsinu kruga poluprecnika r.
        Scanner sc=new Scanner(System.in);
        System.out.println("Upisite stranicu kvadrata i poluprecnik kruga:");
        double a=sc.nextDouble(),r=sc.nextDouble();
        double pk=a*a;
        double pkr=r*r*3.14;
        System.out.println("Povrsina kvadrata je "+pk+" a povrsina kruga "+pkr+".");
    }
}
