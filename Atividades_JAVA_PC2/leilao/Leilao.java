//Eduardo de Paiva Dias

import java.util.ArrayList;
public class Leilao {
	private ArrayList<Lote> leilao;
	private static Lote auxiliar;
	public Leilao() {
		leilao = new ArrayList<Lote>(); 
		auxiliar = new Lote();
	}
	
	// adicionar lote
	public void adicionaLote(Lote x) {
		leilao.add(x);
	}
	
	//recebe lance (verifica se é maior lance) (ver em qual posicao ele ta recebendo o lote)
	public void recebeLance(int indice, Lance x) {
		auxiliar = leilao.get(indice);
		if(auxiliar.verificaLance(x)) {
			auxiliar.setmaiorLance(x);
			leilao.remove(indice);
			leilao.add(indice, auxiliar);
		}
	}
	// Descricao e Valor do Lote 
	public String imprimeLotes() {
		String imprimirlotesaa="";
		for(int i=0; i < leilao.size(); i++) {
			auxiliar = leilao.get(i);
			imprimirlotesaa+="Descricao: "+auxiliar.getDescricao()+" Maior Lance: "+auxiliar.getmaiorLance().getValor()+"\n";
		}
		return imprimirlotesaa;
	}
	
	// pegar todos os lotes e falar quem ganhou pelo valor maximo

	public String encerraLeilao() {
		String imprimirlotesaa="";
		for(int i=0; i < leilao.size(); i++) {
			auxiliar = leilao.get(i);
			imprimirlotesaa=imprimirlotesaa+"\n"+auxiliar.getmaiorLance().getPessoa().getnome()+" "+auxiliar.getDescricao()+" "+auxiliar.getmaiorLance().getValor()+"\n";
		}
		return imprimirlotesaa;
	}
	
}
	


