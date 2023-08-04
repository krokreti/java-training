package com.example.practicingapi.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_BOLETO")
public class Boleto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Long numeroContrato;
    private Long modalidade;
    private Long numeroContaCorrente;
    private String especieDocumento;
    private LocalDateTime dataEmissao;
    private String seuNumero;
    private Long identificacaoEmissaoBoleto;
    private Long identificacaoDistribuicaoBoleto;
    private Double valor;
    private LocalDateTime dataVencimento;
    private Long tipoDesconto;
    private Long tipoMulta;
    private Long tipoJurosModa;
    private Long numeroParcela;
    private Pagador pagador;

    public Long getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(Long numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public Long getModalidade() {
        return modalidade;
    }

    public void setModalidade(Long modalidade) {
        this.modalidade = modalidade;
    }

    public Long getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(Long numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

    public String getEspecieDocumento() {
        return especieDocumento;
    }

    public void setEspecieDocumento(String especieDocumento) {
        this.especieDocumento = especieDocumento;
    }

    public LocalDateTime getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDateTime dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getSeuNumero() {
        return seuNumero;
    }

    public void setSeuNumero(String seuNumero) {
        this.seuNumero = seuNumero;
    }

    public Long getIdentificacaoEmissaoBoleto() {
        return identificacaoEmissaoBoleto;
    }

    public void setIdentificacaoEmissaoBoleto(Long identificacaoEmissaoBoleto) {
        this.identificacaoEmissaoBoleto = identificacaoEmissaoBoleto;
    }

    public Long getIdentificacaoDistribuicaoBoleto() {
        return identificacaoDistribuicaoBoleto;
    }

    public void setIdentificacaoDistribuicaoBoleto(Long identificacaoDistribuicaoBoleto) {
        this.identificacaoDistribuicaoBoleto = identificacaoDistribuicaoBoleto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDateTime dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Long getTipoDesconto() {
        return tipoDesconto;
    }

    public void setTipoDesconto(Long tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }

    public Long getTipoMulta() {
        return tipoMulta;
    }

    public void setTipoMulta(Long tipoMulta) {
        this.tipoMulta = tipoMulta;
    }

    public Long getTipoJurosModa() {
        return tipoJurosModa;
    }

    public void setTipoJurosModa(Long tipoJurosModa) {
        this.tipoJurosModa = tipoJurosModa;
    }

    public Long getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(Long numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    public Pagador getPagador() {
        return pagador;
    }

    public void setPagador(Pagador pagador) {
        this.pagador = pagador;
    }
}
