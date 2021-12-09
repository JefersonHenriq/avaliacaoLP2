
public class PessoaFisica extends Pessoa{

    private int rg, cpf;

    public PessoaFisica(String nome, String endereco, String cidade, String estado, int cep, int rg, int cpf) {

        super(nome, endereco, cidade, estado, cep);

        this.rg = rg;
        this.cpf = cpf;

    }

    public int getCpf() {

        return cpf;

    }

}
