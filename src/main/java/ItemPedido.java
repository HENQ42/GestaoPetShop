
public class ItemPedido {
    private Produto produto;
    private int quantidade;
    private double valorUnitario;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = produto.getValorUnitario();
    }

    public double getSubtotal() {
        return this.quantidade * this.valorUnitario;
    }

    public String getNomePedido(){
	return produto.getNome();
    }

    public int getQuantidade(){
	return quantidade;
    }
}
