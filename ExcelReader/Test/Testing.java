package Test;

import Base.BasePage;
import org.testng.annotations.Test;

public class Testing extends BasePage {
    @Test
    public void racunanje(){
        System.out.println("Brojevi su:");
        int suma=0;
        for(int i=0;i<= excelReader.getLastRow("Brojevi");i++){
            int broj=excelReader.getIntegerData("Brojevi",i,0);
            System.out.println(broj);
            suma=suma+broj;
        }
        System.out.println("Suma brojeva je "+suma);
    }
}
