public class ContaEspecial extends BancoDaCaixa {
    private double saldoEspecial;
    public ContaEspecial(){
        super();
        saldoEspecial=4000.0;
    }
    public void setsaldoEspecial(double saldoEspecial){
        this.saldoEspecial=saldoEspecial;
    }
    public double getsaldoEspecial(){
        return this.saldoEspecial;
    }
    public boolean sacar(double valor){
        if(getSaldo()+saldoEspecial>=valor){
            setSaldo(getSaldo()-valor);
           
            return true;
        }
        return false;
    }
}