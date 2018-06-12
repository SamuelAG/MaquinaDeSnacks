package Factory.Maquinas;

import Factory.Enum.TipoDeJujuba;
import Factory.Snacks.*;


public class MaquinaDeJujubas implements MaquinaDeSnacks{
    @Override
    public Snacks entregaSnacks(Enum e) {

        Snacks jujuba = null;

        if(e.equals(TipoDeJujuba.GOMA))
            jujuba = new JujubaDeGoma();
        else if(e.equals(TipoDeJujuba.AÇUCARADA))
            jujuba = new JujubaAçucarada();
        else if(e.equals(TipoDeJujuba.IOGURTE))
            jujuba = new JujubaDeIogurte();

        return jujuba;
    }

    @Override
    public String mostraAtual() {
        return "Maquina de Jujubas";
    }
}
