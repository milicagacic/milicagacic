package vezbanje79;

import javax.swing.*;

public class AutomobilTest {
    public static void main(String[]args){
        Automobil modelS=new Automobil("Tesla","Amerika",2012,105.5);
        System.out.println(modelS.marka);
        System.out.println(modelS.zemljaPorekla);
        System.out.println(modelS.godiste);
        System.out.println(modelS.kilometraza);
        Automobil modelX=new Automobil("Tesla","Amerika",2015,103.4);
        System.out.println(modelX.marka);
        System.out.println(modelX.zemljaPorekla);
        System.out.println(modelX.godiste);
        System.out.println(modelX.kilometraza);
    }
}
