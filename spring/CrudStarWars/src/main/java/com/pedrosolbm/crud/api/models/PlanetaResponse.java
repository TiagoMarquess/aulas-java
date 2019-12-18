package com.pedrosolbm.crud.api.models;

public class PlanetaResponse {

    private String id;
    private String nome;
    private String clima;
    private String terreno;
    private int aparicoes;

    public PlanetaResponse(String id, String nome, String clima, String terreno, int aparicoes) {
        this.id = id;
        this.nome = nome;
        this.clima = clima;
        this.terreno = terreno;
        this.aparicoes = aparicoes;
    }

}