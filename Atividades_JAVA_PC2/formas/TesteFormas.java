//Eduardo de Paiva Dias

import java.util.Scanner;
public class TesteFormas {  
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        TrataFormas tf= new TrataFormas();
        int aux=1000;
        do{
        	System.out.println("Digite 0 - Para sair");
            System.out.println("Digite 1 - Para criar forma bidimensional");
            System.out.println("Digite 2 - Para criar forma tridimensional");
            System.out.println("Digite 3 - Para fazer os calculos de area e volume(se for uma figura tridimensional)");
            
            aux=input.nextInt();
            switch(aux){
                case 1:         
                    System.out.println("1 - Para triangulo: ");
                    System.out.println("2 - Para quadrado: ");
                    System.out.println("3 - Para circulo: ");
                    int aux2=1000;
                	aux2=input.nextInt();
                    switch(aux2){
                        case 1:
                            System.out.println("Digite a base: ");
                            double base=input.nextDouble();
                            System.out.println("Digite a altura: ");
                            double altura=input.nextDouble();
                            Triangulo tri = new Triangulo(base,altura,0,"Triangulo");
                            tf.adicionarForma(tri);
                            break;
                        case 2:
                            System.out.println("Digite o lado: ");
                            double lado=input.nextDouble();
                            Quadrado qua= new Quadrado(lado,0,"Quadrado");
                            tf.adicionarForma(qua);
                            break;
                        case 3:
                            System.out.println("Digite o raio: ");
                            double raio=input.nextDouble();
                            Circulo cir= new Circulo(raio,0,"Circulo");
                            tf.adicionarForma(cir);
                            break;
                        default:
                            System.out.println("Invalido");
                    }
                    break;
                case 2:
                    System.out.println("1 - Para esfera: ");
                    System.out.println("2 - Para cubo: ");
                    System.out.println("3 - Para tetraedro: ");
                    aux2=input.nextInt();
                    switch(aux2){
                        case 1:
                            System.out.println("Digite o raio:");
                            double raio2=input.nextDouble();
                            Esfera es= new Esfera(raio2,0,0,"Esfera");
                            tf.adicionarForma(es);
                            break;
                        case 2:
                            System.out.println("Digite o lado: ");
                            double lado2=input.nextDouble();
                            Cubo cub = new Cubo(lado2,0,0,"Cubo");
                            tf.adicionarForma(cub);
                            break;
                        case 3:
                            System.out.println("Digite a aresta: ");
                            double aresta2=input.nextDouble();
                            Tetraedro tet= new Tetraedro(aresta2,0,0,"Tetraedro");
                            tf.adicionarForma(tet);
                            break;
                        default:
                            System.out.println("Invalido!");
                    }
                    break;
                case 3:
                    System.out.println(tf.executaCalculo());
                    break;
                default:
                    System.out.println("Invalido!");
            }                
        }while(aux!=0);       
        
    }
          
}
