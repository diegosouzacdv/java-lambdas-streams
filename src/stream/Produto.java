package stream;

public class Produto {

    final String nome;
    final double preco;
    final double desconto;
    final double valorFrete;

    public Produto(String nome, double preco, double desconto, double valorFrete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.valorFrete = valorFrete;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getValorFrete() {
        return valorFrete;
    }
}
