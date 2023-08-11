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
        while (op != 5) {
            System.out.println("Bienvenido al Pokedex\n"
                    + "1. Registrar Entrenador\n"
                    + "2. Capturar/ Entrenar\n"
                    + "3. Battle Factory\n"
                    + "4. Añadir Movimiento\n"
                    + "5. Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    if (pokemones.isEmpty()) {
                        System.out.println("Se debe un pokemon primero");
                        break;
                    } else {
                        registrarEntrenador();
                        break;
                    }
                case 2:
                    capturarpokemon();
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
    public static void registrarEntrenador(){
        System.out.println("Ingrese el nombre del entrenador: ");
                        String name = leer.next();
                        System.out.println("Ingrese la edad: ");
                        int edad = leer.nextInt();
                        System.out.println("Ingrese la cantidad de monedas que tiene: ");
                        int money = leer.nextInt();
                        System.out.println("Ingrese la cantidad de pokemones que posee: ");
                        int cantpokemon = leer.nextInt(6);
                        int[] poke = new int[cantpokemon];
                        Entrenador e = new Entrenador(name, edad, money);
    }
    public static void capturarpokemon() {
        System.out.println("Ingrese la especie del pokemon:");
        String especie = leer.next();
        System.out.println("Ingrese el nivel de poder del pokemom: ");
        int nivel = leer.nextInt();
        System.out.println("Ingrese la cantidad de puntos de experiencia del pokemon: ");
        int xp = leer.nextInt();
        System.out.println("Ingrese la cantidad de puntos necesarios para subir de nivel: ");
        int subirnivel = leer.nextInt();
        System.out.println("Ingrese la cantidad de movimientos que tiene(no pueden ser mas de 4): ");
        int mov = leer.nextInt(4);
        int[] cantmov = new int[mov];
        System.out.println("Ingrese la cantidad de puntos de vida que tiene: ");
        int hp = leer.nextInt();
        System.out.println("Ingrese nivel de ataque: ");
        int atk = leer.nextInt();
        System.out.println("Ingrese nivel de defensa: ");
        int def = leer.nextInt();
        System.out.println("Ingrese nivel de alcance de ataque especial: ");
        int sp = leer.nextInt();
        System.out.println("Ingrese nivel de velocidad del pokemon: ");
        int spe = leer.nextInt();
        System.out.println("Ingrese el estado actual del pokemon: ");
        String estado = leer.next();
        pokemones.add(new Pokemon(especie, nivel, xp, spe, hp, atk, def, sp, spe, estado));
    }

    public static void entrenar() {
        
    }
    public static void movimiento(){
        System.out.println("");
    }
    public static int ataque(Pokemon p1, Pokemon p2){
        System.out.println("Eligiendo pokemon que irá primero....");
        if (p1.getSpe()>p2.getSpe()||p1.getSpe()==p2.getSpe()) {
            System.out.println("Jugador No.1 irá primero");
        } else{
            System.out.println("Juagdor No.2 irá primero");
        }
    }
    static String getString(String n) {
        Scanner lea = new Scanner(System.in);
        String s1 = "";

        while (s1.equals("")) {
            System.out.println(n);
            s1 = lea.nextLine();
            if (!s1.matches("^[A-Za-z ]*$")) {

                s1 = "";

            }
        }
        return s1;
    }

}
