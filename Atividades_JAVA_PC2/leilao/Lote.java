//Eduardo de Paiva Dias

public class Lote {
	private String descricao;
	private Lance maiorLance;
	public Lote() {
		descricao="";
		maiorLance = new Lance();
	}
	public Lote(String descricao, Lance maiorLance) {
		maiorLance = new Lance();
		this.maiorLance=maiorLance;
		this.descricao=descricao;
	}
	public boolean verificaLance(Lance dado) {
		if(dado.getValor() > maiorLance.getValor()) {
			return true;
		}
		return false;
	}
	
	public void setmaiorLance(Lance dado) {
		maiorLance=dado;
	}
	public Lance getmaiorLance() {
		return maiorLance;
	}
	public void  setDescricao(String descricao) {
		this.descricao=descricao;
	}
	public String getDescricao() {
		return descricao;
	}
}
