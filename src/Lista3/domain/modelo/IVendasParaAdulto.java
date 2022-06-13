package Lista3.domain.modelo;

public interface IVendasParaAdulto {
    public void verificarIdadeCliente(Cliente cliente);

    public void vendasParaAdulto(double valorVenda, int idProduto, Produto produto, Cliente cliente, double valorPago);
}
