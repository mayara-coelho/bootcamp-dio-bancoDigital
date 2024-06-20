import java.util.Random;

public abstract class Conta {

    private static int AGENCIA_PADRAO = 1;
    private static Random random = new Random();

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = random.nextInt(1000);
        this.cliente = cliente;
        Banco.adicionarConta(this);
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta ===");
        System.out.println(String.format("Titular: %s", cliente.getNome() + " " + cliente.getSobrenome()));
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Numero: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta agencia: " + agencia + ", numero: " + numero + ", cliente: " + cliente;
    }

    
}
