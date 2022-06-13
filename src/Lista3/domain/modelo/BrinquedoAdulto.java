package Lista3.domain.modelo;

public class BrinquedoAdulto extends Brinquedo implements IProdutosAdultos{

    private boolean isAdulto;

    public BrinquedoAdulto(String nome, int id, double preco, String tipo, boolean isAdulto) {
        super(nome, id, preco, tipo);
        this.isAdulto = isAdulto;
    }

    public boolean isAdulto() {
        return isAdulto;
    }

    @Override
    public Produto updateProduto(Produto produto, int id, double preco) {
        if (produto instanceof BrinquedoAdulto brinquedoAdulto){
            this.id = brinquedoAdulto.getId();
            this.preco = brinquedoAdulto.getPreco();
        }
        return produto;
    }


    @Override
    public boolean verificaAdulto() {
        return isAdulto;
    }
}
