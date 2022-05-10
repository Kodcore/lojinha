package pojo;

import enums.Tamanho;

import java.util.List;

public class Produto {
    public String nome;
    public String marca;
    public Tamanho tamanho;
    private double valor;
    private List<ItemIncluso> itensInclusos;

    public Produto(String marcaInicial, Tamanho tamanhoInicial){
        this.marca= marcaInicial;
        this.tamanho = tamanhoInicial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Tamanho getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(Tamanho novoTamanho) {
            this.tamanho = novoTamanho;
    }

    public double getValor(){
        return this.valor;
    }
    public void setValor(double novoValor){
        if (novoValor >= 0){
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que 0");
        }
    }

    public List<ItemIncluso> getItensInclusos() {
        return itensInclusos;
    }
    public void setItensInclusos(List<ItemIncluso> itensInclusos) {
        this.itensInclusos = itensInclusos;
    }

}
