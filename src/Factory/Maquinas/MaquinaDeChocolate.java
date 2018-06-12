package Factory.Maquinas;

import Factory.Enum.TipoDeChocolate;
import Factory.Snacks.*;


public class MaquinaDeChocolate implements MaquinaDeSnacks {
    @Override
    public Snacks entregaSnacks(Enum e) {

        Snacks chocolate = null;

        if(e.equals(TipoDeChocolate.BELGA))
            chocolate = new ChocolateBelga();
        else if(e.equals(TipoDeChocolate.AMARGO))
            chocolate = new ChocolateAmargo();
        else if(e.equals(TipoDeChocolate.AO_LEITE))
            chocolate = new ChocolateAoLeite();

        return chocolate;

    }

    @Override
    public String mostraAtual() {
        return "Maquina de Chocolate";
    }
}
