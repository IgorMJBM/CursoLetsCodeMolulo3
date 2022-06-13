package Lista3.domain.modelo;

public class FilmeAdulto extends Filme implements IProdutosAdultos{

    private boolean isAdulto;

    public FilmeAdulto(String nome, int id, double preco, String estudio, String[] diretores, String[] generos, String[] produtores, boolean isAdulto) {
        super(nome, id, preco, estudio, diretores, generos, produtores);
        this.isAdulto = isAdulto;
    }

    public boolean isAdulto() {
        return isAdulto;
    }

    @Override
    public Produto updateProduto(Produto produto, int id, double preco) {
        if (produto instanceof FilmeAdulto filmeAdulto){
            this.id = filmeAdulto.getId();
            this.preco = filmeAdulto.getPreco();
        }
        return produto;
    }


    @Override
    public boolean verificaAdulto() {
        return isAdulto;
    }
}
