package Lista3.domain.modelo;

import Lista3.domain.repositorio.Estoque;

import java.time.LocalDate;

public class VendasParaAdultos implements IVendasParaAdulto, IDescontoProdutos{
    protected CaixaRegistradora cx;
    protected Estoque estoque;

    public VendasParaAdultos(CaixaRegistradora cx, Estoque estoque) {
        this.cx = cx;
        this.estoque = estoque;
    }

    @Override
    public void verificarIdadeCliente(Cliente cliente){
        if(cliente.getBirthdate().getYear() - LocalDate.EPOCH.getYear() < 18){
            throw new RuntimeException("VENDA NÃO PODE SER EFETUADO O MESNO NÃO É MAIOR DE IDADE");
        }
    }

    @Override
    public void vendasParaAdulto(double valorVenda, int idProduto, Produto produto, Cliente cliente, double valorPago) {
        verificarIdadeCliente(cliente);
        descontoEmLivros(produto,valorVenda);
        if (valorPago == valorVenda){
            cx.adicionaValoresAoCaixa(valorPago);
            estoque.deletarPorId(idProduto);
        } else {
            System.out.println("Valor da venda incorreto!");
        }

    }

    @Override
    public double descontoEmLivros(Produto produto, double valorVenda) {
        if (produto instanceof Livro livro){
            valorVenda = livro.getPreco() * 0.15;
        }
        return valorVenda;
    }
}
