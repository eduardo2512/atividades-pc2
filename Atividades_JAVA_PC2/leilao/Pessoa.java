//Eduardo de Paiva Dias

public class Pessoa {
	private String nome;
	public Pessoa() {
		nome="";
	}
	public Pessoa(String nome) {
		this.nome=nome;
	}
	
	public void setnome(String nome){
		this.nome=nome;
	}
	
	public String getnome() {
		return nome;
	}
}
