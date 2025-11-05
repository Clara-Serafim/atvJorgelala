package lista7;

public class carro extends produto {
    private int quantidadeRodas;
    private int quantidadePortas;
    
    public carro(String nome, double preco, int quantidadeRodas, int quantidadePortas) {
        super(nome, preco);
        this.quantidadeRodas = quantidadeRodas;
        this.quantidadePortas = quantidadePortas;
    }
    
    public boolean ehBarato() {
        return getPreco() < 10000;
    }
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Quantidade de rodas: " + quantidadeRodas);
        System.out.println("Quantidade de portas: " + quantidadePortas);
      
    }
}

