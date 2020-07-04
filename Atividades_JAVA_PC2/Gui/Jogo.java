
package janela;


public class Jogo {
    private int linha1;
    private int linha2;
    private int linha3;
    private int coluna1;
    private int coluna2;
    private int coluna3;
    private int diag1;
    private int diag2;
    private int p11;
    private int p12;
    private int p13;
    private int p21;
    private int p22;
    private int p23;
    private int p31;
    private int p32;
    private int p33;
    public Jogo(){
        linha1=0;
        linha2=0;
        linha3=0;
        coluna1=0;
        coluna2=0;
        coluna3=0;
        diag1=0;
        diag2=0;
        
    }
    public boolean cheacaVitoria(){
        int aux=0;
        if(linha1==1){
            aux=0;
        }
        else{
            aux=1;
        }
        if(linha3==1){
            aux=0;
        }
        else{
            aux=1;
        }
        if(linha2==1){
            aux=0;
        }
        else{
            aux=1;
        }
        if(coluna1==1){
            aux=0;
        }
        else{
            aux=1;
        }
        if(coluna2==1){
            aux=0;
        }
        else{
            aux=1;
        }
        if(coluna3==1){
            aux=0;
        }
        else{
            aux=1;
        }
        if(diag1==1){
            aux=0;
        }
        else{
            aux=1;
        }
        if(diag2==1){
            aux=0;
        }
        else{
            aux=1;
        }
        if(aux==0){
            return true;
        }
        return false;
    }

    public void setP11(int p11) {
        this.p11 = p11;
    }

    public void setP12(int p12) {
        this.p12 = p12;
    }

    public void setP13(int p13) {
        this.p13 = p13;
    }

    public void setP21(int p21) {
        this.p21 = p21;
    }

    public void setP22(int p22) {
        this.p22 = p22;
    }

    public void setP23(int p23) {
        this.p23 = p23;
    }

    public void setP31(int p31) {
        this.p31 = p31;
    }

    public void setP32(int p32) {
        this.p32 = p32;
    }

    public void setP33(int p33) {
        this.p33 = p33;
    }
    
    public void setLinha1(){
        if(p11+p12+p13==15){
            linha1=1;
        }
        else{
            linha1=0;
        }
    }
    public void setLinha2(){
        if(p21+p22+p23==15){
            linha2=1;
        }
        else{
            linha2=0;
        }
    }
    public void setLinha3(){
        if(p31+p32+p33==15){
            linha3=1;
        }
        else{
            linha3=0;
        }
    }
    public void setColuna1(){
        if(p11+p21+p31==15){
            coluna1=1;
        }
        else{
            coluna1=0;
        }
    }
    public void setColuna2(){
        if(p12+p22+p32==15){
            coluna2=1;
        }
        else{
            coluna2=0;
        }
    }
    public void setColuna3(){
        if(p13+p23+p33==15){
            coluna3=1;
        }
        else{
            coluna3=0;
        }
    }
    public void setDiag1(){
        if(p11+p22+p33==15){
            diag1=1;
        }
        else{
            diag1=0;
        }
    }
    public void setDiag2(){
        if(p13+p22+p31==15){
            diag2=1;
        }
        else{
            diag2=0;
        }
    }
    public void reset(){
        linha1=0;
        linha2=0;
        linha3=0;
        coluna1=0;
        coluna2=0;
        coluna3=0;
        diag1=0;
        diag2=0;
        p11=0;
        p12=0;
        p13=0;
        p21=0;
        p22=0;
        p23=0;
        p31=0;
        p32=0;
        p33=0;
    }
}
