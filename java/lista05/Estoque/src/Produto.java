import java.io.PrintStream;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque > 0){
        this.quantidadeEstoque = quantidadeEstoque;
            }
        else{
            System.out.println("Erro! Quantidade invalida!");
        }

    }

    public void setPreco(int preco){
        this.preco = preco;
    }


    public double calcularValorTotal(){
        return quantidadeEstoque*preco;
    }

    public double calcularValorTotal(int quantidadeAdicional){
        return (quantidadeAdicional + quantidadeEstoque) * preco;
    }

    public void exibirDados(){
        System.out.printf(" Nome: %s %n Preço: %.2f %n Quantidade em estoque: %d%n", nome, preco, quantidadeEstoque);
    }
}
