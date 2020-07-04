//Eduardo de Paiva Dias

public class Triangulo extends FormaBidimensional{
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura, double area, String descricao) {
		super(area, descricao);
		this.base = base;
		this.altura=altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return altura;
	}
	public double obterArea(){
		double area;
	    area=base*altura;
	    setArea(area);
	    return area;
	}
}
