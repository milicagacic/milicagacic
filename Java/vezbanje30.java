package vezbanje;

import java.util.Scanner;

public class vezbanje30 {
    public static void main(String[]args){
        //30.Suma intervala.Korisnik unosi cele brojeve m i n sa konzole,m<=n.Ispisati sumu brojeva (m,n).
        Scanner sc=new Scanner(System.in);
        System.out.println("Uneti dva cela broja:");
        int n=sc.nextInt(),m=sc.nextInt();
        int suma=0;
        for(int i=m;i<=n;i++)
            suma=suma+i;
        System.out.println(suma);


    }
}
