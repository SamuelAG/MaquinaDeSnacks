package Factory.Maquinas;

import Factory.Enum.TipoDeAmendoim;
import Factory.Snacks.*;

public class MaquinaDeAmendoim implements MaquinaDeSnacks {
    @Override
    public Snacks entregaSnacks(Enum e) {

        Snacks amendoim = null;

        TipoDeAmendoim tipoDeAmendoim = (TipoDeAmendoim) e;

        switch (tipoDeAmendoim){
            case CHOCOLATE:
                amendoim = new AmendoimDeChocolate();
                break;

            case JAPONES:
                amendoim = new AmendoimJapones();
                break;

            case SALGADO:
                amendoim = new AmendoimSalgado();
                break;

            default:
                System.out.println("erro");
        }

        return amendoim;
    }

    @Override
    public String mostraAtual() {
        return "Maquina de Amendoim";
    }
}
