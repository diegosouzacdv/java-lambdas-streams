package lambdas.consumer;

import lambdas.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.getNome());
        Produto p1 = new Produto("Caneta", 12.34, 0.09);
        Produto p2 = new Produto("Notebook", 2987.99, 0.25);
        Produto p3 = new Produto("Caderno", 7.84, 0.03);
        Produto p4 = new Produto("Borracha", 4.39, 0.18);
        imprimir.accept(p1);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
        produtos.forEach(imprimir);
        produtos.forEach(System.out::println);
    }
}
