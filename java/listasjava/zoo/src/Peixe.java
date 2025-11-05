public class Peixe extends Animal{
    public Peixe(String nome, String especie, int numPatas) {
        super(nome, especie, numPatas);

    }


    public void nadar(){
        System.out.println("O peixe " + getaNome() + " nadou");
    }


}


