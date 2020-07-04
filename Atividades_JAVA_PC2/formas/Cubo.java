//Eduardo de Paiva Dias

public class Cubo extends FormaTridimensional{
    private double aresta;

    public Cubo(double aresta, double volume, double area, String descricao) {
        super(volume, area, descricao);
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    public double obterArea(){
        double area;
        area=6 * Math.pow(aresta, 2);
        setArea(area);
        return area;
    }
    public double obterVolume(){
        double volume;
        volume=Math.pow(aresta, 3);
        setVolume(volume);
        return volume;
    }
}