package Descontos;

public final class DescontoGrandeQuantidade extends Desconto {
    private double porcentagem;
    private int quantidadeParaDesconto;

    public DescontoGrandeQuantidade(double porcentagem, int quantidadeParaDesconto, Pedido pedido) {
        super(pedido);
        this.porcentagem = porcentagem;
        this.quantidadeParaDesconto = quantidadeParaDesconto;
    }

    @Override
    public double getDesconto() {
        if (this.pedido.getQuantidade() > this.quantidadeParaDesconto) {
            return this.porcentagem * this.pedido.getPrecoTotal();
        }

        return 0;
    } 

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public void setQuantidadeParaDesconto(int quantidadeParaDesconto) {
        this.quantidadeParaDesconto = quantidadeParaDesconto;
    }
}
