import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int numeroPedido;
    private List<ItemPedido> itens;
    private double valor_total_pedido;

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.itens = new ArrayList<>();
        this.valor_total_pedido = 0;
        
        // Os ItemPedido são criados dentro da classe Pedido
        itens.add(new ItemPedido("Hambúrguer", 25.00));
        itens.add(new ItemPedido("Batata Frita", 12.00));
        itens.add(new ItemPedido("Refrigerante", 7.00));

        calcularTotal();
    }

    private void calcularTotal() {
        valor_total_pedido = 0;

        for (ItemPedido item : itens) {
            valor_total_pedido += item.getPreco();
        }
    }

    public void exibirResumo() {

        System.out.println("===== RESUMO DO PEDIDO =====");
        System.out.println("Número do pedido: " + numeroPedido);
        System.out.println();

        System.out.println("Itens do pedido:");

        for (ItemPedido item : itens) {
            System.out.printf(
                "- %s: R$ %.2f%n",
                item.getNomePrato(),
                item.getPreco()
            );
        }

        System.out.println();
        System.out.printf(
            "Valor total: R$ %.2f%n",
            valor_total_pedido
        );

        System.out.println("============================");
    }
}