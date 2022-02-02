package vezbanje83;

public class TrougaoTest {
    public static void main(String[] args) {
        Trougao t1 = new Trougao(10, 11, 12);

        System.out.println("Obim trougla je: " + t1.obim());
        System.out.println("Povrisna trougla je: " + t1.povrsina());

        t1.setStranicaA(1000);
    }
}
