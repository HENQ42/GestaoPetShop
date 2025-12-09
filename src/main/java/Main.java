import java.util.Date;
public class Main {
    public static void main(String[] args) {
      
	
        Endereco endLoja = new Endereco("Avenida Goias", 100, "Goiânia", "GO");
        Endereco endCli = new Endereco("Endereco 2", 50, "Goiânia", "GO");
        
        Empresa minhaLoja = new Empresa("Pet Shop", "00.000/0001-00", endLoja);


        Vendedor vendedor = new Vendedor("Carlao", "123.456.789-00", endLoja, "V-01");
        Cliente cliente = new Cliente("Joao", "111.111.111-11", endCli, new Date());

        
	Categoria catAlimentos = new Categoria("Alimentos");
        Categoria catAcessorios = new Categoria("Acessorios"); //alimentação e acessorios
        Fabricante fabCasaDosAnimais = new Fabricante("Casa dos Animais");
        
        Produto racao = new Produto("Ração", 50.00, catAlimentos, fabCasaDosAnimais);
        Produto brinquedo = new Produto("Brinquedo", 150.00, catAcessorios, fabCasaDosAnimais);

        
        Pedido pedido01 = new Pedido(cliente, vendedor, minhaLoja);
        
        pedido01.adicionarItem(racao, 2);
        pedido01.adicionarItem(brinquedo, 1);
        
        
        TipoPagamento pix = new TipoPagamento("Pix");
        pedido01.setPagamento(pix);
        
        
        vendedor.registrarPedido(pedido01);


	//falta implementar logica de for loop;
        //(vendedor.getPedidos()).getDetalhe;
    }
}

