public class PessoaJuridica extends Pessoa{

    private int cnpj;

    public PessoaJuridica(String nome, String endereco, String cidade, String estado, int cep, int cnpj) {

        super(nome, endereco, cidade, estado, cep);

        this.cnpj = cnpj;

    }

    public int getCnpj() {

        return cnpj;

    }

}
