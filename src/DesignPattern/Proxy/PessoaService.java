package DesignPattern.Proxy;

import DesignPattern.Builder.Pessoa;
import DesignPattern.Proxy.Solucao.PessoaRepositoryProxy;

public class PessoaService {
    private PessoaRepositoryProxy pessoaRepositoryProxy;

    public PessoaService(PessoaRepositoryProxy PessoaRepositoryProxy) {
        this.pessoaRepositoryProxy = PessoaRepositoryProxy;
    } 

    public void save(Pessoa pessoa) {pessoaRepositoryProxy.save(pessoa);}

    public Pessoa findById(Long id) {return pessoaRepositoryProxy.findById(id);}
}
