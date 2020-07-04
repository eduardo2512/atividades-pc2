
package forca;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManArq {
    String palavra;
    public ManArq(){
        palavra="";
    }
    public String randPalavra(){
        int a;
        Random rand=new Random();
        a=rand.nextInt(500);
        try{
            FileReader arq = new FileReader("Palavras.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            for(int cont=0;cont<=a;cont++){
                palavra= lerArq.readLine();
            }
        }catch(IOException e){
            System.err.println("Erro na abertura do arquivo: " + e.getMessage());
        }
        return palavra;
    }
}
