//Eduardo de Paiva Dias
import java.util.Scanner;

public class Cardapio {
    private Refeicao [][] cardapioSemanal;
    Scanner input= new Scanner(System.in);
    
    public Cardapio(){
    	cardapioSemanal = new Refeicao [6][7];	
    }
    
    public void incluirRefeicao(int horario, int dia, Refeicao r){
        cardapioSemanal[horario][dia]=r;
    }
    public void listarCardapio() {
    	System.out.printf("                    0-S  1-T  2-Q  3-Q  4-S  5-S  6-D");
    	for(int i=0; i<6; i++) {
    		System.out.printf("\n");
	    	if(i==0){
	    		System.out.printf("0-Cafe da manha:   ");
	    	}
	    	if(i==1){
	    		System.out.printf("1-Lanche:          ");
	    	}
	    	if(i==2){
	    		System.out.printf("2-Almoço:          ");
	    	}
	    	if(i==3){
	    		System.out.printf("3-Lanche da tarde: ");
	    	}
	    	if(i==4){
	    		System.out.printf("4-Janta:           ");
	    	}
	    	if(i==5){
	    		System.out.printf("5-Ceia:            ");
	    	}
	    		
    		for(int i2=0; i2<7; i2++) {
    			if(cardapioSemanal[i][i2]!= null)
    				System.out.printf("[ "+cardapioSemanal[i][i2].getDescricao()+"  ]");
    			else {
    				System.out.printf("[ " + "  ]");
    			}
    			
    		}
    	}
    	System.out.printf("\n");
    }
    
    public double custodiario(int dia) {
    	double total=0;
    	for(int i=0; i<6; i++) {
    		if(cardapioSemanal[i][2]!=null) {
    			total=total+cardapioSemanal[i][dia].getcustoRefeicao();
    		}
    		else {
    			total=total+0;
    		}
    	}
    	return total;
    }
    public double custovalorcaloricodiario(int dia) {
    	double total=0;
    	for(int i=0; i<6; i++) {
    		if(cardapioSemanal[i][2]!=null) {
    			total=total+cardapioSemanal[i][dia].getvalorCalorico();
    		}
    		else {
    			total=total+0;
    		}
    	}
    	return total;
    }
    
    public double custovalorcaloricosemanal() {
    	double total=0;
    	for(int i=0; i<6; i++) { 
    		for(int i2=0; i2<7; i2++) {
    			if(cardapioSemanal[i][2]!=null) {
    				total=total+cardapioSemanal[i][i2].getvalorCalorico();
    			}
    			else {
    				total=total+0;
    			}
    		}
    	}
    	
    return total;
    }
    public double custosemanal() {
    	double total=0;
    	for(int i=0; i<6; i++) { 
    		for(int i2=0; i2<7; i2++) {
    			if(cardapioSemanal[i][2]!=null) {
    				total=total+cardapioSemanal[i][i2].getcustoRefeicao();
    			}
    			else {
    				total=total+0;
    			}	
    		}
    	}
    	
    return total;
    }
    
    public void ExibirInformacoes(int dia, int horario) {
    	System.out.println("Descricao:"+cardapioSemanal[horario][dia].getDescricao());
    	System.out.println("Custo:"+cardapioSemanal[horario][dia].getcustoRefeicao());
    	System.out.println("Valor Calorico:"+cardapioSemanal[horario][dia].getvalorCalorico());
    	System.out.println("Classificacao do alimento:"+cardapioSemanal[horario][dia].getTipoClassificacao());
    	
    }
    
    
}
