package vezbanje;

public class vezbanje50 {
    public static void main(String[]args){
     //50.  Iz Main metode proslediti dva broja koji ce se mnoziti u drugoj metodi
        ////Dodatak - Dva broja proslediti trecoj metodi koja ce da vrati veci broj;
        operacija(3,5);
        System.out.println(operacija(3,5));
        veciBroj(5,6);
        System.out.println(veciBroj(5,6));
    }
    public static int operacija(int x, int y){
        int z=x*y;
        return z;

    }
    public static int veciBroj(int x,int y){
        if(x>y){
            return x;
        }else{
            return y;
        }

    }
}
