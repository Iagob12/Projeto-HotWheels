package com.api.hotwheels.dto;

import com.api.hotwheels.entities.StatusDoTipo;

public class CarroDTO {

    private Long id;
    private String nome;
    private String anoFabricacao;
    private String serie;
    private String numeroColecao;
    private StatusDoTipo status;
    private boolean favorito;
    private String imagem;

    public CarroDTO() {
    }

    public CarroDTO(Long id, String nome, String anoFabricacao, String serie, String numeroColecao, StatusDoTipo status, boolean favorito, String imagem) {
        this.id = id;
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
        this.serie = serie;
        this.numeroColecao = numeroColecao;
        this.status = status;
        this.favorito = favorito;
        this.imagem = imagem;
    }

    public CarroDTO(CarroDTO carroDTO) {
        this.id = carroDTO.getId();
        this.nome = carroDTO.getNome();
        this.anoFabricacao = carroDTO.getAnoFabricacao();
        this.serie = carroDTO.getSerie();
        this.numeroColecao = carroDTO.getNumeroColecao();
        this.status = carroDTO.getStatus();
        this.favorito = carroDTO.isFavorito();
        this.imagem = carroDTO.getImagem();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumeroColecao() {
        return numeroColecao;
    }

    public void setNumeroColecao(String numeroColecao) {
        this.numeroColecao = numeroColecao;
    }

    public StatusDoTipo getStatus() {
        return status;
    }

    public void setStatus(StatusDoTipo status) {
        this.status = status;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}