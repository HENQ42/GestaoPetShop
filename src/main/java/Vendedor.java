import java.utils.ArrayList;

public class Vendedor extends Funcionario {
    private ArrayList<Pedido> os = new ArrayList<>();	
    
    public Vendedor(String nome, String cpf, Endereco endereco, String matricula) {
        super(nome, cpf, endereco, matricula);
    }
    
 
    public void registrarPedido(Pedido p) {
        System.out.println("Vendedor " + getNome() + " (Matrícula: " + getMatricula() + ") registrou o pedido.");
	os.add(p);
	return;
    }

    public ArrayList<Pedido> getPedidos(){
	return os;
    }
}

