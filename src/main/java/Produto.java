public class Produto {
    private String nome;                                                                              private double valorUnitario;
    private int estoque;
    private Categoria categoria;
    private Fabricante fabricante;

    public Produto(String nome, double valorUnitario, Categoria cat, Fabricante fab) {
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.categoria = cat;
        this.fabricante = fab;
        this.estoque = 0;
    }

    public double getValorUnitario() { return valorUnitario; }
    public String getNome() { return nome; }
}
