package com.example.practicingapi.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table(name = "TB_PAGADOR")
public class Pagador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String numeroCpfCnpj;

    private String nome;

    private String endereco;
    private String bairro;
    private String cidade;
    private String cep;
    private String uf;
    private ArrayList<String> email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumeroCpfCnpj() {
        return numeroCpfCnpj;
    }

    public void setNumeroCpfCnpj(String numeroCpfCnpj) {
        this.numeroCpfCnpj = numeroCpfCnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public ArrayList<String> getEmail() {
        return email;
    }

    public void setEmail(ArrayList<String> email) {
        this.email = email;
    }
}
