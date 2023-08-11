package lap4p2_equipo6;

import java.util.Random;

public class Estado extends Movimiento {
    private String estadoact;

    public Estado(String estadoact, String nombre, String des) {
        super(nombre, des);
        this.estadoact = estadoact;
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

    public String getEstadoact() {
        return estadoact;
    }

    public void setEstadoact(String estadoact) {
        this.estadoact = estadoact;
    }
    

    @Override
    public int mov(Pokemon nn1, Pokemon nn2) {

        Random r = new Random();
        int n1 = 1 + r.nextInt(100);

        if (n1 >= 1 || n1 <= 75) {

            return 1;

        } else {
            return 0;

           
            
              
              

        }

    }

}
