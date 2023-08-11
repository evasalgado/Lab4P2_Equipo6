
package lap4p2_equipo6;

import java.util.Random;
import java.util.Scanner;


public class Lap4P2_Equipo6 {

    static Scanner leer = new Scanner(System.in);
    static Random alea = new Random();
    public static void main(String[] args) {
        int op = 0;
        while (op!=4) {            
            System.out.println("Bienvenido al Pokedex\n"
                + "1. Registrar Entrenador\n"
                + "2. Battle Factory\n"
                + "3. Capturar/ Entrenar\n"
                + "4. Salir");
            op=leer.nextInt();
            switch (op) {
                case 1:
                    
                    break;
                case 2: 
                    break;
                case 3: 
                    break;
                case 4: 
                    op=4;
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Numero ingresado no es valido");
                    break;
            }
        }
    }
    
}
