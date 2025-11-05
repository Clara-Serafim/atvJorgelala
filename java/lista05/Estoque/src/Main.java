public class Main {
    public static void main(String[] args) {
        Produto ovos = new Produto("Caixa de ovos", 2.00, 20);
        Produto leite = new Produto("Caixa de leite", 9.00,100);

        ovos.setQuantidadeEstoque(50);
        ovos.exibirDados();
        String nomeOvos = ovos.getNome();
        System.out.println(nomeOvos);
        //ovos.preco = 12;
        //Saida: java: preco has private access in Produto

        ovos.exibirDados();
        leite.exibirDados();

        double tot = ovos.calcularValorTotal();
        System.out.println("O preço total é: " + tot);

        double totn = ovos.calcularValorTotal(10);
        System.out.println("O preço total com a quantidade nova é: " + totn);

        ovos.setQuantidadeEstoque(-2);


    }
}