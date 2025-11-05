package entidades;

public class Livro extends Produto{
    private String autor;
    private int quantPaginas;

    public Livro(String nome, double preco, String autor, int quantPaginas) {
        super(nome, preco);
        this.autor = autor;
        this.quantPaginas = quantPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void getTamanho(){
        if (quantPaginas < 100){
            System.out.println("É um livro pequeno");
        }
        else{
            System.out.println("É um livro grande");
        }
    }

    public int getQuantPaginas() {
        return quantPaginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setQuantPaginas(int quantPaginas) {
        this.quantPaginas = quantPaginas;
    }

    public void showInfos(){
        System.out.printf("%nO nome do livro é: %s %nO preço é: %.2f %nO autor é %s %nPaginas: %d ", getNome(),getPreco(),getAutor(), getQuantPaginas());
    }
}
