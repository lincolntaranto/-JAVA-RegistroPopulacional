public class User {

    private String primeiroNome;
    private String segundoNome;
    private int idade;
    private String endereco;

    public void setPrimeiroNome(String primeironome){
        this.primeiroNome = primeironome;
    }

    public String getPrimeiroNome(){
        return primeiroNome;
    }

    public void setSegundoNome(String segundonome){
        this.segundoNome = segundonome;
    }

    public String getSegundoNome(){
        return segundoNome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }   

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEndereco(){
        return endereco;
    }   

}
