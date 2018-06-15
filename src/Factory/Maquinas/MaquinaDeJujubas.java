package Factory.Maquinas;

import Factory.Enum.TipoDeJujuba;
import Factory.Snacks.*;

public class MaquinaDeJujubas implements MaquinaDeSnacks{
    @Override
    public Snacks entregaSnacks(Enum e) {

        Snacks jujuba = null;

        TipoDeJujuba tipoDeJujuba = (TipoDeJujuba) e;

        switch (tipoDeJujuba){
            case GOMA:
                jujuba = new JujubaDeGoma();
                break;

            case AÇUCARADA:
                jujuba = new JujubaAçucarada();
                break;

            case IOGURTE:
                jujuba = new JujubaDeIogurte();
                break;

            default:
                System.out.println("erro");
        }

        return jujuba;
    }

    @Override
    public String mostraAtual() {
        return "Maquina de Jujubas";
    }
}
