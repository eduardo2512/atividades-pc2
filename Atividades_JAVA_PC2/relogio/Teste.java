//Eduardo de Paiva Dias
import java.util.Scanner;

public class Teste {
    public static void main(String args[]){
        Relogio r = new Relogio();
        Contador c= new Contador();
        Scanner input= new Scanner(System.in);

        System.out.println("Que tipo de formato voce quer seu relogio? \n ate 24 horas digite 1 \n ate 12 horas digite 2");
        int formato;
        formato= input.nextInt();

        if(formato==1){
            r.setFormato(true);
        }
        else if (formato==2){
            r.setFormato(false);
        }

        for(int i=0; i<1440; i++){
            r.ticTac();
            System.out.println(r.Exibir());
        }
    }
}