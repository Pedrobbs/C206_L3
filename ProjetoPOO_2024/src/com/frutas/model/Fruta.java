package com.frutas.model;

public class Fruta implements IFruta {
    private String nome;
    private double preco;
    private String tipo;
    private int quantidade;

    public Fruta(String nome, double preco, String tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
        this.quantidade = 1; // Quantidade inicial padrão
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
