public class Produto {
    // Atributos privados
    private int codigo;
    private String descricao;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor
    public Produto(int codigo, String descricao, double preco, int quantidadeEmEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Métodos de acesso (getters)
    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    // Método para adicionar estoque
    public void adicionarEstoque(int quantidade) {
        quantidadeEmEstoque += quantidade;
        System.out.println("Estoque adicionado: " + quantidade + " unidades.");
    }

    // Método para remover estoque
    public void removerEstoque(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.println("Estoque removido: " + quantidade + " unidades.");
        } else {
            System.out.println("Estoque insuficiente para remover a quantidade especificada.");
        }
    }
}


public class TesteProduto {
    public static void main(String[] args) {
        // Criando um produto
        Produto produto1 = new Produto(1, "Camiseta", 29.99, 50);

        // Adicionando estoque
        produto1.adicionarEstoque(20);

        // Removendo estoque
        produto1.removerEstoque(10);

        // Tentando remover mais estoque do que o disponível
        produto1.removerEstoque(100);
    }
}
