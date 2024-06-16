package DesignPattern.Proxy.Solucao;

import java.util.logging.Logger;

import DesignPattern.Builder.Pessoa;
import DesignPattern.Proxy.PessoaRepository;

public class PessoaRepositoryProxy extends PessoaRepository {
    // Supondo que por algum motivo não devemos modificar PessoaRepository e queremos logs.
    // Cria-se uma nova classe que herda dela.
    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());
    @Override
    public void save(Pessoa pessoa) {
        log.info("Iniciando metodo save.");
        super.save(pessoa);
        log.info("Finalizando metodo save.");

    }

    @Override
    public Pessoa findById(long id) {
        log.info("Iniciando metodo findById.");
        Pessoa pessoa = super.findById(id);
        log.info("Finalizando metodo findById.");
        return pessoa;
    }
}
