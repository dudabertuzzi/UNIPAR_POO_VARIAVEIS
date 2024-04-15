// class Produto

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0;
        this.quantidadeEmEstoque = 0;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = 0;
    }

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirCaracteristicas() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }
}

// class Main

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do produto:");
        String nome1 = scanner.nextLine();
        Produto produto1 = new Produto(nome1);

        System.out.println("Informe o nome do produto:");
        String nome2 = scanner.nextLine();
        System.out.println("Informe o preço do produto:");
        double preco2 = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner
        Produto produto2 = new Produto(nome2, preco2);

        System.out.println("Informe o nome do produto:");
        String nome3 = scanner.nextLine();
        System.out.println("Informe o preço do produto:");
        double preco3 = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println("Informe a quantidade em estoque do produto:");
        int quantidade3 = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        Produto produto3 = new Produto(nome3, preco3, quantidade3);

        System.out.println("\nCaracterísticas dos Produtos Criados:");
        System.out.println("Produto 1:");
        produto1.exibirCaracteristicas();
        System.out.println("\nProduto 2:");
        produto2.exibirCaracteristicas();
        System.out.println("\nProduto 3:");
        produto3.exibirCaracteristicas();

        scanner.close();
    }
}
