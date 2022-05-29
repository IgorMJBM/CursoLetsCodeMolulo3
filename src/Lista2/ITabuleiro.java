package Lista2;

import java.util.List;

public interface ITabuleiro {
    void inserirDeck(List<CartaDeAtaque> deck);
    boolean podeJogar(CartaDeAtaque carta, Jogador jogador);
    void ganhou(Jogador jogador,Jogador jogador2);
    void verificaTamanhoTotalDeck(Jogador jogador);
    void removeJogadoresPerdedores();
}
