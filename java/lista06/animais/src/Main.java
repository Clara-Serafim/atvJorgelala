public class Main {
    public static void main(String[] args) {

        Animais peixe = new Animais();
        int numSeriePeixe = peixe.defNumSerie();
        System.out.println("Eu sou o animal: " + numSeriePeixe);


        Animais cavalo = new Animais("peixe", "masculino" );
        int numSerieCavalo = cavalo.defNumSerie();
        System.out.println("Eu sou o animal: " + (numSeriePeixe + numSerieCavalo));


        Animais urso = new Animais("urso", "feminino", "Lola", "05/08/2023");
        int numSerieUrso = urso.defNumSerie();
        System.out.println("Eu sou n=o animal: " + (numSeriePeixe + numSerieCavalo + numSerieUrso));

        System.out.println("A quantidade de animais é: " + Animais.getQuantidadeDeAnimais());

        urso.infoAnimais();
    }
}