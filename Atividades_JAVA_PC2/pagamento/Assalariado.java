package pagamento;
public class Assalariado extends Empregado {
	private double salarioFixo;
	public Assalariado(double salarioFixo, String nome, String sobrenome, int numeroidentificacao) {
		super(nome, sobrenome, numeroidentificacao);
		this.salarioFixo=salarioFixo;
	}
	
	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo=salarioFixo;
	}
	public double getSalarioFixo() {
		return salarioFixo;
	}
	public double getValorAPagar() {
		return getSalarioFixo();
	}
}
