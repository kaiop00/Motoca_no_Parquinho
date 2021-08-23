public class Pessoa {
    
    public String nome="";
    public int idade = 0;

    public Pessoa(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "[" 
                + this.nome
                + ":" 
                + this.idade
                + "]";
    }
}
