package DesignPattern.Prototype.Problema;

import DesignPattern.Prototype.Botao;
import DesignPattern.Prototype.TipoBordaEnum;

public class BotaoVermelho extends Botao {
    public BotaoVermelho() {
        setCor("Vermelho");
        setAltura(30);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.FINA);
    }
}
