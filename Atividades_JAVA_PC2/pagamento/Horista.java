package pagamento;
public class Horista extends Empregado {
	private double salarioFixo;
	private double precoHora;
	private int hora;
	public Horista(double salarioFixo, double precoHora, int hora, String nome, String sobrenome, int numeroidentificacao) {
		super(nome, sobrenome, numeroidentificacao);
		this.salarioFixo=salarioFixo;
		this.precoHora=precoHora;
	}
	
	public double getSalarioFixo() {
		return salarioFixo;
	}
	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	public double getPrecoHora() {
		return precoHora;
	}
	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public double getValorAPagar() {
		return getSalarioFixo()+(getPrecoHora()*getHora());
	}
}
