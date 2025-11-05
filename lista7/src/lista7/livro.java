package lista7;


public class livro extends produto {
	  private String autor;
	    private int quantidadePaginas;
	    
	    public livro(String nome, double preco, String autor, int quantidadePaginas) {
	    	super(nome, preco);	
	    	this.autor = autor;
	        this.quantidadePaginas = quantidadePaginas;
	    }
	    
	    public boolean ehPequeno() {
	        return quantidadePaginas < 100;
	    }
	    
	    public void exibirInformacoes() {
	        super.exibirInformacoes();
	        System.out.println("Autor: " + autor);
	        System.out.println("Quantidade de páginas: " + quantidadePaginas);
	        System.out.println("É pequeno: " + (ehPequeno() ? "Clarinho que sim" : "Não né bb"));
	        System.out.println();//para dar um espaço
	      
	    }

}
