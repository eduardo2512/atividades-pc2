//Eduardo de Paiva Dias
public class Refeicao {
    private static String [] classificacao;
    private double custoRefeicao;
    private double valorCalorico;
    private String descricao;
    private int tipo;
    private String tipoClassificacao;
    public Refeicao(){
    	classificacao = new String[9];
    	classificacao[0]="0-Diet";
    	classificacao[1]="1-Equilibrada";
    	classificacao[2]="2-Light";
    	classificacao[3]="3-LowCarb";
    	classificacao[4]="4-LowFat";
    	classificacao[5]="5-Natural";
    	classificacao[6]="6-SemGluten";
    	classificacao[7]="7-Vegano";
    	classificacao[8]="8-Vegetariano";
	    custoRefeicao = 0.0;
	    valorCalorico = 0.0;
	    tipo=0;
	    descricao="";
	    tipoClassificacao="";
    }
    public void setTipoClassificacao(int tipo) {
    	tipoClassificacao=classificacao[tipo];
    }
    public String getTipoClassificacao() {
    	return tipoClassificacao;
    }
    
    public void setTipo(int tipo) {
    	this.tipo=tipo;
    }
    public int getTipo() {
    	return this.tipo;
    }
    public void setcustoRefeicao(double custoRefeicao) {
    	this.custoRefeicao=custoRefeicao;
    }
    public double getcustoRefeicao() {
    	return custoRefeicao;
    }
    public void setvalorCalorico(double valorCalorico) {
    	this.valorCalorico=valorCalorico;
    }
    public double getvalorCalorico() {
    	return this.valorCalorico;
    }
    public void setDescricao(String descricao) {
    	this.descricao=descricao;
    }
    public String getDescricao() {
    	return this.descricao;
    }
}