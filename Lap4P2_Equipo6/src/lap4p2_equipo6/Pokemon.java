
package lap4p2_equipo6;


public class Pokemon {
    
    private String especie;
    private int nivel;
    private int xpAcum;
    private int cpNes;
    private Pokemon []move = new Pokemon[4];
    private int hp;
    private int atk;
    private int def;
    private int sp;
    private int spe;
    
    private String stado;

    public Pokemon() {
        
    }

    public Pokemon(String especie, int nivel, int xpAcum, int cpNes, int hp, int atk, int def, int sp, int spe, String stado) {
        this.especie = especie;
        this.nivel = nivel;
        this.xpAcum = xpAcum;
        this.cpNes = cpNes;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.sp = sp;
        this.spe = spe;
        this.stado = stado;
    }
    
        

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getXpAcum() {
        return xpAcum;
    }

    public void setXpAcum(int xpAcum) {
        this.xpAcum = xpAcum;
    }

    public int getCpNes() {
        return cpNes;
    }

    public void setCpNes(int cpNes) {
        this.cpNes = cpNes;
    }

    public Pokemon[] getMove() {
        return move;
    }

    public void setMove(Pokemon[] move) {
        this.move = move;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSp() {
        return sp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public int getSpe() {
        return spe;
    }

    public void setSpe(int spe) {
        this.spe = spe;
    }

    public String getStado() {
        return stado;
    }

    public void setStado(String stado) {
        this.stado = stado;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "especie=" + especie + ", nivel=" + nivel + ", xpAcum=" + xpAcum + ", cpNes=" + cpNes + ", move=" + move + ", hp=" + hp + ", atk=" + atk + ", def=" + def + ", sp=" + sp + ", spe=" + spe + ", stado=" + stado + '}';
    }
    
    
    
    
    
    
}
