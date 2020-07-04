//Eduardo de Paiva Dias

public class Tetraedro extends FormaTridimensional{
    private double aresta;

    public Tetraedro(double aresta, double volume, double area, String descricao) {
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
        area=(Math.pow(aresta,2) * Math.sqrt(3));
        setArea(area);
        return area;
    }
    public double obterVolume(){
        double volume;
        volume=(Math.pow(aresta,3) * Math.sqrt(2))/12;
        setVolume(volume);
        return volume;
    }
}