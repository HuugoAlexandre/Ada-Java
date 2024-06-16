package DesignPattern.Proxy.Solucao;

import DesignPattern.Builder.Pessoa;

public interface ProxyPessoa {
    void save(Pessoa pessoa);
    
    Pessoa findById(long id);
}
