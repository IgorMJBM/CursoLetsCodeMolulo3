package Lista3.domain.modelo;

public abstract class Produto {

    protected String nome;
    protected int id;
    protected double preco;

    public Produto(String nome, int id, double preco) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }

    public abstract Produto updateProduto(Produto produto, int id, double preco);

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getPreco() {
        return preco;
    }
}
