package Lista1;

public class Calculadora {
    private Soma soma= new Soma();
    private Subtracao subtracao = new Subtracao();
    private Divisao divisao = new Divisao();
    private Multiplicacao multiplicacao = new Multiplicacao();

    public void somar(double primeiroN, double segundoN){
        soma.calcular(primeiroN ,segundoN);
    }

    public void subtrair(double primeiroN, double segundoN){
        subtracao.calcular(primeiroN ,segundoN);
    }

    public void dividir(double primeiroN, double segundoN){
        divisao.calcular(primeiroN ,segundoN);
    }

    public void multiplicar(double primeiroN, double segundoN){
        multiplicacao.calcular(primeiroN ,segundoN);
    }
}
