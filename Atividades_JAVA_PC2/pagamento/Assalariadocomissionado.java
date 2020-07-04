package pagamento;
public class Assalariadocomissionado extends Comissionado {
	private double salarioFixo;
	public Assalariadocomissionado(double vendas, double porcentagemsobrevendas, String nome, String sobrenome,
			int numeroidentificacao, double salarioFixo) {
		super(vendas, porcentagemsobrevendas, nome, sobrenome, numeroidentificacao);
		this.salarioFixo = salarioFixo;
	}
	public double getSalarioFixo() {
		return salarioFixo;
	}
	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	
	public double getValorAPagar() {
		return getSalarioFixo()+(getVendas()*getPorcentagemsobrevendas());
	}
}
