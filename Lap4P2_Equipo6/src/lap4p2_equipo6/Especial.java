package lap4p2_equipo6;

import java.util.Random;

public class Especial extends Movimiento {

    public Especial(String nombre, String des, String especie, int nivel, int xpAcum, int cpNes, int hp, int atk, int def, int sp, int spe, String stado) {
        super(nombre, des, especie, nivel, xpAcum, cpNes, hp, atk, def, sp, spe, stado);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public int mov(Pokemon nn1, Pokemon nn2) {
        Random r = new Random();

        int n1 = 1 + r.nextInt(50);
        int n2 = r.nextInt((500 - 100) + 1) + 100;

        int sum = nn1.getSp() + nn2.getSp();

        if (sum == n2) {

            n1 = n1 * 2;

            return nn2.getHp() - n1;

        } else {
            return 0;
        }

    }

}
