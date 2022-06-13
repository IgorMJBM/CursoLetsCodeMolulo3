package Lista3.domain.repositorio;

import Lista3.domain.modelo.Produto;
import Lista3.excecoes.ErroEmEstoque;

import java.util.ArrayList;
import java.util.List;

public class Estoque implements ICrud {

    private final List<Produto> estoque = new ArrayList<>();

    private static final String MENSAGEM_NADA_ENCONTRADO = "ID DE PRODUTO NÃO ENCONTRADO";

    @Override
    public void salvarProduto(Produto produto){
        estoque.add(produto);
    }

    @Override
    public void adicionarListaDeProduto(List<Produto> entities){
        estoque.addAll(entities);
    }

    @Override
    public List<Produto> acharTodos(){
        if (estoque.isEmpty()){
            throw new ErroEmEstoque("Nada consta em estoque");
        }
        return estoque;
    }

    @Override
    public Produto acharPorId(int id){
        return estoque.stream()
                .filter(Produto -> Produto.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ErroEmEstoque(MENSAGEM_NADA_ENCONTRADO));
    }

    @Override
    public void deletarPorId(int id){
        estoque.remove(estoque.stream()
                .filter(Produto -> Produto.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ErroEmEstoque(MENSAGEM_NADA_ENCONTRADO)));
    }

    @Override
    public void deletarTodos(List<Produto> Produtos){
        estoque.removeAll(Produtos);
    }

    @Override
    public <T extends Produto> Produto modificarPorId(int id, T produto, int novoId, double preco){
        return estoque.stream()
                .filter(Produto -> Produto.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ErroEmEstoque(MENSAGEM_NADA_ENCONTRADO))
                .updateProduto(produto, novoId, preco);
    }

    @Override
    public <T extends Produto> List<Produto> acharPorCategoria(T produto){
        return estoque.stream()
                .filter(Produto -> Produto.getClass().isInstance(produto))
                .toList();
    }
}