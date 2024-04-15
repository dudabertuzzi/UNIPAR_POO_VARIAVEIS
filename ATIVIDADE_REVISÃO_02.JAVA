public class Produto {
    String nome;
    double preco;
    int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Caderno", 42.90, 20);
        Produto produto2 = new Produto("Caneta", 1.20, 50);

        System.out.println("Produto1:");
        produto1.exibirInformacoes();
        System.out.println();

        System.out.println("Produto2:");
        produto2.exibirInformacoes();
        System.out.println();
    }
}
