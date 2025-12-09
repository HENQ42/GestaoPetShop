
public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private Endereco endereco;

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() { return nome; }
}
