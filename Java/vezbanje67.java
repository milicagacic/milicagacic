package vezbanje;

public class vezbanje67 {
    public static void main(String[]args){
        //67.Niz 1 inicijalizovati u main metodi.Niz 2 deklarisati u main metodi ali inicijalizovati u posebnoj metodi.
        // U main metodi napraviti treci niz koji ce sabrati ova dva niza.
        int[] niz1={1,2,3,4,5};
        int [] niz2=vracenNiz(6,7,8,9,10);
        int[] sabiranje={
                niz1[0]+niz2[0],
                niz1[1]+niz2[1],
                niz1[2]+niz2[2],
                niz1[3]+niz2[3],
                niz1[4]+niz2[4]
        };
        for(int i=0;i<sabiranje.length;i++){
            System.out.println(sabiranje[i]);
        }


    }
    public static int[] vracenNiz(int x,int y,int z,int a,int b){
       int[] nizIzDruge={x,y,z,a,b};
       return nizIzDruge;

    }
}
