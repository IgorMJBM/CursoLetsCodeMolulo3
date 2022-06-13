package Lista3.domain.modelo;

import Lista3.domain.repositorio.Estoque;

public class Vendas implements IVendas{
    protected CaixaRegistradora cx;
    protected Estoque estoque;

    public Vendas(CaixaRegistradora cx, Estoque estoque) {
        this.cx = cx;
        this.estoque = estoque;
    }

    @Override
    public void vender(double valorVenda, int idProduto , Produto produto) {
        if (valorVenda == produto.getPreco()){
            cx.adicionaValoresAoCaixa(valorVenda);
            estoque.deletarPorId(idProduto);
        } else {
            System.out.println("Valor da venda incorreto!");
        }
    }
}
