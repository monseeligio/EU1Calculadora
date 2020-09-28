package calculadora;

import Logica.operaciones;
import java.util.Scanner;

public class Calculadora {

    
    public static void main(String[] args) {
        Scanner LECTOR = new Scanner(System.in);
        operaciones opera =new operaciones();
        int opc;
        int opc2;
       do{ 
        System.out.println("Menu");
        System.out.println("\n1.Suma ");
        System.out.println("2. Resta ");
        System.out.println("3. Multiplicacion ");
        System.out.println("4. Division ");
        System.out.println("Presione 5 para salir. ");
        opc=LECTOR.nextInt();
        switch(opc){
            case 1: opera.Suma(); break;
            case 2: opera.Resta(); break;
            case 3: opera.multiplicacion(); break;
            case 4: opera.division();break;
            case 5: System.exit(0);
            default:System.out.println("No existe esa opcion, por favor verificar ");
            } 
        
         System.out.println("desea realizar otro proceso \n 1=SI    2=NO");
       opc2=LECTOR.nextInt();
       }while(opc2!=2); 
       
    }
    }
