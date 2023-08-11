package lap4p2_equipo6;

public abstract class Movimiento extends Pokemon {

    protected String nombre;
    protected String des;

    public Movimiento(String nombre, String des, String especie, int nivel, int xpAcum, int cpNes, int hp, int atk, int def, int sp, int spe, String stado) {
        super(especie, nivel, xpAcum, cpNes, hp, atk, def, sp, spe, stado);
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
