package Lista2;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private int pontosDeVida = 20;
    private int quantidadeManaTurno;
    private List<CartaDeAtaque> deck = new ArrayList<>();

    public Jogador(String nome, int pontosDeVida, List<CartaDeAtaque> deck) {
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.deck = deck;
    }

    public String getNome() {
        return nome;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public List<CartaDeAtaque> getDeck() {
        return deck;
    }

    public int getQuantidadeManaTurno() {
        return quantidadeManaTurno;
    }
}
