package Lista3.domain.modelo;

import java.util.Arrays;

public class Livro extends Produto{

    protected String[] genero;
    protected String escritor;
    protected String editora;

    public Livro(String nome, int id, double preco, String[] genero, String escritor, String editora) {
        super(nome, id, preco);
        this.genero = genero;
        this.escritor = escritor;
        this.editora = editora;
    }

    @Override
    public Produto updateProduto(Produto produto, int id, double preco) {
        if(produto instanceof Livro livro){
            super.id = livro.getId();
            super.preco = livro.getPreco();
        }
        return produto;
    }

    public String[] getGenero() {
        return genero;
    }

    public String getEscritor() {
        return escritor;
    }

    public String getEditora() {
        return editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "genero=" + Arrays.toString(genero) +
                ", escritor='" + escritor + '\'' +
                ", editora='" + editora + '\'' +
                ", nome='" + nome + '\'' +
                ", id=" + id +
                ", preco=" + preco +
                '}';
    }
}
