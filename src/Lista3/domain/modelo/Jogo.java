package Lista3.domain.modelo;

import java.util.Arrays;

public class Jogo extends Produto{

    protected String distribuidora;
    protected String[] generos;
    protected String estudio;

    public Jogo(String nome, int id, double preco, String distribuidora, String[] generos, String estudio) {
        super(nome, id, preco);
        this.distribuidora = distribuidora;
        this.generos = generos;
        this.estudio = estudio;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public String[] getGeneros() {
        return generos;
    }

    public String getEstudio() {
        return estudio;
    }

    @Override
    public Produto updateProduto(Produto produto, int id, double preco) {
        if (produto instanceof Jogo jogo){
            this.id = jogo.getId();
            this.preco = jogo.getPreco();
        }
        return produto;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "distribuidora='" + distribuidora + '\'' +
                ", generos=" + Arrays.toString(generos) +
                ", estudio='" + estudio + '\'' +
                ", nome='" + nome + '\'' +
                ", id=" + id +
                ", preco=" + preco +
                '}';
    }
}
