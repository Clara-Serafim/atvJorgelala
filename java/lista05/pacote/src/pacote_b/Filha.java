package pacote_b;

import pacote_a.Base;

public class Filha  extends Base{

    public Filha (String attPublico, String attProtegido, String attPadrao, String attPrivado){
        super(attPublico, attProtegido, attPadrao, attPrivado);
    }



    public void testarAcesso(){
        //System.out.println(attPrivado);
        //System.out.println(attPadrao);
        System.out.println(attPublico);
        System.out.println(attProtegido);

    }


}
