public class Pessoa {
    private String nome;
    private int idade;
    private String data_nasc;

    public Pessoa(String nome, int idade, String data_nasc){
        this.idade = idade;
        this.data_nasc = data_nasc;
        this.nome = nome;
    }

    public String GetNome() {
        return this.nome;
    }
    public int GetIdade(){
        return this.idade;
    }

    public String GetData_Nasc(){
        return this.data_nasc;
    }

}
