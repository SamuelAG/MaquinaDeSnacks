package Factory.Maquinas;

import Factory.Snacks.Snacks;

public interface MaquinaDeSnacks {
    public Snacks entregaSnacks(Enum e);
    public String mostraAtual();
}