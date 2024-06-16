package DesignPattern.ChainOfResponsibility.Solucao;

import java.math.BigDecimal;
import DesignPattern.ChainOfResponsibility.Carro;

public class SemDesconto extends DescontoCarro{
    public SemDesconto(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        return BigDecimal.ZERO;
    }
}
