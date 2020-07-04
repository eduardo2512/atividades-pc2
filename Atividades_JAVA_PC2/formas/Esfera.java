//Eduardo de Paiva Dias

public class Esfera extends FormaTridimensional{
    private double raio;

    public Esfera(double raio, double volume, double area, String descricao) {
        super(volume, area, descricao);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double obterArea(){
        double area;
        area=(4 * Math.PI * Math.pow(raio, 2));
        setArea(area);
        return area;
    }
    public double obterVolume(){
        double volume;
        volume=((4/3) * Math.PI * Math.pow(raio, 3));
        setVolume(volume);
        return volume;
    }
}