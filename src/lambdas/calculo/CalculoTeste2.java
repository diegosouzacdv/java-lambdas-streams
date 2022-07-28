package lambdas.calculo;

public class CalculoTeste2 {

    public static void main(String[] args) {
        Calculo soma = (x, y) -> {return x + y;};
        Calculo multiplicar = (x,y) -> x * y;

        System.out.println(soma.executar(5,3));
        System.out.println(multiplicar.executar(5,3));
    }
}
