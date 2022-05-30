package Lista2;

import java.util.ArrayList;
import java.util.List;

public class TabuleiroVersus implements ITabuleiro {

    private List<Jogador> listaDeJogadores = new ArrayList<>(2);
    private List<CartaDeAtaque[]> decksDosJogadores = new ArrayList<>(2);

    private List<CartaDeAtaque> campoCartasDeAtaque = new ArrayList<>(5);
    private List<CartaDeAtaqueEspecial> campoCartasDeAtaqueEspecial = new ArrayList<>(2);

    public TabuleiroVersus(List<Jogador> listaDeJogadores) {
        this.listaDeJogadores = listaDeJogadores;
        for (Jogador j : listaDeJogadores) {
            decksDosJogadores.add((CartaDeAtaque) j.getDeck());
        }
    }

    @Override
    public void inserirDeck(List<CartaDeAtaque> deck) {
        System.out.println("Deck inserido com sucesso!");
    }

    @Override
    public boolean podeJogar(CartaDeAtaque carta, Jogador jogador) {
        adicionaAoCampo(carta);
        return jogador.getQuantidadeManaTurno() == carta.custo;
    }

    @Override
    public void ganhou(Jogador jogador, Jogador jogador2) {
        removeJogadoresPerdedores();
        if (listaDeJogadores.size() == 0){
            System.out.println("O VENCEDOR É " + jogador.getNome());
        }
    }

    public void verificaTamanhoTotalDeck(Jogador jogador){
        for (Jogador j: listaDeJogadores) {
            if (j.getDeck().size() > 50){
                listaDeJogadores.remove(j);
                System.out.println("O jogador " + j.getNome() + " Está com o deck maior do que o tamanho máximo desejado!");;
            }
        }
    }

    @Override
    public void removeJogadoresPerdedores() {
        for (Jogador j: listaDeJogadores) {
            if (j.getPontosDeVida() == 0){
                listaDeJogadores.remove(j);
            }
        }
    }


    public void adicionaAoCampo(CartaDeAtaque carta){
        if (carta instanceof CartaDeAtaqueEspecial){
            if (campoCartasDeAtaqueEspecial.size() <= 2){
                campoCartasDeAtaqueEspecial.add((CartaDeAtaqueEspecial) carta);
            } else {
                System.out.println("LIMITE MÁXIMO DE CARTAS NO CAMPO");
            }
        } else {
            if (campoCartasDeAtaque.size() <= 5){
                campoCartasDeAtaque.add(carta);
            } else {
                System.out.println("LIMITE MÁXIMO DE CARTAS NO CAMPO");
            }

        }
    }
}
