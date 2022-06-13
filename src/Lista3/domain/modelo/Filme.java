package Lista3.domain.modelo;

import java.util.Arrays;

public class Filme extends Produto{
    protected String estudio;
    protected String[] diretores;
    protected String[] generos;
    protected String[] produtores;

    public Filme(String nome, int id, double preco, String estudio, String[] diretores, String[] generos, String[] produtores) {
        super(nome, id, preco);
        this.estudio = estudio;
        this.diretores = diretores;
        this.generos = generos;
        this.produtores = produtores;
    }


    public String getEstudio() {
        return estudio;
    }

    public String[] getDiretores() {
        return diretores;
    }

    public String[] getGeneros() {
        return generos;
    }

    public String[] getProdutores() {
        return produtores;
    }

    @Override
    public Produto updateProduto(Produto produto, int id, double preco) {
        if (produto instanceof Filme filme){
            this.id = filme.getId();
            this.preco = filme.getPreco();
        }
        return produto;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "estudio='" + estudio + '\'' +
                ", diretores=" + Arrays.toString(diretores) +
                ", generos=" + Arrays.toString(generos) +
                ", produtores=" + Arrays.toString(produtores) +
                ", nome='" + nome + '\'' +
                ", id=" + id +
                ", preco=" + preco +
                '}';
    }
}
