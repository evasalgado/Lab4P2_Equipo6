package lap4p2_equipo6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lap4P2_Equipo6 {

    static Scanner leer = new Scanner(System.in);
    static Random alea = new Random();
    static ArrayList<Movimiento> movimientos = new ArrayList<>();
    static ArrayList<Entrenador> entrenadores = new ArrayList<>();
    static Pokemon p = new Pokemon();
    public static void main(String[] args) {
        int cont =0, cont2=0;
        int op = 0;
        while (op != 5) {
            Entrenador e = new Entrenador();
            
            System.out.println("Bienvenido al Pokedex\n"
                    + "1. Registrar Entrenador\n"
                    + "2. Capturar/ Entrenar\n"
                    + "3. Battle Factory\n"
                    + "4. Añadir Movimiento\n"
                    + "5. Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    if (e.getCaja().isEmpty() || e.getPoke().length == -1) {
                        System.out.println("Se debe un pokemon primero");
                        break;
                    } else {
                        registrarEntrenador();
                        break;
                    }
                case 2:
                    capturarPokemon(cont,cont2);
                    
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Usted desea: \n"
                            + "1. Añadir movimiento\n");
                    int opcion2 = leer.nextInt();
                    break;
                case 5:
                    op = 5;
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Numero ingresado no es valido");
                    break;
            }
        }
    }

    public static void registrarEntrenador() {
        System.out.println("Ingrese el nombre del entrenador: ");
        String name = leer.next();
        System.out.println("Ingrese la edad: ");
        int edad = leer.nextInt();
        System.out.println("Ingrese la cantidad de monedas que tiene: ");
        int money = leer.nextInt();
        System.out.println("Ingrese la cantidad de pokemones que posee: ");
        int cantpokemon = leer.nextInt(6);
        int[] poke = new int[cantpokemon];
        entrenadores.add( new Entrenador(name, edad, money));
    }
    public static void capturarPokemon(int cont, int cont2){
        
        System.out.println(entrenadores);
        System.out.println("Ingrese indice de entrenador: ");
        int ind = leer.nextInt();
        if (ind>=0&&ind>entrenadores.size()) {
            crearrpokemon(entrenadores.get(ind),cont,cont2);
            System.out.println("");
        }
    }
    public static void crearrpokemon(Entrenador e,int cont, int cont2) {

        System.out.println("Ingrese la especie del pokemon:");
        String especie = leer.next();
        System.out.println("Ingrese el nivel de poder del pokemom: ");
        int nivel = leer.nextInt();
        System.out.println("Ingrese la cantidad de puntos de experiencia del pokemon: ");
        int xp = leer.nextInt();
        System.out.println("Ingrese la cantidad de puntos necesarios para subir de nivel: ");
        int subirnivel = leer.nextInt();
        System.out.println(movimientos);
        System.out.println("Ingrese la posicion de movimientos que tiene(no pueden ser mas de 4): ");
        int ind = leer.nextInt();
        if (ind>=0&&ind> movimientos.size()) {
            movimientos.get(ind);
            System.out.println("");
            if (cont2>0&&cont2<4) {
                    p.getMove()[cont2] = movimientos.get(ind);
                    cont2++;
                } else if(cont2>4){
                    System.out.println("Ya no hay espacio");
                }
            
        }
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
        String estado = "neutral";
        System.out.println("Desea ingresarlo a la caja o al equipo?[c/e]");
        char op = leer.next().charAt(0);
        switch (op) {
            case 'c':
            e.caja.add(new Pokemon(especie, nivel, xp, subirnivel, hp, atk, def, sp, spe, estado));
                break;
            case 'e':
                if (cont>0&&cont<6) {
                    
                    e.getPoke()[cont]= new Pokemon(especie, nivel, xp, subirnivel, hp, atk, def, sp, spe, estado);
                    cont++;
                } else if(cont>6){
                    System.out.println("Espacio de equipo lleno"
                            + "\n mandando a caja");
                    e.caja.add(new Pokemon(especie, nivel, xp, subirnivel, hp, atk, def, sp, spe, estado));
                    
                }
                break;
            default:
                System.out.println("No esta en las opciones");
        }
        
        
    }

    public static void entrenar() {
        
    }

    public static void movimiento() {
        System.out.println("El movimiento es de:\n"
                + "1. Fisico\n"
                + "2. Especial\n"
                + "3. Estado");
        int op = leer.nextInt();
        switch (op) {
            case 1:
                System.out.println("Ingrese nombre de movimiento: ");
                String nombre = leer.nextLine();
                nombre = leer.nextLine();
                System.out.println("Ingrese la descripcion del movimiento: ");
                String desc = leer.nextLine();
                desc = leer.nextLine();
                System.out.println("Ingrese punto de poder: ");
                int poder = leer.nextInt();
                System.out.println("Ingrese punto de presicion: ");
                int precision = leer.nextInt();
                break;
            case 2:
                System.out.println("Ingrese nombre de movimiento: ");
                 nombre = leer.nextLine();
                nombre = leer.nextLine();
                System.out.println("Ingrese la descripcion del movimiento: ");
                 desc = leer.nextLine();
                desc = leer.nextLine();
                System.out.println("Ingrese punto de poder: ");
                 poder = leer.nextInt();
                System.out.println("Ingrese punto de presicion: ");
                 precision = leer.nextInt();
                break;
            case 3:
                System.out.println("Ingrese nombre de movimiento: ");
                 nombre = leer.nextLine();
                nombre = leer.nextLine();
                System.out.println("Ingrese la descripcion del movimiento: ");
                desc = leer.nextLine();
                desc = leer.nextLine();
                String descactual = getString("Ingrese problema de estado que afectará al rival: ");
                descactual.toLowerCase();
                while (!(descactual.equals("dormido")||descactual.equals("nnvenenado")||descactual.equals("quemado")||descactual.equals("neutral"))) {                    
                 descactual = getString("Ingrese problema de estado que afectará al rival: ");   
                 descactual.toLowerCase();
                }
                break;
            default:
                throw new AssertionError();
        }

    }

    public static int ataque(Pokemon p1, Pokemon p2) {
        int ataque = 0;

        System.out.println("Eligiendo pokemon que irá primero....");
        if (p1.getSpe() > p2.getSpe() || p1.getSpe() == p2.getSpe()) {
            System.out.println("Jugador No.1 irá primero");
        } else {
            System.out.println("Juagdor No.2 irá primero");
        }

        while (p1.getHp() != 0 || p2.getHp() != 0) {
            System.out.println("");
        }
        return ataque;
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
