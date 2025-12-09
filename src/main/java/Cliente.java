import java.util.Date;
import java.utils.ArrayList;

public class Cliente extends Pessoa {
    private Date dataNascimento;
    private ArrayList<Pet> pets = new ArrayList<>();
    public Cliente(String nome, String cpf, Endereco endereco, Date dataNascimento) {
        super(nome, cpf, endereco);
        this.dataNascimento = dataNascimento;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void addPet(Pet pet){
    	pet.add(pet);
	return;
    }
}

