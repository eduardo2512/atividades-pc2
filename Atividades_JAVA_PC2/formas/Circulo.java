//Eduardo de Paiva Dias

public class Circulo extends FormaBidimensional{
    private double raio;

    public Circulo(double raio, double area, String descricao) {
        super(area, descricao);
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
        area=Math.PI*Math.pow(raio, 2);
        setArea(area);
        return area;
    }
}