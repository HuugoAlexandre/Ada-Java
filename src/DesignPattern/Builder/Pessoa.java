package DesignPattern.Builder;

import java.time.LocalDate;

public class Pessoa {
    private String name;
    private String sobrenome;
    private String documento;
    private String email;
    private String apelido;
    private LocalDate dataNascimento;

    
    private Pessoa(String name, String sobrenome, String documento, String email, String apelido,
            LocalDate dataNascimento) {
        this.name = name;
        this.sobrenome = sobrenome;
        this.documento = documento;
        this.email = email;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getSobrenome() {
        return sobrenome;
    }


    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }


    public String getDocumento() {
        return documento;
    }


    public void setDocumento(String documento) {
        this.documento = documento;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getApelido() {
        return apelido;
    }


    public void setApelido(String apelido) {
        this.apelido = apelido;
    }


    public LocalDate getDataNascimento() {
        return dataNascimento;
    }


    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    @Override
    public String toString() {
        return "TestePessoa [name=" + name + ", sobrenome=" + sobrenome + ", documento=" + documento + ", email="
                + email + ", apelido=" + apelido + ", dataNascimento=" + dataNascimento + "]";
    }

    public static class PessoaBuilder {
        private String nome;
        private String sobrenome;
        private String documento;
        private String email;
        private String apelido;
        private LocalDate dataNascimento;
    
        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }
        public PessoaBuilder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }
        public PessoaBuilder documento(String documento) {
            this.documento = documento;
            return this;
        }
        public PessoaBuilder email(String email) {
            this.email = email;
            return this;
        }
        public PessoaBuilder apelido(String apelido) {
            this.apelido = apelido;
            return this;
        }
        public PessoaBuilder dataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }
    
        public Pessoa build(){
            return new Pessoa(nome, sobrenome, documento, email, apelido, dataNascimento);
        }
    }
    
}
