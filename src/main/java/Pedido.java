
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private Vendedor vendedor;
    private Empresa empresa;
    private TipoPagamento pagamento;
    
    
    private List<ItemPedido> itens; 
    private double valorTotal;

    public Pedido(Cliente cliente, Vendedor vendedor, Empresa empresa) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.empresa = empresa;
        this.itens = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public void adicionarItem(Produto p, int quantidade) {
        ItemPedido item = new ItemPedido(p, quantidade);
        this.itens.add(item);
        this.valorTotal += item.getSubtotal();
        System.out.println("Adicionado: " + quantidade + "x " + p.getNome());
    }

    public void setPagamento(TipoPagamento pagamento) {
        this.pagamento = pagamento;
    }
    
    public double getValorTotal() {
        return valorTotal;
    }

    public void getDetalhes(){
	    for(ItemPedido item : itens){
		System.out.println("\nProduto: " + item.getNomePedido + "\nQuantidade: " + item.getQuantidade + "\n");
	    }
    }
}

