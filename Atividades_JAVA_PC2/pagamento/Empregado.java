package pagamento;
public abstract class Empregado implements Pagavel {
	private String nome;
	private String sobrenome;
	private int numeroidentificacao;
	public Empregado(String nome, String sobrenome, int numeroidentificacao ) {
		this.nome=nome;
		this.sobrenome=sobrenome;
		this.numeroidentificacao=numeroidentificacao;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return nome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome=sobrenome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setNumeroidentificacao(int numeroidentificacao) {
		this.numeroidentificacao=numeroidentificacao;
	}
	public int getNumeroidentificacao() {
		return numeroidentificacao;
	}
	public abstract double getValorAPagar();
}
