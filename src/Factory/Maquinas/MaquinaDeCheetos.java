package Factory.Maquinas;

import Factory.Snacks.Cheetos;
import Factory.Snacks.Snacks;

public class MaquinaDeCheetos implements MaquinaDeSnacks {
    @Override
    public Snacks entregaSnacks(Enum e) {
        return new Cheetos();
    }

    @Override
    public String mostraAtual() {
        return "Maquina de Cheetos";
    }
}
