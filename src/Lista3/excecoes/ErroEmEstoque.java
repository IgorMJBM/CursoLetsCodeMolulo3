package Lista3.excecoes;

public class ErroEmEstoque extends RuntimeException{
    public ErroEmEstoque(String message) {
        super(message);
    }
}
