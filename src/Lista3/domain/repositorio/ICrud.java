package Lista3.domain.repositorio;

import Lista3.domain.modelo.Produto;

import java.util.List;

public interface ICrud {
    void salvarProduto(Produto entity);
    void adicionarListaDeProduto(List<Produto> entities);
    List<Produto> acharTodos();
    Produto acharPorId(int id);
    void deletarPorId(int id);
    void deletarTodos(List<Produto> Produtos);
    <T extends Produto> Produto modificarPorId(int id, T entity, int novoId, double preco);
    <T extends Produto> List<Produto> acharPorCategoria(T entity);
}
