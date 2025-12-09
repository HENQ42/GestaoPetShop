public class Endereco {
    private String logradouro;
    private int numero;
    private String cidade;                                                                            private String uf;

    public Endereco(String logradouro, int numero, String cidade, String uf) {                            this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
    }
}
