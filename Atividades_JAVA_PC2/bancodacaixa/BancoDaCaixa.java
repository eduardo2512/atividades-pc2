public class BancoDaCaixa {
    private double saldo;
    private Pessoa titular;
    public BancoDaCaixa(){
        this.saldo=0.0;
        this.titular = new Pessoa();
    }
    
    public boolean sacar(double valor){
        if(valor<=saldo){
            saldo=saldo-valor;
            return true;
        }
        return false;
    }
    
    public void Depositar(double depositar){
        saldo=saldo+depositar;
    }
    
    
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    public void setTitular(Pessoa titular){
        this.titular=titular; 
    }
    public Pessoa getTitular(){
        return titular;
    }
    /*public void setNome(String nomeTitular){
        this.nomeTitular=nomeTitular;
    }
    public String getNome(){
        return this.nomeTitular;
    }*/
}


