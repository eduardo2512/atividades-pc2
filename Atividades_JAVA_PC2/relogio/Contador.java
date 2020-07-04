//Eduardo de Paiva Dias
public class Contador {
    private int mostrador;
    public Contador(){
        mostrador=0;
    }
    public void contar(){
        mostrador=(mostrador+1)%100;
    }
    public void setMostrador(int mostrador){
        this.mostrador=mostrador;
    }
    public int getMostrador(){
        return mostrador;
    }
}