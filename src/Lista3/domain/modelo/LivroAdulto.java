package Lista3.domain.modelo;

public class LivroAdulto extends Livro implements IProdutosAdultos{

    private boolean isAdulto;

    public LivroAdulto(String nome, int id, double preco, String[] genero, String escritor, String editora, boolean isAdulto) {
        super(nome, id, preco, genero, escritor, editora);
        this.isAdulto = isAdulto;
    }

    public boolean isAdulto() {
        return isAdulto;
    }

    @Override
    public Produto updateProduto(Produto produto, int id, double preco) {
        if (produto instanceof LivroAdulto livroAdulto){
            this.id = livroAdulto.getId();
            this.preco = livroAdulto.getPreco();
        }
        return produto;
    }


    @Override
    public boolean verificaAdulto() {
        return isAdulto;
    }
}
