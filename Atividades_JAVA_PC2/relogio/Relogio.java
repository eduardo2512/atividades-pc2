//Eduardo de Paiva Dias
public class Relogio {
    private Contador horas;
    private Contador minutos;
    private boolean formato;
    public Relogio(){
        horas = new Contador();
        minutos = new Contador();
        formato=false;
    }
    public void setHoras(Contador horas){
        this.horas=horas;
    }
    public Contador gethoras(){
        return horas;
    }
    public void setMinutos(Contador minutos){
        this.minutos=minutos;
    }
    public Contador getminutos(){
        return minutos;
    }
    public boolean getFormato(){
        return formato;
    }
    public void setFormato(boolean formato){
        this.formato=formato;
    }
    public void ticTac(){
        minutos.contar();
        if(minutos.getMostrador()==60){
            horas.contar();
            if(horas.getMostrador()==24){
                horas.setMostrador(0);
            }
            minutos.setMostrador(0);
        }
    }
    public String Exibir(){
        if(formato==true){
        	if(horas.getMostrador()<10) {
        		if(minutos.getMostrador()<10) {
        			return "0"+horas.getMostrador()+":"+"0"+minutos.getMostrador();
        		}
        		else {
        			return "0"+horas.getMostrador()+":"+minutos.getMostrador();
        		}
          	}
        	else {
        		if(minutos.getMostrador()<10) {
        			return horas.getMostrador()+":"+"0"+minutos.getMostrador();
        		}
        		else {
        			return horas.getMostrador()+":"+minutos.getMostrador();
        		}
        	}
        }
        else{
            if(horas.getMostrador()>12){
                return horas.getMostrador()-12+":"+minutos.getMostrador()+"pm";
            }
            else if(horas.getMostrador()==12) {
            	return horas.getMostrador()+":"+minutos.getMostrador()+"pm";
            }
            else {
               	return horas.getMostrador()+":"+minutos.getMostrador()+"am";
            	
            }          
        }
    }
}
