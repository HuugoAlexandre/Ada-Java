package DesignPattern.Prototype.Problema;

import DesignPattern.Prototype.Botao;
import DesignPattern.Prototype.TipoBordaEnum;

public class BotaoAzul extends Botao {
    public BotaoAzul() {
        setCor("Azul");
        setAltura(25);
        setLargura(125);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}
