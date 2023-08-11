package lap4p2_equipo6;

import java.util.ArrayList;

public class Entrenador {

    private String nombre;
    private int edad;
    private int dinero;
    private int[] poke = new int[6];
    ArrayList<Pokemon> caja = new ArrayList();

    public Entrenador() {
    }

    public Entrenador(String nombre, int edad, int dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int[] getPoke() {
        return poke;
    }

    public void setPoke(int[] poke) {
        this.poke = poke;
    }

    public ArrayList<Pokemon> getCaja() {
        return caja;
    }

    public void setCaja(ArrayList<Pokemon> caja) {
        this.caja = caja;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + ", poke=" + poke + ", caja=" + caja + '}';
    }

}
