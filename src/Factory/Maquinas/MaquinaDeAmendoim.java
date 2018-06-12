package Factory.Maquinas;

import Factory.Enum.TipoDeAmendoim;
import Factory.Snacks.*;

import static Factory.Enum.TipoDeAmendoim.CHOCOLATE;

public class MaquinaDeAmendoim implements MaquinaDeSnacks {
    @Override
    public Snacks entregaSnacks(Enum e) {

        Snacks amendoim = null;

        if(e.equals(Factory.Enum.TipoDeAmendoim.CHOCOLATE))
            amendoim = new AmendoimDeChocolate();
        else if(e.equals(TipoDeAmendoim.JAPONES))
            amendoim = new AmendoimJapones();
        else if(e.equals(TipoDeAmendoim.SALGADO))
            amendoim = new AmendoimSalgado();

        return amendoim;
    }

    @Override
    public String mostraAtual() {
        return "Maquina de Amendoim";
    }
}
