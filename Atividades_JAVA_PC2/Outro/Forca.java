
package forca;
import java.util.ArrayList;

public class Forca {
    private int tentativas;
    private ArrayList<Character> palavra;
    private String letras;
    private String palavraStr;
    
    public Forca(){
        tentativas=0;
        letras=" ";
        palavra= new ArrayList<Character>();
        palavraStr=" ";
        strToChar();
    }

    public int getTentativas() {
        return tentativas;
    }
    public void strToChar(){
        ManArq q=new ManArq();
        String str=q.randPalavra();
        palavraStr=str;
        for(int x=0;x<str.length();x++){
            palavra.add(str.charAt(x));
        }
    }
    //retorna true se o usuario pode jogar
    public boolean checaLose(){
        if(tentativas<=9){
            return true;
        }
        return false;
    }

    public String getPalavraStr() {
        return palavraStr;
    }
    public void tentMM(){
        tentativas++;
    }
    //retorna true se tem a letra
    public boolean checaLetra(char c){
        if(palavra.contains(c)){
            return true;
        }
        letrasErradas(c);
        return false;
    }
    public void letrasErradas(char c){
        letras=letras+c;
    }

    public String getLetras() {
        return letras;
    }
    public int posLetras(char c){
        int a=palavra.indexOf(c);
        if(a<0){
            return a;
        }
        palavra.remove(a);
        palavra.add(a,'1');
        return a;
    }
    public String getLet(int a){
        String str=String.valueOf(palavra.get(a));
        return str;
    }
    public void novoJogo(){
        palavra.clear();
        tentativas=0;
        letras=" ";
        strToChar();
    }
}
