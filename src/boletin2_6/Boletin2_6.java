
package boletin2_6;
import java.util.Scanner;

public class Boletin2_6 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        float descuento,pagado,total;
        System.out.println("teclea precio total:");
        total=sc.nextFloat();
        System.out.println("teclea  precio pagado:");
        pagado=sc.nextFloat();
         descuento =(total - pagado)/total*100;
        System.out.println("descuento = "+ descuento +"%");
        
    }
    
}
