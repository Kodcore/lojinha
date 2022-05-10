package pojo;

public class ItemIncluso {
    private String nomeItem;
    public int quantidade;

    public ItemIncluso(String nomeInicial, int quantidadeInicial){
        this.nomeItem = nomeInicial;
        this.quantidade = quantidadeInicial;

    }

    public String getNomeItem() {
        return nomeItem;
    }
    public int getQuantidade() {
        return quantidade;
    }
}
