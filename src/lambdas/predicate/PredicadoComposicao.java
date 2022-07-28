package lambdas.predicate;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {
        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigistos = num -> num >= 100 && num <= 999;
        System.out.println(isPar.and(isTresDigistos).test(222));
        System.out.println(isPar.and(isTresDigistos).negate().test(222));
        System.out.println(isPar.or(isTresDigistos).test(221));
        System.out.println(isPar.or(isTresDigistos).test(21));
        System.out.println(isPar.or(isTresDigistos).test(22));
    }
}
