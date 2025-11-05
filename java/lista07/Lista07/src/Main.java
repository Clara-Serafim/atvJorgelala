import entidades.Carro;
import entidades.Livro;
import entidades.Produto;

public class Main {
    public static void main(String[] args) {

        Livro l = new Livro("Memorias postumas", 200.0, "Machado de assis", 500);
        Carro c = new Carro("Fiat uno", 200000, 4, 4);

        l.showInfos();
        c.showInfos();
    }
}