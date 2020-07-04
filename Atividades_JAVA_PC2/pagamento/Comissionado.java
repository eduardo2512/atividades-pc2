package pagamento;
public class Comissionado extends Empregado {
	private double vendas;
	private double porcentagemsobrevendas;
	public Comissionado(double vendas, double porcentagemsobrevendas, String nome, String sobrenome, int numeroidentificacao) {
		super(nome, sobrenome, numeroidentificacao);
		this.vendas=vendas;
		this.porcentagemsobrevendas=porcentagemsobrevendas;
	}
	public double getVendas() {
		return vendas;
	}
	public void setVendas(double vendas) {
		this.vendas = vendas;
	}
	public double getPorcentagemsobrevendas() {
		return porcentagemsobrevendas;
	}
	public void setPorcentagemsobrevendas(double porcentagemsobrevendas) {
		this.porcentagemsobrevendas = porcentagemsobrevendas;
	}
	public double getValorAPagar() {
		return getVendas()*getPorcentagemsobrevendas();
	}
}
