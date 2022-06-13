package Lista3.domain.modelo;

import java.util.Arrays;

public class AlbumDeMusica extends Produto{

    protected String[] bandas;
    protected String[] generos;
    protected String[] selos;

    public AlbumDeMusica(String nome, int id, double preco, String[] bandas, String[] generos, String[] selos) {
        super(nome, id, preco);
        this.bandas = bandas;
        this.generos = generos;
        this.selos = selos;
    }

    public String[] getBandas() {
        return bandas;
    }

    public String[] getGeneros() {
        return generos;
    }

    public String[] getSelos() {
        return selos;
    }

    @Override
    public Produto updateProduto(Produto produto, int id, double preco) {
        if (produto instanceof AlbumDeMusica albumDeMusica){
            this.id = albumDeMusica.getId();
            this.preco = albumDeMusica.getPreco();
        }
        return produto;
    }

    @Override
    public String toString() {
        return "AlbumDeMusica{" +
                "bandas=" + Arrays.toString(bandas) +
                ", generos=" + Arrays.toString(generos) +
                ", selos=" + Arrays.toString(selos) +
                ", nome='" + nome + '\'' +
                ", id=" + id +
                ", preco=" + preco +
                '}';
    }
}
