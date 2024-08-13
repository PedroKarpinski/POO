package Descontos;

public final class DescontoCompreAlgunsGanheUm extends Desconto {
    private final int quantidadeMinima;

    public DescontoCompreAlgunsGanheUm(Pedido pedido, int quantidadeMinima) {
        super(pedido);
        this.quantidadeMinima = quantidadeMinima;
    }

    @Override
    public double getDesconto() {
        return pedido.getQuantidade() / quantidadeMinima * pedido.getPrecoUnitario();
    }
}
