package DesignPattern.Strategy.Solucao;

import java.math.BigDecimal;

import DesignPattern.Strategy.Funcionario;

public class CalculadorReajusteAnualSalarioPJ implements CalculadorReajusteAnualSalario {
    @Override
    public void calculaReajusteAnual(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));
    }
}
