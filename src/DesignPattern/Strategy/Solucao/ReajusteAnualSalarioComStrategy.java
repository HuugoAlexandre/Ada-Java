package DesignPattern.Strategy.Solucao;

import DesignPattern.Strategy.Funcionario;

public class ReajusteAnualSalarioComStrategy {
    public void calculaReajusteAnual(Funcionario funcionario, CalculadorReajusteAnualSalario calculador) {
       calculador.calculaReajusteAnual(funcionario);
    }
}
