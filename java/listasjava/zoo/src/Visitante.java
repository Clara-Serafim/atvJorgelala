public class Visitante extends pessoa {

    private boolean socio;
    private String ingresso;

    public Visitante(String nome, int idade) {
        super(nome, idade);
    }

    public boolean getSocio(){
        return this.socio;
    }



    public String getIngresso() {
        return this.ingresso;
    }



}
