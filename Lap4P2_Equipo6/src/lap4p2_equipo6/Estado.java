package lap4p2_equipo6;

import java.util.Random;

public class Estado extends Movimiento {

    public Estado(String nombre, String des, String especie, int nivel, int xpAcum, int cpNes, int hp, int atk, int def, int sp, int spe, String stado) {
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
<<<<<<< HEAD
        Random r = new Random();
        int n1 = 1 + r.nextInt(100);

        if (n1 >= 1 || n1 <= 75) {

            return 1;

        } else {
            return 0;
=======
            Random r = new Random();
            
          int n1 = 1 + r.nextInt(100);
          
          if (n1 >=1 || n1<=75) {
            
              
              
>>>>>>> 6871955f86798d5d0066ddc474731366bd1b3f94
        }

    }

}
