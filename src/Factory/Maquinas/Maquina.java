package Factory.Maquinas;

import Factory.Enum.*;

public class Maquina {
    public static void main(String[] args) {

        MaquinaDeSnacks maquina = new MaquinaDeAmendoim();
        maquina.entregaSnacks(TipoDeAmendoim.CHOCOLATE);
        maquina.entregaSnacks(TipoDeAmendoim.SALGADO);
        maquina.entregaSnacks(TipoDeAmendoim.JAPONES);

        System.out.println();

        maquina = new MaquinaDeBebidas();
        maquina.entregaSnacks(TipoDeBebida.CHÁ_GELADO);
        maquina.entregaSnacks(TipoDeBebida.COCACOLA);
        maquina.entregaSnacks(TipoDeBebida.DELL_VALE);
        maquina.entregaSnacks(TipoDeBebida.SPRITE);

        System.out.println();

        maquina = new MaquinaDeJujubas();
        maquina.entregaSnacks(TipoDeJujuba.AÇUCARADA);
        maquina.entregaSnacks(TipoDeJujuba.GOMA);
        maquina.entregaSnacks(TipoDeJujuba.IOGURTE);

        System.out.println();

        maquina = new MaquinaDeChocolate();
        maquina.entregaSnacks(TipoDeChocolate.AMARGO);
        maquina.entregaSnacks(TipoDeChocolate.AO_LEITE);
        maquina.entregaSnacks(TipoDeChocolate.BELGA);



    }
}