package vezbanje;

public class vezbanje47 {
    public static void main(String[]args){
        //47. Napisati niz od 10 brojeva koji ce se sabirati do 100, kada predje 100 treba ispisati za koliko je presao
        //Na primer ako imamo niz 80, 10, 9, 3, 5, 7, 22, 90, 8
        //Treba da nam ispise 80, 10, 9, 3 i onda poruka "Presli ste granicu za 2"
        int[] niz={1,45,67,3,45,3,12,43,23,2};
        int zbir=0;
        for(int i=0;i<niz.length;i++){
            zbir=zbir+niz[i];
            if(zbir>=100){
                System.out.print(niz[i]+" 'presli ste granicu za "+(zbir-100)+"', ");
                break;
            }else{
                System.out.print(niz[i]+", ");
            }
        }
    }
}
