package pagamento;
public abstract class Conta implements Pagavel {
	private int diaVencimento;
	private int mesVencimento;
	private double valor;
	public Conta(int diaVencimento, int mesVencimento, double valor) {
		this.diaVencimento=diaVencimento;
		this.mesVencimento=mesVencimento;
		this.valor=valor;
	}
	public int getDiaVencimento() {
		return diaVencimento;
	}
	public void setDiaVencimento(int diaVencimento) {
		this.diaVencimento = diaVencimento;
	}
	public int getMesVencimento() {
		return mesVencimento;
	}
	public void setMesVencimento(int mesVencimento) {
		this.mesVencimento = mesVencimento;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public abstract double getValorAPagar();
}
