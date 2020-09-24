package calculadora;

import Logica.operaciones;
import java.util.Scanner;

public class Calculadora {

    
    public static void main(String[] args) {
        Scanner LECTOR = new Scanner(System.in);
        int opc;
        int opc2;
        System.out.println("Bienvenido al sistema");
        System.out.println("1.Suma ");
        System.out.println("2. Resta ");
        System.out.println("3. Multiplicacion ");
        System.out.println("4. Division ");
        System.out.println("Presione 5 para salir. ");
        operaciones opera =new operaciones();
        System.out.println("¿Que desea realizar?");
        opc=LECTOR.nextInt();
        switch(opc){
            case 1: opera.Suma(); break;
            case 2: opera.Resta(); break;
            case 3: opera.multiplicacion(); break;
            case 4: opera.division();break;
            
            default:System.out.println("No existe esa opcion");
            }
       do{ 
       System.out.println("desea realizar otra operacion \n 1=SI    2=NO");
       opc2=LECTOR.nextInt();
       if (opc2==1){
        System.out.println("Menu");
        System.out.println("\n1.Suma ");
        System.out.println("2. Resta ");
        System.out.println("3. Multiplicacion ");
        System.out.println("4. Division ");
        System.out.println("Presione 5 para salir. ");
        opc2=LECTOR.nextInt();
        switch(opc2){
            case 1: opera.Suma(); break;
            case 2: opera.Resta(); break;
            case 3: opera.multiplicacion(); break;
            case 4: opera.division();break;
            case 5: System.exit(0);
            default:System.out.println("No existe esa opcion");
            } 
        }
       else{
           System.out.println("El programa finalizo");
           System.exit(0);
       }
       }while(opc2!=1); 
       
    }
    }
       
               
       
