package lista7;

public class main {
    public static void main(String[] args) {
        System.out.println("CADASTRO DE LIVRO");
        livro livro = new livro("NUNCA MINTA", 35.90, "A EMPREGADA", 256);
        livro.exibirInformacoes();
        
        System.out.println("CADASTRO DE CARRO");
        carro carro = new carro("Fusca", 15000, 4, 2);
        carro.exibirInformacoes();
        
        System.out.println("EXECUÇÃO DOS MÉTODOS");
        System.out.println("O livro '" + livro.getNome() + "' é barato? " + livro.ehBarato());
        System.out.println("O livro '" + livro.getNome() + "' é pequeno? " + livro.ehPequeno());
        System.out.println("O carro '" + carro.getNome() + "' é barato? " + carro.ehBarato());
    }
}
