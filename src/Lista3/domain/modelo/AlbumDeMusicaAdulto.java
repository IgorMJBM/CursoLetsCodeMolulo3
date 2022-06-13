package Lista3.domain.modelo;

import java.util.Arrays;

public class AlbumDeMusicaAdulto extends AlbumDeMusica implements IProdutosAdultos{

    private boolean isAdulto;

    public AlbumDeMusicaAdulto(String nome, int id, double preco, String[] bandas, String[] generos, String[] selos, boolean eAdulto) {
        super(nome, id, preco, bandas, generos, selos);
        this.isAdulto = eAdulto;
    }

    public boolean isAdulto() {
        return isAdulto;
    }

    @Override
    public Produto updateProduto(Produto produto, int id, double preco) {
        if (produto instanceof AlbumDeMusicaAdulto albumDeMusicaAdulto){
            this.id = albumDeMusicaAdulto.getId();
            this.preco = albumDeMusicaAdulto.getPreco();
        }
        return produto;
    }

    @Override
    public String toString() {
        return "AlbumDeMusicaAdulto{" +
                "eAdulto=" + isAdulto +
                ", bandas=" + Arrays.toString(bandas) +
                ", generos=" + Arrays.toString(generos) +
                ", selos=" + Arrays.toString(selos) +
                ", nome='" + nome + '\'' +
                ", id=" + id +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean verificaAdulto() {
        return isAdulto();
    }
}
