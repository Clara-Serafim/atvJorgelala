package pacote_b;

import pacote_a.Base;

public class Principal {
    public static void main(String[] args) {
        Filha classe = new Filha("A", "B", "C", "D");
        classe.testarAcesso(); // So aparece o attPublico e o protegido

    }
}