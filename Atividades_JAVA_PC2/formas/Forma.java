//Eduardo de Paiva Dias

public abstract class Forma{
    private double area;
    private String descricao;

    public Forma(double area, String descricao) {
        this.area = area;
        this.descricao = descricao;
    }
    public abstract double obterArea(); // so precisa de assinatura por ser abstrato

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}