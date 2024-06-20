import java.util.ArrayList;
import java.util.List;

public class Banco {
    private static List<Conta> contasBanco = new ArrayList<>();

    public static void adicionarConta(Conta conta) {
        contasBanco.add(conta);
    }

    public void listarContas() {
        System.out.println(contasBanco);
    }


}
