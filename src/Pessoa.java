import java.lang.reflect.Constructor;

public class Pessoa {

    private String nome, endereco, cidade, estado;
    private int cep;

    public Pessoa(String nome, String endereco, String cidade, String estado, int cep) {

        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;

    }

    public String getNome() {

        return nome;

    }

}
