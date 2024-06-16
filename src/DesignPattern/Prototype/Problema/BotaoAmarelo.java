package DesignPattern.Prototype.Problema;

import DesignPattern.Prototype.Botao;
import DesignPattern.Prototype.TipoBordaEnum;

public class BotaoAmarelo extends Botao {
    public BotaoAmarelo() {
        setCor("Amarelo");
        setAltura(40);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}
