public class Carro {
  private String modelo;
  private String marca;
  private String cor;
  private int ano;

  public Carro(String modelo, String marca, String cor, int ano) {
    this.modelo = modelo;
    this.marca = marca;
    this.cor = cor;
    this.ano = ano;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public void exibirInformacoes() {
    System.out.println("Modelo: " + modelo);
    System.out.println("Marca: " + marca);
    System.out.println("Cor: " + cor);
    System.out.println("Ano: " + ano);
  }

  public static void main(String[] args) {
    Carro carro1 = new Carro("Corolla", "Toyota", "Azul Marinho", 2004);
    Carro carro2 = new Carro("Amarok", "Volkswagen", "Prata", 2014);

    System.out.println("Carro 1:");
    carro1.exibirInformacoes();
    System.out.println();

    System.out.println("Carro 2:");
    carro2.exibirInformacoes();
    System.out.println();
  }
}
