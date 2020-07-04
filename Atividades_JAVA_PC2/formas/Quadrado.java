//Eduardo de Paiva Dias

public class Quadrado extends FormaBidimensional{
	private double lado;
	
	 public Quadrado(double lado, double area, String descricao) {
	        super(area, descricao);
	        this.lado = lado;
	    }
	 public double getLado() {
	        return lado;
	    }

	    public void setLado(double lado) {
	        this.lado = lado;
	    }
	    public double obterArea(){
	        double area;
	        area=lado*lado;
	        setArea(area);
	        return area;
	    }
}
