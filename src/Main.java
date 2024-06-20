public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("Mayara", "Coelho");
        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente1);

        cc.depositar(100);
        cc.transferir(20, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        banco.listarContas();

    }
}
