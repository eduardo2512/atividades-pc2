//Eduardo de Paiva Dias

import java.util.Scanner;

public class TesteLeilao {
	public static void main(String [] args) {
		Scanner input= new Scanner(System.in);
		Leilao l = new Leilao();
		System.out.println("1-Adicionar Lote\n");
		System.out.println("2-Dar Lance\n");
		System.out.println("3-Ver Lotes\n");
		System.out.println("4-Encerrar Leilao\n");
		int aux=1000;
		do {
			
			aux=input.nextInt();
			
			switch(aux) {
			case 1: 
				Lote lote = new Lote();
				System.out.println("Digite o nome do lote: ");
				String nomedolote = input.next();
				lote.setDescricao(nomedolote);
				l.adicionaLote(lote);
			break;
			
			case 2:
				// nome da pessoa, valor, indice 
				Pessoa pessoa = new Pessoa();
				System.out.println("Digite o seu nome: ");
				String nome = input.next();
				pessoa.setnome(nome);
				
				System.out.println("Digite o valor do lance: ");
				Double valor = input.nextDouble();
				Lance lance = new Lance();
				
				lance.setPessoa(pessoa);
				lance.setValor(valor);
				
				System.out.println("Digite em qual lote voce quer dar o lance: ");
				int lotenumero = input.nextInt();
				
				l.recebeLance(lotenumero-1, lance);
				
			break;
				
			case 3: 
					System.out.println(l.imprimeLotes());
			break;
			
			case 4:
					System.out.println(l.encerraLeilao());
					aux=10;
			break;
			
			default:
				System.out.println("Numero Invalido");
				break;
			 }
			
		}while (aux!=10);
	}
}
