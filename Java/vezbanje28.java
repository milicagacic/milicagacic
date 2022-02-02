package vezbanje;

import java.util.Scanner;

public class vezbanje28 {
    public static void main(String[]args) {
        //28. Dupli faktorijel sa desne na levo.
        Scanner sc=new Scanner(System.in);
        System.out.println("Upisati neki broj:");
        int n=sc.nextInt();
        int fakt=1;
        boolean stagod=true;
        for(int i=1;i<=n;i+=2){
            if(n%2==0){
                fakt*=i;
                if(stagod){
                    i--;
                }
            }else{
                fakt*=i;
            }
            stagod=false;
        }
        System.out.println(fakt);
    }
}
