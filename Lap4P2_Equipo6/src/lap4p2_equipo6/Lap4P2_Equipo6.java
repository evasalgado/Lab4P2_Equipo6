package lap4p2_equipo6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lap4P2_Equipo6 {

    static Scanner leer = new Scanner(System.in);
    static Random alea = new Random();
    static ArrayList<Movimiento> movimientos = new ArrayList<>();
    static ArrayList<Pokemon> pokemones = new ArrayList<>();

    public static void main(String[] args) {
        int op = 0;
        while (op != 4) {
            System.out.println("Bienvenido al Pokedex\n"
                    + "1. Registrar Entrenador\n"
                    + "2. Battle Factory\n"
                    + "3. Capturar/ Entrenar\n"
                    + "5. Añadir Movimiento");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    if (pokemones.isEmpty()) {
                        System.out.println("Se debe un pokemon primero");
                        break;
                    } else {
                        System.out.println("Ingrese el nombre del entrenador: ");
                        String name = leer.next();
                        System.out.println("Ingrese la edad: ");
                        int edad = leer.nextInt();
                        System.out.println("Ingrese la cantidad de monedas que tiene: ");
                        int money = leer.nextInt();
                        System.out.println("Ingrese la cantidad de pokemones que posee: ");
                        int cantpokemon = leer.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la especie del pokemon:");
                    String especie = leer.next();
                    break;
                case 3:

                    break;
                case 4:
                    op = 4;
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Numero ingresado no es valido");
                    break;
            }
        }
    }

    public static void capturarpokemon() {
        System.out.println("Ingrese la especie del pokemon:");
        String especie = leer.next();
    }
}
