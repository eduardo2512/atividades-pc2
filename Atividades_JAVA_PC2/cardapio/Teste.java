//Eduardo de Paiva Dias
import java.util.Scanner;
public class Teste {
	 public static void main(String args[]){
		 Scanner input= new Scanner(System.in);
		// Refeicao r = new Refeicao();
		 Cardapio c= new Cardapio();
		 
		 
		 int auxiliar=0;
			 do {
			 System.out.println("1-Incluir/Modificar cardapio\n");
			 System.out.println("2-Listar o cardapio\n");
			 System.out.println("3-Informacoes sobre a comida de um dia\n");
			 System.out.println("4-Calculo de custo e valor calorico diario\n");
			 System.out.println("5-Calculo de custo e valor calorico semanal\n");
			 System.out.println("6-Sair\n");
			 auxiliar=input.nextInt();
			
			 switch(auxiliar) {
			 case 1:
				 Refeicao r = new Refeicao();
				 System.out.println("Digite o dia que voce quer colocar o alimento: \n");
				 System.out.println("0-Domingo 1-Segunda 2-Terca 3-Quarta 4-Quinta 5-Sexta 6-Sabado\n");
				 int dia = input.nextInt();
				 System.out.println("Digite o horario que voce quer colocar o alimento: \n");
				 System.out.println("0-Cafe da Manha 1-Lanche da Manha 2-Almoco 3-Lanche da Tarde 4-Jantar 5-Ceia\n");
				 int horario = input.nextInt();
				 System.out.println("Digite o nome do alimento: \n");
				 String descricao = input.next();
				 System.out.println("Custo do alimento: \n");
				 double custo = input.nextDouble();
				 System.out.println("Valor calorico do alimento: \n");
				 double calorico = input.nextDouble();
				 System.out.println("0-Diet 1-Equilibrada 2-Light 3-LowCarb 4-LowFat 5-Natural  6-SemGluten 7-Vegano 8-Vegetariano\n");
				 System.out.println("Digite o numero da classificacao do alimento: \n");
				 int classificacao = input.nextInt();
				 
				 r.setDescricao(descricao);
				 r.setcustoRefeicao(custo);
				 r.setvalorCalorico(calorico);
				 r.setTipoClassificacao(classificacao);
				 
				 c.incluirRefeicao(horario, dia, r);
				 break;
			 case 2:
				 c.listarCardapio();
				 System.out.printf("\n");
				 break;
				 
			 case 3:
				 System.out.println("Digite o dia que voce quer colocar o alimento: \n");
				 System.out.println("0-Domingo 1-Segunda 2-Terca 3-Quarta 4-Quinta 5-Sexta 6-Sabado\n");
				 int diabiribiri = input.nextInt();
				 System.out.println("Digite o horario que voce quer colocar o alimento: \n");
				 System.out.println("0-Cafe da Manha 1-Lanche da Manha 2-Almoco 3-Lanche da Tarde 4-Jantar 5-Ceia\n");
				 int horariobiribiri = input.nextInt();
				 c.ExibirInformacoes(diabiribiri, horariobiribiri);
				 break;
				 
			 case 4:
				 System.out.printf("Digite o dia no qual voce quer saber: ");
				 int diaaux = input.nextInt();
				 System.out.println("Custo Diario:"+c.custodiario(diaaux));
				 System.out.println("Valor Calorico diario:"+c.custovalorcaloricodiario(diaaux));
				 
				 
				 break;
			
			 case 5:
				 System.out.println("Custo Semanal:"+c.custosemanal());
				 System.out.println("Valor Calorico semanal:"+c.custovalorcaloricosemanal());
				 break;
			 case 6:
				 auxiliar=0;
				 break;
				 
			default:
				System.out.println("Numero Invalido");
				break;
			 }
		 }while(auxiliar!=0);
			 
		 
		 
		 
		 
		 
	 }
}
