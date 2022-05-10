package lojinha;

import enums.Tamanho;
import pojo.ItemIncluso;
import pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Sony", Tamanho.PEQUENO);

        meuProduto.setNome("PlayStation 4");
        meuProduto.setValor(79.99);

        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
        itensInclusos.add(primeiroItemIncluso);//0

        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogo", 3);
        itensInclusos.add(segundoItemIncluso);//1

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabo de energia", 2);
        itensInclusos.add(terceiroItemIncluso);//2

        meuProduto.setItensInclusos(itensInclusos);


        System.out.println("Iniciando a listagem de itens: ");

        //laço de repetição
        for (ItemIncluso itemAtual : meuProduto.getItensInclusos()){
            System.out.println(itemAtual.getNomeItem());
            System.out.println(itemAtual.getQuantidade());
        }

        System.out.println("Acabaram-se os itens");

    }
}
