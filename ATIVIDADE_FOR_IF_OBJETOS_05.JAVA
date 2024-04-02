// Classe Carro
public class Carro {
    // Variáveis de instância
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    // Construtor
    public Carro(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    // Métodos de acesso (getters e setters)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para exibir informações sobre o carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: R$" + preco);
    }
}

public class CarroTeste {
    public static void main(String[] args) {
        // Criando um objeto Carro
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 85000.0);

        // Exibindo as informações do carro
        System.out.println("Informações do Carro:");
        carro1.exibirInformacoes();

        // Alterando o preço do carro
        carro1.setPreco(80000.0);
        System.out.println("\nPreço atualizado do Carro:");
        System.out.println("Preço: R$" + carro1.getPreco());
    }
}
