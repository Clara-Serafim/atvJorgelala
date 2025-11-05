package lista7;

public class produto {
	private String nome;
    private double preco;
    
    public produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public boolean ehBarato() {
        return preco < 50;
    }
    
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("É barato: " + (ehBarato() ? "Sisi" : "nope"));
    }
    
    public String getNome() { return nome; }
    public double getPreco() { return preco; }

}
