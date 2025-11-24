public class Ave extends  Animal{
    public Ave(String nome, String especie, int numPatas) {
        super(nome, especie, numPatas);

    }


    public void voar(){
        System.out.println("A ave " + getaNome() + " voou");
    }



}
