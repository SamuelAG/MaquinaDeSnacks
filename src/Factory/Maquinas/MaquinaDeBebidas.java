package Factory.Maquinas;

import Factory.Enum.TipoDeBebida;
import Factory.Snacks.*;

public class MaquinaDeBebidas implements MaquinaDeSnacks {
    @Override
    public Snacks entregaSnacks(Enum e) {

        Snacks bebida =  null;

        TipoDeBebida tipoDeBebida = (TipoDeBebida) e;

        switch (tipoDeBebida){
            case COCACOLA:
                bebida = new CocaCola();
                break;

            case SPRITE:
                bebida = new Sprite();
                break;

            case DELL_VALE:
                bebida = new DellVale();
                break;

            case CHÁ_GELADO:
                bebida = new CháGelado();
                break;

            default:
                System.out.println("erro");
        }

        return bebida;
    }
}
