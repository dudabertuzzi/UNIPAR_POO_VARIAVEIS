public class ControleEstoque {
    public static void main(String[] args) {
     
        String nomeProduto;
        double precoProduto;
        int quantidadeProduto;
        String marcaProduto;
        
        precoProduto = 29.99;
        quantidadeProduto = 10;
        marcaProduto = "true";
        nomeProduto = "Fone de Ouvido";
        
        
        System.out.println("Dados do Produto");
        System.out.println("Nome: " + nomeProduto);
        System.out.println("Marca: " + marcaProduto);
        System.out.println("Preco: $" + precoProduto);
        System.out.println("Quantidade em estoque: " + quantidadeProduto);
    }
}
