import java.util.Date;

public class Pet {
    private Date dataNascimento;
    private String nome;
    private String especie;
    private String raca;

    public Pet(String nome, String especie, String raca, Date dataNascimento) {
        this.dataNascimento = dataNascimento;
	this.nome = nome;
	this.especie = especie;
	this.raca = raca;
    }

    public String getNome() {
        return nome;
    }
}

