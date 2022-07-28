package lambdas.calculo;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

    public static void main(String[] args) {
        BinaryOperator<Double> calc = (x, y) -> {return x + y;};
        System.out.println(calc.apply(5.0,3.0));

    }
}
