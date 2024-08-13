package Descontos;

public class PedidoEncomenda extends Pedido {
    private final double frete;
    private final String endereco;

    public PedidoEncomenda(int quantidade, double precoUnitario, Cliente cliente, MeioPagamento meioPagamento, double frete, String endereco) {
        super(quantidade, precoUnitario, cliente, meioPagamento);
        this.frete = frete;
        this.endereco = endereco;
    }

    @Override
    public double getAcrescimos() {
        return frete;
    }

    public double getFrete() {
        return frete;
    }

    public String getEndereco() {
        return endereco;
    }

    
}
