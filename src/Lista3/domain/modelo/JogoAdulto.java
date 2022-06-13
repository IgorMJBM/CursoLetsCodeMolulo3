package Lista3.domain.modelo;

public class JogoAdulto extends Jogo implements IProdutosAdultos{

    private boolean isAdulto;

    public JogoAdulto(String nome, int id, double preco, String distribuidora, String[] generos, String estudio, boolean isAdulto) {
        super(nome, id, preco, distribuidora, generos, estudio);
        this.isAdulto = isAdulto;
    }

    public boolean isAdulto() {
        return isAdulto;
    }

    @Override
    public Produto updateProduto(Produto produto, int id, double preco) {
        if (produto instanceof JogoAdulto jogoAdulto){
            this.id = jogoAdulto.getId();
            this.preco = jogoAdulto.getPreco();
        }
        return produto;
    }


    @Override
    public boolean verificaAdulto() {
        return isAdulto;
    }
}
