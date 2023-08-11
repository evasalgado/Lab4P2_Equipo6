package lap4p2_equipo6;

import java.util.Random;


public class Fisico extends Movimiento {

    public Fisico(String nombre, String des) {
        super(nombre, des);
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

        if (nn1.getAtk() > nn2.getDef()) {
            n1 = n1 * 2;

            return nn2.getHp() - n1;

        } else if (nn1.getAtk() < nn2.getDef()) {
            n1 = n1 * (int) 0.5;
            return nn2.getHp() - n1;
        } else if (nn1.getAtk() == nn2.getDef()) {

            return nn2.getHp() - n1;
        } else {
            return 0;
        }

    }

}
