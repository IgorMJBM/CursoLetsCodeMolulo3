package Lista2;

public class CartaDeAtaqueEspecial extends CartaDeAtaque {
    private String efeito;

    public CartaDeAtaqueEspecial(String nome, String tipo, int custo, int poder, int resistencia) {
        super(nome, tipo, custo, poder, resistencia);
    }

    public String getEfeito() {
        return efeito;
    }
}
