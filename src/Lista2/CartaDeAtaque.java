package Lista2;

public class CartaDeAtaque implements ICarta{
    protected String nome, tipo;
    protected int custo, poder,resistencia;

    public CartaDeAtaque(String nome, String tipo, int custo, int poder, int resistencia) {
        this.nome = nome;
        this.tipo = tipo;
        this.custo = custo;
        this.poder = poder;
        this.resistencia = resistencia;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getType() {
        return tipo;
    }

    @Override
    public int getCusto() {
        return custo;
    }

    public int getPoder() {
        return poder;
    }

    public int getResistencia() {
        return resistencia;
    }
}
