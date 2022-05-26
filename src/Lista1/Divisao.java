package Lista1;

public class Divisao implements Calculo{
    @Override
    public void calcular(double primeiroNumero, double sgundoNumero) {
        double resultado = primeiroNumero / sgundoNumero;
        System.out.println("O resultado da soma é " + resultado);
    }
}
