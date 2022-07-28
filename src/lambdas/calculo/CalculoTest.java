package lambdas.calculo;

public class CalculoTest {
    public static void main(String[] args) {
        Calculo somar = new Soma();
        Calculo multiplicar = new Multiplicar();

        System.out.println(somar.executar(2, 3));

        System.out.println(multiplicar.executar(2, 3));
    }
}
