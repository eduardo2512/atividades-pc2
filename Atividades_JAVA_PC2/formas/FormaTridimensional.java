//Eduardo de Paiva Dias

public abstract class FormaTridimensional extends Forma{
    private double volume;

    public FormaTridimensional(double volume, double area, String descricao) {
        super(area, descricao);
        this.volume = volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
    
    public abstract double obterVolume();

    
}