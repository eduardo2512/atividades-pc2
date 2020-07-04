//Eduardo de Paiva Dias

public class Lance {
	private Pessoa pessoa;
	private double valor;
	public Lance() {
		pessoa = new Pessoa();
		valor=0;
	}
	public Lance(Pessoa pessoa, double valor) {
		pessoa=new Pessoa();
		this.pessoa=pessoa;
		this.valor=valor;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa=pessoa;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setValor(double valor) {
		this.valor=valor;
	}
	public double getValor() {
		return valor;
	}
}
