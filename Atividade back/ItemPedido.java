public class ItemPedido {

    private String nomePrato;
    private double preco;

    public ItemPedido(String nomePrato, double preco) {
        this.nomePrato = nomePrato;
        this.preco = preco;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public double getPreco() {
        return preco;
    }
}