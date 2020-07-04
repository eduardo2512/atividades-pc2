public class Pessoa {
    private String nome;
    private String cpf;
    public Pessoa(){
        this.nome="";
        this.cpf="";
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public String getCpf(){
        return cpf;
    }
}