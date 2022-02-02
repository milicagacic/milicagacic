package vezbanje;

public class vezbanje46 {
    public static void main(String[]args){
        //46. Napraviti niz integera i prikazati koji elementi su deljivi sa 3
        int[]niz={2,56,323,33,87};
        for(int i=0;i<niz.length;i++){
            if(niz[i]%3==0){
                System.out.println("Ovaj broj je deljiv sa 3: "+niz[i]);
            }else if(niz[i]%3!=0){
                System.out.println("Ovaj broj nije deljivi sa 3: "+niz[i]);
            }


        }
    }
}
