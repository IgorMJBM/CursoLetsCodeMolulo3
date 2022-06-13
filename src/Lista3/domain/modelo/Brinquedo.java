package Lista3.domain.modelo;

public class Brinquedo extends Produto{

    protected String tipo;

    public Brinquedo(String nome, int id, double preco, String tipo) {
        super(nome, id, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public Produto updateProduto(Produto produto, int id, double preco) {
        if (produto instanceof Brinquedo brinquedo){
            this.id = brinquedo.getId();
            this.preco = brinquedo.getPreco();
        }
        return produto;
    }

    @Override
    public String toString() {
        return "Brinquedo{" +
                "tipo='" + tipo + '\'' +
                ", nome='" + nome + '\'' +
                ", id=" + id +
                ", preco=" + preco +
                '}';
    }
}
