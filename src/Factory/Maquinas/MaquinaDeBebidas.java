package Factory.Maquinas;

import Factory.Enum.TipoDeBebida;
import Factory.Snacks.*;


public class MaquinaDeBebidas implements MaquinaDeSnacks {
    @Override
    public Snacks entregaSnacks(Enum e) {

        Snacks bebida =  null;

        if(e.equals(TipoDeBebida.COCACOLA))
            bebida = new CocaCola();
        else if(e.equals(TipoDeBebida.SPRITE))
            bebida = new Sprite();
        else if(e.equals(TipoDeBebida.DELL_VALE))
            bebida = new DellVale();
        else if(e.equals(TipoDeBebida.CHÁ_GELADO))
            bebida = new CháGelado();

        return bebida;
    }

    @Override
    public String mostraAtual() {
        return null;
    }
}
