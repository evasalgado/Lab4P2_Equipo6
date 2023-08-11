package lap4p2_equipo6;

public abstract class Movimiento  {

    protected String nombre;
    protected String des;

    public Movimiento(String nombre, String des) {
        this.nombre = nombre;
        this.des = des;
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

    public abstract int mov(Pokemon nn1, Pokemon nn2);

}
