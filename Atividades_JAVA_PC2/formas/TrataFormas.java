//Eduardo de Paiva Dias

import java.util.ArrayList;
import java.util.Iterator;

public class TrataFormas{
    private ArrayList<Forma> formas;
    
    public TrataFormas(){
    formas = new ArrayList<>();
    }
    
    public TrataFormas(ArrayList<Forma> formas) {
        this.formas = formas;
    }
    public void setFormas(ArrayList<Forma> formas){
        this.formas=formas;
    }
    public ArrayList<Forma> getFormas(){
        return formas;
    }
    public boolean adicionarForma(Forma forma){
        formas.add(forma);
        return true;
    }
    public boolean removeForma(String descricao){
        Iterator<Forma> it = formas.iterator();
        Forma aux;
        while(it.hasNext()){
            aux= it.next();
            if(descricao.equals(aux.getDescricao())){
                formas.remove(aux);
                return true;
            }
        }
        return false;
    }
    public String executaCalculo(){
        Iterator<Forma> it = formas.iterator();
        Forma aux;
        String retorno="";
        
        while(it.hasNext()){
            aux=it.next();
            aux.obterArea();
            retorno=retorno+"\nDescricao: "+aux.getDescricao();
            if (aux instanceof FormaTridimensional){
                retorno=retorno+"\nVolume: "+((FormaTridimensional)aux).obterVolume();
            }
            retorno=retorno+"\nArea: "+aux.obterArea();
            
        }
        return retorno;
    }
   
}



