public class pessoa {
    private String nome;
    private int idade;


    public pessoa(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public void setIdade(int idade){
        this.idade=idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void apresentar (){
        System.out.println("Meu nome é " + nome + " e minha idade é " + idade + "anos");
    }
}
