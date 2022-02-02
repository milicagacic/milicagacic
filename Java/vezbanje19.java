package vezbanje;

public class vezbanje19 {
    public static void main(String[]args){
        //19.Nacrtaj jelku bez skenera
        String razmak=" ";
        String z="*";
        for(int i=9;i>1;i--){
            for(int j=1;j<i;j++){
                System.out.print(razmak);
            }
            System.out.println(z);
            z=z+"**";
        }

    }
}
