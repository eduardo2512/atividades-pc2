
import java.util.Scanner;

public class Teste {
    
        public static void main(String[] args) {
            BancoDaCaixa c = new BancoDaCaixa();
            Scanner input= new Scanner(System.in);
            System.out.println("Informe o nome: \n");
            String nome= input.nextLine();
            System.out.println("Informe o cpf: \n");
            String cpf= input.nextLine();
            int tipoConta;
            System.out.println("Digite 1: para conta normal \nDigite 2: para conta especial\n");
            tipoConta=input.nextInt();
            System.out.println("Informe o saldo: \n");
            double saldo=input.nextDouble();
            Pessoa p = new Pessoa();
            p.setNome(nome);
            p.setCpf(cpf);
            c.setTitular(p);
            ContaEspecial e= new ContaEspecial();
          
            c.setSaldo(saldo);
        
            if(tipoConta==1){
                System.out.println("A conta do " + p.getNome()+ " tem " + c.getSaldo()+ " de saldo e seu cpf e " + p.getCpf()+ " \n");
            }
            if(tipoConta==2){
                System.out.println("A conta especial do " + p.getNome()+ " tem " + c.getSaldo()+ " de saldo e seu cpf e "+ p.getCpf()+ " \n");
            }
            
            int aux=5;
            while(aux!=0){
                System.out.println("1-Depositar\n 2-Sacar\n 3-Saldo\n 0-Sair:\n ");
                aux=input.nextInt();
    
                if(aux==1){
                    System.out.println("Digite quanto voce deseja depositar: \n");
                    double depositar=input.nextDouble();
                    c.Depositar(depositar);   
                }
                if(aux==2){
                    if(tipoConta==1){
                        System.out.println("Digite quanto voce deseja sacar: \n");
                        double valor = input.nextDouble();
                        boolean testeSacar=c.sacar(valor);
                        if(testeSacar==true){
                            System.out.println("Saque realizado \n");
                        }
                        else{
                            System.out.println("Nao tem Saldo \n");
                        } 
                    }
                    if(tipoConta==2){
                    	//System.out.println("Seu saque especial e de " + e.getsaldoEspecial()+"\n");
                        System.out.println("Digite quanto voce deseja sacar: \n");
                        double valorEspecial = input.nextDouble();
                        boolean testeSacarEspecial=e.sacar(valorEspecial);
                        if(testeSacarEspecial==true){
                            System.out.println("Saque realizado \n");
                        }
                        else{
                            System.out.println("Nao tem Saldo \n");
                        }  
                    }
                }
                if(aux==3){
                    System.out.println("O saldo e " + c.getSaldo() + " reais\n");
                }
            }
            System.out.println("Ate a proxima");
    }
}