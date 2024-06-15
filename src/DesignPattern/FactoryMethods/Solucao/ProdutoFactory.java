package DesignPattern.FactoryMethods.Solucao;

import DesignPattern.FactoryMethods.Produto;
import DesignPattern.FactoryMethods.ProdutoDigital;
import DesignPattern.FactoryMethods.ProdutoFisico;
import DesignPattern.FactoryMethods.TipoProdutoEnum;

public class ProdutoFactory {
    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) {
        switch (tipoProdutoEnum) {
            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                return produtoFisico;
            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return produtoDigital;       
            default:
                throw new IllegalArgumentException("Tipo de Produto nao disponivel.");
        }
    }
}
