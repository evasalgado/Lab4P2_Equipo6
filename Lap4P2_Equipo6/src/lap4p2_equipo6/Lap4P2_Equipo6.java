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
        int cont = 0, cont2 = 0;
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

                    registrarEntrenador();
                    break;
                case 2:
                    if ((entrenadores.isEmpty() && movimientos.isEmpty())) {
                        System.out.println("se deben registrar varias cosas antes");
                        break;
                    } else {

                        capturarPokemon(cont, cont2);

                        break;
                    }

                case 3:

                    if ((e.getCaja().isEmpty() || e.getPoke().length == -1)) {
                        System.out.println("Se debe un pokemon primero");
                        break;
                    } else {
                        
                        
                        
                        
                        
                        break;
                    }

                case 4:
                   movimiento();
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

        entrenadores.add(new Entrenador(name, edad, money));
    }

    public static void capturarPokemon(int cont, int cont2) {

        System.out.println(entrenadores);
        System.out.println("Ingrese indice de entrenador: ");
        int ind = leer.nextInt();
        if (ind >= 0 && ind < entrenadores.size()) {
            crearrpokemon(entrenadores.get(ind), cont, cont2);
            System.out.println("");
        }
    }

    public static void crearrpokemon(Entrenador e, int cont, int cont2) {

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
        if (ind >= 0 && ind > movimientos.size()) {
            movimientos.get(ind);
            System.out.println("");
            if (cont2 > 0 && cont2 < 4) {
                p.getMove()[cont2] = movimientos.get(ind);
                cont2++;
            } else if (cont2 > 4) {
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
                if (cont > 0 && cont < 6) {

                    e.getPoke()[cont] = new Pokemon(especie, nivel, xp, subirnivel, hp, atk, def, sp, spe, estado);
                    cont++;
                } else if (cont > 6) {
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
        System.out.println(entrenadores);
        System.out.println("ingrese la posicion de un trenador 1");
        int pos = leer.nextInt();
        Entrenador e = entrenadores.get(pos);
        System.out.println("ingrese la posicion de un trenador 2");
               int pos2 = leer.nextInt();
                 Entrenador e1 = entrenadores.get(pos2);
               
               entrenadores.get(pos);
               for (int i = 0; i < entrenadores.get(pos).getPoke().length; i++) {
                   System.out.println(entrenadores.get(pos).getPoke()[i]);
               
            
        }
               System.out.println("entrenador uno ingrese su pokemon");
               int pes = leer.nextInt();
               Pokemon p1 [] = e.getPoke();
               Pokemon p = p1[pes];
                 System.out.println("entrenador dos ingrese su pokemon");
               int pes1 = leer.nextInt();
               Pokemon p2 [] = e.getPoke();
               Pokemon pp = p2[pes1];
               
               while (p.getHp()==0 || pp.getHp()==0) {            
              for (int i = 0; i < p.getMove().length; i++) {
                       
                        
                        
                   }
                   
                   System.out.println("entrenador uno ingrese el movimiento");
                   int l = leer.nextInt();
                   Movimiento [] m = p.getMove();
                
                   
                   
                   
                   
                   
        }
               
        
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
                movimientos.add(new Fisico(nombre, desc));
                
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
                
                movimientos.add(new Especial(nombre, desc));
                break;
            case 3:
                System.out.println("Ingrese nombre de movimiento: ");
                nombre = leer.nextLine();
                nombre = leer.nextLine();
                System.out.println("Ingrese la descripcion del movimiento: ");
                desc = leer.nextLine();
                desc = leer.nextLine();
                String descactual = getString("Ingrese problema de estado que afectará al rival: (dormido, envenenado, paralizado, quemado, neutral).");
                descactual.toLowerCase();
                while (!(descactual.equals("dormido") || descactual.equals("3nvenenado") || descactual.equals("quemado") || descactual.equals("neutral"))) {
                    descactual = getString("Ingrese problema de estado que afectará al rival: ");
                    descactual.toLowerCase();
                }
                
                movimientos.add(new Estado(descactual, nombre, desc));
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
