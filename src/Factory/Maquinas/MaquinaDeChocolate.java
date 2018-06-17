package Factory.Maquinas;

import Factory.Enum.TipoDeChocolate;
import Factory.Snacks.*;

public class MaquinaDeChocolate implements MaquinaDeSnacks {
    @Override
    public Snacks entregaSnacks(Enum e) {

        Snacks chocolate = null;

        TipoDeChocolate tipoDeChocolate = (TipoDeChocolate) e;

        switch (tipoDeChocolate){
            case BELGA:
                chocolate = new ChocolateBelga();
                break;

            case AMARGO:
                chocolate = new ChocolateAmargo();
                break;

            case AO_LEITE:
                chocolate = new ChocolateAoLeite();
                break;

            default:
                System.out.println("erro");
        }

        return chocolate;
    }
}
