
package Logica;
import java.util.Scanner;
public class operaciones {
    Scanner LECTOR = new Scanner(System.in);
    private double num1, num2;
    public void Suma() {
        double res = 0;
        System.out.println("Introduce un numero ");
        num1 = LECTOR.nextInt();
        System.out.println("Introduce el siguiente numero a sumar ");
        num2= LECTOR.nextInt();
        res=num1+num2;
        System.out.println("el total de la suma: " +res);
        
    }
    public void Resta() {
        double res = 0;
        System.out.println("introduco un numero "); 
        num1 = LECTOR.nextInt();
        System.out.println("Introduce el numero que se le restara ");
        num2= LECTOR.nextInt();
        res=num1-num2;
        System.out.println("el total de la resta: " +res);
    }
     public void multiplicacion() {
        double res = 0;
        System.out.println("introduce el numero 1 "); 
        num1 = LECTOR.nextInt();
        System.out.println("Introduce el numero 2 ");
        num2= LECTOR.nextInt();
        res=num1*num2;
        System.out.println("el total de la multiplicacion: " +res);
    }
    public void division() {
        double res = 0;
        System.out.println("introduce el numero dividendo "); 
        num1 = LECTOR.nextInt();
        System.out.println("Introduce el numero divisor");
        num2= LECTOR.nextInt();
        res=num1/num2;
        System.out.println("el total de la division: " +res);
    }

}
