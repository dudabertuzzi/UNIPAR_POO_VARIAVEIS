public class ContaBancaria {
    // Atributos privados
    private double saldo;
    private String numeroConta;

    // Construtor
    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0; // Inicializando o saldo como zero
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    // Método para consultar o saldo da conta
    public double consultarSaldo() {
        return saldo;
    }
}


public class TesteContaBancaria {
    public static void main(String[] args) {
        // Criando uma conta bancária
        ContaBancaria minhaConta = new ContaBancaria("123456");

        // Depositando dinheiro
        minhaConta.depositar(1000.0);

        // Consultando saldo
        System.out.println("Saldo atual: R$" + minhaConta.consultarSaldo());

        // Sacando dinheiro
        minhaConta.sacar(500.0);

        // Consultando saldo novamente
        System.out.println("Saldo atual: R$" + minhaConta.consultarSaldo());

        // Tentando sacar mais do que o saldo disponível
        minhaConta.sacar(600.0);
    }
}
